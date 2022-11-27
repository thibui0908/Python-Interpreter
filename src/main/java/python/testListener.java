// Generated from java-escape by ANTLR 4.11.1
package python;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(testParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(testParser.TextContext ctx);
}