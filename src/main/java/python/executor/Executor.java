package python.executor;

import python.antlr.PythonBaseVisitor;
import python.antlr.PythonParser.*;
import python.intermediate.SymEntry;
import python.intermediate.SymStack;
import python.type.Typespec;

import java.util.ArrayList;

public class Executor extends PythonBaseVisitor<Object> {
    private SymStack stack;

    public Executor() {
        stack = new SymStack();
    }

    @Override
    public Object visitIf_stmt(If_stmtContext ctx) {
        for (int i = 0; i < ctx.test().size(); i++) {
            if ((boolean) visit(ctx.test(i))) {
                visit(ctx.suite(i));
                return null;
            }
        }
        if (ctx.test().size() < ctx.suite().size())
            visit(ctx.suite(ctx.suite().size() - 1));
        return null;
    }

    @Override
    public Object visitTest(TestContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitAssignment_stmt(Assignment_stmtContext ctx) {
        Object data = visit(ctx.expr());
        if (ctx.lookup() != null) {
            ArrayList<SymEntry> list = (ArrayList<SymEntry>) stack.lookup(ctx.lookup().NAME().getText()).getData();
            SymEntry entry = list.get(((Long) visit(ctx.lookup().expr())).intValue());
            entry.setData(data);
            entry.setType(ctx.expr().type);
            return null;
        }
        String variable = ctx.NAME().getText();
        stack.insert(variable, data, ctx.expr().type);
        return null;
    }

    @Override
    public Object visitPrint_stmt(Print_stmtContext ctx) {
        Object ouput = visit(ctx.expr());
        System.out.println(ouput);
        return null;
    }

    @Override
    public Object visitExpr(ExprContext ctx) {
        Object operand1 = visit(ctx.compareExpression(0));
        ctx.type = ctx.compareExpression(0).type;
        if (ctx.logicOp() == null)
            return operand1;

        String op = ctx.logicOp().getText().toLowerCase();
        Object operand2 = visit(ctx.compareExpression(1));
        Boolean boper1 = (Boolean) operand1;
        Boolean boper2 = (Boolean) operand2;

        Boolean result = op.equals("and") ? boper1 && boper2
                : boper1 || boper2;
        return result;
    }

    @Override
    public Object visitCompareExpression(CompareExpressionContext ctx) {
        Object operand1 = visit(ctx.notExpression(0));
        ctx.type = ctx.notExpression(0).type;
        if (ctx.relOp() == null) {
            return operand1;
        }

        String op = ctx.relOp().getText();
        Object operand2 = visit(ctx.notExpression(1));

        Typespec type1 = ctx.notExpression(0).type;
        Typespec type2 = ctx.notExpression(1).type;

        if (type1 == Typespec.INTEGER && type2 == Typespec.INTEGER) {
            ctx.type = Typespec.BOOLEAN;
            if (op.equals("==")) {
                operand1 = (long) operand1 == (long) operand2;
            } else if (op.equals("!=")) {
                operand1 = (long) operand1 != (long) operand2;
            } else if (op.equals("<")) {
                operand1 = (long) operand1 < (long) operand2;
            } else if (op.equals(">")) {
                operand1 = (long) operand1 > (long) operand2;
            } else if (op.equals(">=")) {
                operand1 = (long) operand1 >= (long) operand2;
            } else if (op.equals("<=")) {
                operand1 = (long) operand1 <= (long) operand2;
            }
        } else if (type1 == Typespec.STRING && type2 == Typespec.STRING) {
            ctx.type = Typespec.BOOLEAN;
            if (op.equals("==")) {
                operand1 = ((String) operand1).equals((String) operand2);
            } else {
                operand1 = !((String) operand1).equals((String) operand2);
                ;
            }
        } else {
            ctx.type = Typespec.BOOLEAN;
            if (type2 == Typespec.FLOAT) {
                Object tmp = operand1;
                operand1 = operand2;
                operand2 = tmp;
            }
            Double ope1 = (Double) operand1;
            Double ope2 = ((Long) operand2).doubleValue();
            if (op.equals("==")) {
                operand1 = (double) ope1 == ope2;
            } else if (op.equals("!=")) {
                operand1 = (double) ope1 != ope2;
            } else if (op.equals("<")) {
                operand1 = (double) ope1 < ope2;
            } else if (op.equals(">")) {
                operand1 = (double) ope1 > ope2;
            } else if (op.equals(">=")) {
                operand1 = (double) ope1 >= ope2;
            } else if (op.equals("<=")) {
                operand1 = (double) ope1 <= ope2;
            }
        }

        return operand1;
    }

    @Override
    public Object visitNotExpression(NotExpressionContext ctx) {
        Object operand1 = visit(ctx.simpleExpression());
        ctx.type = ctx.simpleExpression().type;

        if (ctx.notOp() == null) {
            return operand1;
        }

        ctx.type = Typespec.BOOLEAN;

        return !((Boolean) operand1);
    }

    @Override
    public Object visitSimpleExpression(SimpleExpressionContext ctx) {
        Object operand1 = visit(ctx.term(0));
        ctx.type = ctx.term(0).type;

        if (ctx.addOp() == null) {
            return operand1;
        }

        Typespec type1 = ctx.term(0).type;

        for (int i = 1; i < ctx.term().size(); i++) {
            String op = ctx.addOp(i - 1).getText();
            Object operand2 = visit(ctx.term(i));
            Typespec type2 = ctx.term(i).type;

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
                operand1 = op.equals("+") ? (Double) operand1 + ((Long) operand2).doubleValue()
                        : (Double) operand1 - ((Long) operand2).doubleValue();
            }
        }

        return operand1;
    }

