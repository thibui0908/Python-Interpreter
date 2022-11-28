package python.executor;

import org.stringtemplate.v4.compiler.CodeGenerator.region_return;

import com.ibm.icu.impl.TextTrieMap.Output;

import python.antlr.PythonBaseVisitor;
import python.antlr.PythonParser.Assignment_stmtContext;
import python.antlr.PythonParser.ExprContext;
import python.antlr.PythonParser.NumberContext;
import python.antlr.PythonParser.Print_stmtContext;
import python.antlr.PythonParser.TestContext;
import python.antlr.PythonParser.While_stmtContext;

public class Executor extends PythonBaseVisitor<Object> {
    private SymTab table;

    public Executor() {
        table = new SymTab();
    }

    @Override
    public Object visitAssignment_stmt(Assignment_stmtContext ctx) {
        String variable = ctx.NAME().getText();
        Object data = visit(ctx.expr());
        table.put(variable, new SymEntry(variable, data));
        return null;
    }

    @Override
    public Object visitPrint_stmt(Print_stmtContext ctx) {
        Object ouput = visit(ctx.expr() != null ? ctx.expr() : ctx.STRING());
        System.out.println(ouput);
        return null;
    }

    @Override
    public Object visitExpr(ExprContext ctx) {
        if (ctx.number() != null)
            return visit(ctx.number());
        else if (ctx.NAME() != null)
            return table.get(ctx.NAME().getText()).data;
        else if (ctx.expr().size() == 1) {
            return visit(ctx.expr(0));
        }
        Object operand1 = visit(ctx.expr(0));
        for (int i = 1; i < ctx.expr().size(); i++) {
            String op = ctx.add_op(i - 1).getText();
            Object operand2 = visit(ctx.expr(i));
            if (operand1 instanceof Long) {
                operand1 = op.equals("+")
                        ? (Long) operand1 + (Long) operand2
                        : (Long) operand1 - (Long) operand2;
            } else if (operand1 instanceof Double) {
                operand1 = op.equals("+")
                        ? (Double) operand1 + (Double) operand2
                        : (Double) operand1 - (Double) operand2;
            } else {
                operand1 = (String) operand1 + (String) operand2;
            }
        }
        return operand1;
    }

    @Override
    public Object visitNumber(NumberContext ctx) {
        if (ctx.FLOAT() != null)
            return Double.parseDouble(ctx.FLOAT().getText());
        return Long.parseLong(ctx.INTEGER().getText());
    }

    @Override
    public Object visitTest(TestContext ctx) {
        Object operand1 = visit(ctx.expr(0));
        for (int i = 1; i < ctx.expr().size(); i++) {
            String operator = ctx.comp_op(i - 1).getText();
            Object operand2 = visit(ctx.expr(i));
            switch (operator) {
                case "==":
                    operand1 = operand1.equals(operand2);
                    break;
                case "!=":
                    operand1 = !operand1.equals(operand2);
                    break;
                case ">=":
                    operand1 = (double) operand1 >= (double) operand2;
                    break;
                case "<=":
                    operand1 = (double) operand1 <= (double) operand2;
                    break;
            }
        }
        return operand1;
    }

    @Override
    public Object visitWhile_stmt(While_stmtContext ctx) {
        boolean test = (boolean) visit(ctx.test());
        while (test) {
            visit(ctx.suite());
            test = (boolean) visit(ctx.test());
        }
        return null;
    }

}
