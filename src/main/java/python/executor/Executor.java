package python.executor;

import java.util.ArrayList;

import python.antlr.PythonBaseVisitor;
import python.antlr.PythonParser.Assignment_stmtContext;
import python.antlr.PythonParser.ExprContext;
import python.antlr.PythonParser.ListContext;
import python.antlr.PythonParser.Print_stmtContext;
import python.antlr.PythonParser.TestContext;
import python.antlr.PythonParser.While_stmtContext;
import python.intermediate.SymEntry;
import python.intermediate.SymStack;
import python.type.Typespec;

public class Executor extends PythonBaseVisitor<Object> {
    private SymStack stack;

    public Executor() {
        stack = new SymStack();
    }

    @Override
    public Object visitAssignment_stmt(Assignment_stmtContext ctx) {
        String variable = ctx.NAME().getText();
        Object data = visit(ctx.expr());
        stack.insert(variable, data, ctx.expr().type);
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
        if (ctx.number() != null) {
            if (ctx.number().FLOAT() != null) {
                ctx.type = Typespec.FLOAT;
                return Double.parseDouble(ctx.number().FLOAT().getText());
            }
            ctx.type = Typespec.INTEGER;
            return Long.parseLong(ctx.number().INTEGER().getText());
        } else if (ctx.NAME() != null) {
            SymEntry entry = stack.lookup(ctx.NAME().getText());
            ctx.type = entry.getType();
            return entry.getData();
        } else if (ctx.expr().size() == 1) {
            ExprContext childExpr = ctx.expr(0);
            Object ret = visit(ctx.expr(0));
            ctx.type = childExpr.type;
            return ret;
        } else if (ctx.list() != null) {
            ctx.type = Typespec.LIST;
            return visit(ctx.list());
        } else if (ctx.lookup() != null) {
            int index = ((Long) visit(ctx.lookup().expr())).intValue();
            SymEntry entry = ((ArrayList<SymEntry>) stack.lookup(ctx.lookup().NAME().getText()).getData()).get(index);
            ctx.type = entry.getType();
            return entry.getData();
        }
        Object operand1 = visit(ctx.expr(0));
        Typespec type1 = ctx.expr(0).type;
        for (int i = 1; i < ctx.expr().size(); i++) {
            String op = ctx.add_op(i - 1).getText();
            Object operand2 = visit(ctx.expr(i));
            Typespec type2 = ctx.expr(i).type;
            if (type1 == Typespec.INTEGER && type2 == Typespec.INTEGER) {
                ctx.type = Typespec.INTEGER;
                operand1 = op.equals("+")
                        ? (Long) operand1 + (Long) operand2
                        : (Long) operand1 - (Long) operand2;
            } else if (type1 == Typespec.STRING && type2 == Typespec.STRING) {
                ctx.type = Typespec.STRING;
                operand1 = (String) operand1 + (String) operand2;
            } else {
                if (type2 == Typespec.FLOAT) {
                    Object tmp = operand1;
                    operand1 = operand2;
                    operand2 = tmp;
                }
                ctx.type = Typespec.FLOAT;
                operand1 = (Double) operand1 + ((Long) operand2).doubleValue();
            }
        }
        return operand1;
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

    @Override
    public Object visitList(ListContext ctx) {
        ArrayList<SymEntry> list = new ArrayList<>();
        for (int i = 0; i < ctx.expr().size(); i++) {
            Object data = visit(ctx.expr(i));
            Typespec type = ctx.expr(i).type;
            list.add(new SymEntry(null, data, type));
        }
        return list;
    }

}