    @Override
    public Object visitTerm(TermContext ctx) {
        Object operand1 = visit(ctx.factor(0));
        ctx.type = ctx.factor(0).type;

        if (ctx.mulOp() == null) {
            return operand1;
        }
        Typespec type1 = ctx.factor(0).type;

        for (int i = 1; i < ctx.factor().size(); i++) {
            String op = ctx.mulOp(i - 1).getText();
            Object operand2 = visit(ctx.factor(i));
            Typespec type2 = ctx.factor(i).type;

            if (type1 == Typespec.INTEGER && type2 == Typespec.INTEGER) {
                ctx.type = Typespec.INTEGER;
                operand1 = op.equals("*")
                        ? (Long) operand1 * (Long) operand2
                        : (Long) operand1 / (Long) operand2;
            } else if (type1 != Typespec.STRING || type2 != Typespec.STRING) {
                if (type2 == Typespec.FLOAT) {
                    Object tmp = operand1;
                    operand1 = operand2;
                    operand2 = tmp;
                }
                ctx.type = Typespec.FLOAT;
                operand1 = op.equals("*") ? (Double) operand1 * ((Long) operand2).doubleValue()
                        : (Double) operand1 / ((Long) operand2).doubleValue();
            }
        }
        return operand1;
    }

    @Override
    public Object visitFactor(FactorContext ctx) {
        boolean negative = ctx.negative() != null;
        if (ctx.string() != null) {
            ctx.type = Typespec.STRING;
            return visit(ctx.string());
        }
        if (ctx.number() != null) {
            Object ret = visit(ctx.number());
            ctx.type = ctx.number().type;
            if (negative)
                return makeNegative(ret);
            return ret;
        } else if (ctx.variableFactor() != null) {
            Object ret = visit(ctx.variableFactor());
            ctx.type = ctx.variableFactor().type;
            if (negative)
                return makeNegative(ret);
            return ret;
        } else if (ctx.expr() != null) {
            Object ret = visit(ctx.expr());
            ctx.type = ctx.expr().type;
            return ret;
        } else if (ctx.functionCall() != null) {
            Object ret = visit(ctx.functionCall());
            ctx.type = ctx.functionCall().type;
            return ret;
        } else if (ctx.list() != null) {
            Object ret = visit(ctx.list());
            ctx.type = Typespec.LIST;
            return ret;
        } else if (ctx.subscriptFactor() != null) {
            Object ret = visit(ctx.subscriptFactor());
            ctx.type = ctx.subscriptFactor().type;
            return ret;
        }
        return null;
    }

