// Generated from java-escape by ANTLR 4.11.1
package python.antlr;
 
    import python.type.Typespec;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(PythonParser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(PythonParser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(PythonParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(PythonParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PythonParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PythonParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(PythonParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(PythonParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(PythonParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(PythonParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(PythonParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(PythonParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(PythonParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(PythonParser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(PythonParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(PythonParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(PythonParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(PythonParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(PythonParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(PythonParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(PythonParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(PythonParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(PythonParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(PythonParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(PythonParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(PythonParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(PythonParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(PythonParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(PythonParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(PythonParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(PythonParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(PythonParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#lookup}.
	 * @param ctx the parse tree
	 */
	void enterLookup(PythonParser.LookupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#lookup}.
	 * @param ctx the parse tree
	 */
	void exitLookup(PythonParser.LookupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#logicOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicOp(PythonParser.LogicOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#logicOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicOp(PythonParser.LogicOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#notOp}.
	 * @param ctx the parse tree
	 */
	void enterNotOp(PythonParser.NotOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#notOp}.
	 * @param ctx the parse tree
	 */
	void exitNotOp(PythonParser.NotOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(PythonParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(PythonParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(PythonParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(PythonParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(PythonParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(PythonParser.MulOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#negative}.
	 * @param ctx the parse tree
	 */
	void enterNegative(PythonParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#negative}.
	 * @param ctx the parse tree
	 */
	void exitNegative(PythonParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PythonParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PythonParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(PythonParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(PythonParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(PythonParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(PythonParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(PythonParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(PythonParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PythonParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PythonParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PythonParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PythonParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#variableFactor}.
	 * @param ctx the parse tree
	 */
	void enterVariableFactor(PythonParser.VariableFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#variableFactor}.
	 * @param ctx the parse tree
	 */
	void exitVariableFactor(PythonParser.VariableFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PythonParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PythonParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PythonParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PythonParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PythonParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PythonParser.NumberContext ctx);
}