    @Override
    public Object visitNumber(NumberContext ctx) {
        if (ctx.INTEGER() != null) {
            ctx.type = Typespec.INTEGER;
            return (Long) Long.parseLong(ctx.INTEGER().getText());
        }
        ctx.type = Typespec.FLOAT;
        return (Double) Double.parseDouble(ctx.FLOAT().getText());
    }

    @Override
    public Object visitString(StringContext ctx) {
        ctx.type = Typespec.STRING;
        return ctx.getText().subSequence(1, ctx.getText().length() - 1);
    }

    @Override
    public Object visitVariableFactor(VariableFactorContext ctx) {
        SymEntry entry = stack.lookup(ctx.getText());
        ctx.type = entry.getType();
        return entry.getData();
    }

    Object makeNegative(Object object) {
        if (object instanceof Double)
            object = -(Double) object;
        else
            object = -(Long) object;
        return object;
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

    Object ret = null;
    Typespec type = null;

    @Override
    public Object visitSuite(SuiteContext ctx) {
        for (StmtContext stmt : ctx.stmt()) {
            visit(stmt);
            if (ret != null)
                return null;
        }
        return null;
    }

    @Override
    public Object visitReturnStatement(ReturnStatementContext ctx) {
        ret = visit(ctx.expr());
        type = ctx.expr().type;
        return null;
    }

    @Override
    public Object visitFunctionDefinitionStatement(FunctionDefinitionStatementContext ctx) {
        ctx.parameters = new ArrayList<>();
        if (ctx.parameterList() != null) {
            for (VariableContext pCtx : ctx.parameterList().variable()) {
                ctx.parameters.add(pCtx.NAME().getText());
            }
        }
        ctx.suiteCtx = ctx.suite();
        stack.insert(ctx.variable().NAME().getText(), ctx, Typespec.FUNCTION);
        return null;
    }

    @Override
    public Object visitFunctionCall(FunctionCallContext ctx) {

        stack.addStack();
        SymEntry entry = stack.lookup(ctx.variable().getText());
        FunctionDefinitionStatementContext fdc = (FunctionDefinitionStatementContext) entry.getData();
        for (int i = 0; i < fdc.parameters.size(); i++) {
            stack.insertLocal(fdc.parameters.get(i), visitExpr(ctx.expr(i)), ctx.expr(i).type);
        }
        visit(fdc.suiteCtx);
        ctx.type = type;
        type = null;
        Object retur = ret;
        ret = null;
        stack.pop();
        return retur;
    }

    @Override
    public Object visitSubscriptFactor(SubscriptFactorContext ctx) {
        ArrayList<SymEntry> entries = (ArrayList<SymEntry>) visit(ctx.variableFactor());
        int value = ((Long) visit(ctx.expr())).intValue();
        SymEntry entry = entries.get(value);
        ctx.type = entry.getType();
        return entry.getData();
    }

    @Override
    public Object visitNormalList(NormalListContext ctx) {
        ArrayList<SymEntry> list = new ArrayList<>();
        for (int i = 0; i < ctx.expr().size(); i++) {
            Object data = visit(ctx.expr(i));
            Typespec type = ctx.expr(i).type;
            list.add(new SymEntry(null, data, type));
        }
        return list;
    }

    @Override
    public Object visitNList(NListContext ctx) {
        int n = ((Long) visit(ctx.expr(1))).intValue();
        Object data = visit(ctx.expr(0));
        Typespec type = ctx.expr(0).type;
        ArrayList<SymEntry> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add(new SymEntry(null, data, type));
        return list;
    }

}
