// Generated from java-escape by ANTLR 4.11.1
package python.antlr;
 
    import python.type.Typespec;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, FLOAT=31, 
		INTEGER=32, NEWLINE=33, NAME=34, STRING_LITERAL=35, DECIMAL_INTEGER=36, 
		OPEN_PAREN=37, CLOSE_PAREN=38, OPEN_BRACK=39, CLOSE_BRACK=40, OPEN_BRACE=41, 
		CLOSE_BRACE=42, SKIP_=43, UNKNOWN_CHAR=44, INDENT=45, DEDENT=46;
	public static final int
		RULE_single_input = 0, RULE_file_input = 1, RULE_stmt = 2, RULE_simple_stmt = 3, 
		RULE_small_stmt = 4, RULE_assignment_stmt = 5, RULE_flow_stmt = 6, RULE_break_stmt = 7, 
		RULE_continue_stmt = 8, RULE_returnStatement = 9, RULE_list = 10, RULE_compound_stmt = 11, 
		RULE_if_stmt = 12, RULE_while_stmt = 13, RULE_suite = 14, RULE_test = 15, 
		RULE_print_stmt = 16, RULE_functionDefinitionStatement = 17, RULE_parameterList = 18, 
		RULE_lookup = 19, RULE_logicOp = 20, RULE_notOp = 21, RULE_relOp = 22, 
		RULE_addOp = 23, RULE_mulOp = 24, RULE_negative = 25, RULE_expr = 26, 
		RULE_compareExpression = 27, RULE_notExpression = 28, RULE_simpleExpression = 29, 
		RULE_term = 30, RULE_factor = 31, RULE_functionCall = 32, RULE_subscriptFactor = 33, 
		RULE_variableFactor = 34, RULE_variable = 35, RULE_string = 36, RULE_number = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"single_input", "file_input", "stmt", "simple_stmt", "small_stmt", "assignment_stmt", 
			"flow_stmt", "break_stmt", "continue_stmt", "returnStatement", "list", 
			"compound_stmt", "if_stmt", "while_stmt", "suite", "test", "print_stmt", 
			"functionDefinitionStatement", "parameterList", "lookup", "logicOp", 
			"notOp", "relOp", "addOp", "mulOp", "negative", "expr", "compareExpression", 
			"notExpression", "simpleExpression", "term", "factor", "functionCall", 
			"subscriptFactor", "variableFactor", "variable", "string", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'break'", "'continue'", "'return'", "'*'", "','", "'if'", 
			"':'", "'elif'", "'else'", "'while'", "'print'", "'def '", "'AND'", "'and'", 
			"'OR'", "'or'", "'not'", "'NOT'", "'=='", "'!='", "'<'", "'<='", "'>'", 
			"'>='", "'+'", "'-'", "'/'", "'//'", "'%'", null, null, null, null, null, 
			null, "'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "FLOAT", "INTEGER", "NEWLINE", 
			"NAME", "STRING_LITERAL", "DECIMAL_INTEGER", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACK", "CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", "SKIP_", "UNKNOWN_CHAR", 
			"INDENT", "DEDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_inputContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Single_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterSingle_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitSingle_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitSingle_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_inputContext single_input() throws RecognitionException {
		Single_inputContext _localctx = new Single_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_single_input);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(NEWLINE);
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__11:
			case T__17:
			case T__18:
			case T__26:
			case FLOAT:
			case INTEGER:
			case NAME:
			case STRING_LITERAL:
			case OPEN_PAREN:
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				simple_stmt();
				}
				break;
			case T__6:
			case T__10:
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				compound_stmt();
				setState(79);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_inputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public File_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterFile_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitFile_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitFile_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_inputContext file_input() throws RecognitionException {
		File_inputContext _localctx = new File_inputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 753901779100L) != 0) {
				{
				setState(85);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(83);
					match(NEWLINE);
					}
					break;
				case T__1:
				case T__2:
				case T__3:
				case T__6:
				case T__10:
				case T__11:
				case T__12:
				case T__17:
				case T__18:
				case T__26:
				case FLOAT:
				case INTEGER:
				case NAME:
				case STRING_LITERAL:
				case OPEN_PAREN:
				case OPEN_BRACK:
					{
					setState(84);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__11:
			case T__17:
			case T__18:
			case T__26:
			case FLOAT:
			case INTEGER:
			case NAME:
			case STRING_LITERAL:
			case OPEN_PAREN:
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				simple_stmt();
				}
				break;
			case T__6:
			case T__10:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				compound_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_stmtContext extends ParserRuleContext {
		public Small_stmtContext small_stmt() {
			return getRuleContext(Small_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simple_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			small_stmt();
			setState(97);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Small_stmtContext extends ParserRuleContext {
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Flow_stmtContext flow_stmt() {
			return getRuleContext(Flow_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Small_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterSmall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitSmall_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitSmall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_small_stmt);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				flow_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				print_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LookupContext lookup() {
			return getRuleContext(LookupContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterAssignment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitAssignment_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitAssignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(106);
				lookup();
				}
				break;
			case 2:
				{
				setState(107);
				match(NAME);
				}
				break;
			}
			setState(110);
			match(T__0);
			setState(111);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Flow_stmtContext extends ParserRuleContext {
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Flow_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterFlow_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitFlow_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitFlow_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_stmtContext flow_stmt() throws RecognitionException {
		Flow_stmtContext _localctx = new Flow_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_flow_stmt);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				break_stmt();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				continue_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Break_stmtContext extends ParserRuleContext {
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitBreak_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Continue_stmtContext extends ParserRuleContext {
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterContinue_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitContinue_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitContinue_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__3);
			setState(122);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	 
		public ListContext() { }
		public void copyFrom(ListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalListContext extends ListContext {
		public TerminalNode OPEN_BRACK() { return getToken(PythonParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(PythonParser.CLOSE_BRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NormalListContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterNormalList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitNormalList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitNormalList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NListContext extends ListContext {
		public TerminalNode OPEN_BRACK() { return getToken(PythonParser.OPEN_BRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(PythonParser.CLOSE_BRACK, 0); }
		public NListContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterNList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitNList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitNList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_list);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new NListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(124);
				match(OPEN_BRACK);
				setState(125);
				expr();
				setState(126);
				match(CLOSE_BRACK);
				setState(127);
				match(T__4);
				setState(128);
				expr();
				}
				}
				break;
			case 2:
				_localctx = new NormalListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(130);
				match(OPEN_BRACK);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 745311830016L) != 0) {
					{
					setState(131);
					expr();
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(132);
						match(T__5);
						setState(133);
						expr();
						}
						}
						setState(138);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(141);
				match(CLOSE_BRACK);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public FunctionDefinitionStatementContext functionDefinitionStatement() {
			return getRuleContext(FunctionDefinitionStatementContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitCompound_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compound_stmt);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				if_stmt();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				while_stmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				functionDefinitionStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__6);
			setState(150);
			test();
			setState(151);
			match(T__7);
			setState(152);
			suite();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(153);
				match(T__8);
				setState(154);
				test();
				setState(155);
				match(T__7);
				setState(156);
				suite();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(163);
				match(T__9);
				setState(164);
				match(T__7);
				setState(165);
				suite();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_stmtContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__10);
			setState(169);
			test();
			setState(170);
			match(T__7);
			setState(171);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SuiteContext extends ParserRuleContext {
		public Typespec type = null;
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitSuite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_suite);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__11:
			case T__17:
			case T__18:
			case T__26:
			case FLOAT:
			case INTEGER:
			case NAME:
			case STRING_LITERAL:
			case OPEN_PAREN:
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(NEWLINE);
				setState(175);
				match(INDENT);
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					stmt();
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 745311844508L) != 0 );
				setState(181);
				match(DEDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TestContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitPrint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__11);
			setState(188);
			match(OPEN_PAREN);
			{
			setState(189);
			expr();
			}
			setState(190);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionStatementContext extends ParserRuleContext {
		public SuiteContext suiteCtx;
		public List<String> parameters;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public FunctionDefinitionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinitionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterFunctionDefinitionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitFunctionDefinitionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitFunctionDefinitionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionStatementContext functionDefinitionStatement() throws RecognitionException {
		FunctionDefinitionStatementContext _localctx = new FunctionDefinitionStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionDefinitionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__12);
			setState(193);
			variable();
			setState(194);
			match(OPEN_PAREN);
			setState(195);
			parameterList();
			setState(196);
			match(CLOSE_PAREN);
			setState(197);
			match(T__7);
			setState(198);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(200);
				variable();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LookupContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode OPEN_BRACK() { return getToken(PythonParser.OPEN_BRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(PythonParser.CLOSE_BRACK, 0); }
		public LookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterLookup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitLookup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitLookup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LookupContext lookup() throws RecognitionException {
		LookupContext _localctx = new LookupContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(NAME);
			setState(207);
			match(OPEN_BRACK);
			setState(208);
			expr();
			setState(209);
			match(CLOSE_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicOpContext extends ParserRuleContext {
		public LogicOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterLogicOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitLogicOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitLogicOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicOpContext logicOp() throws RecognitionException {
		LogicOpContext _localctx = new LogicOpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotOpContext extends ParserRuleContext {
		public NotOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterNotOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitNotOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitNotOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOpContext notOp() throws RecognitionException {
		NotOpContext _localctx = new NotOpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_notOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelOpContext extends ParserRuleContext {
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitRelOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 66060288L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitAddOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulOpContext extends ParserRuleContext {
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterMulOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitMulOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitMulOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mulOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048224L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegativeContext extends ParserRuleContext {
		public NegativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitNegative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegativeContext negative() throws RecognitionException {
		NegativeContext _localctx = new NegativeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_negative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Typespec type = null;
		public List<CompareExpressionContext> compareExpression() {
			return getRuleContexts(CompareExpressionContext.class);
		}
		public CompareExpressionContext compareExpression(int i) {
			return getRuleContext(CompareExpressionContext.class,i);
		}
		public LogicOpContext logicOp() {
			return getRuleContext(LogicOpContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			compareExpression();
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(224);
				logicOp();
				setState(225);
				compareExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompareExpressionContext extends ParserRuleContext {
		public Typespec type = null;
		public List<NotExpressionContext> notExpression() {
			return getRuleContexts(NotExpressionContext.class);
		}
		public NotExpressionContext notExpression(int i) {
			return getRuleContext(NotExpressionContext.class,i);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public CompareExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExpressionContext compareExpression() throws RecognitionException {
		CompareExpressionContext _localctx = new CompareExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_compareExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			notExpression();
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(230);
				relOp();
				setState(231);
				notExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends ParserRuleContext {
		public Typespec type = null;
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public NotOpContext notOp() {
			return getRuleContext(NotOpContext.class,0);
		}
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_notExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__18) {
				{
				setState(235);
				notOp();
				}
			}

			setState(238);
			simpleExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExpressionContext extends ParserRuleContext {
		public Typespec type = null;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddOpContext> addOp() {
			return getRuleContexts(AddOpContext.class);
		}
		public AddOpContext addOp(int i) {
			return getRuleContext(AddOpContext.class,i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simpleExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			term();
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					addOp();
					setState(242);
					term();
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public Typespec type = null;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulOpContext> mulOp() {
			return getRuleContexts(MulOpContext.class);
		}
		public MulOpContext mulOp(int i) {
			return getRuleContext(MulOpContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			factor();
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250);
					mulOp();
					setState(251);
					factor();
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public Typespec type = null;
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public SubscriptFactorContext subscriptFactor() {
			return getRuleContext(SubscriptFactorContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public VariableFactorContext variableFactor() {
			return getRuleContext(VariableFactorContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public NegativeContext negative() {
			return getRuleContext(NegativeContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(258);
				negative();
				}
			}

			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(261);
				functionCall();
				}
				break;
			case 2:
				{
				setState(262);
				subscriptFactor();
				}
				break;
			case 3:
				{
				setState(263);
				list();
				}
				break;
			case 4:
				{
				setState(264);
				variableFactor();
				}
				break;
			case 5:
				{
				setState(265);
				number();
				}
				break;
			case 6:
				{
				setState(266);
				string();
				}
				break;
			case 7:
				{
				setState(267);
				match(OPEN_PAREN);
				setState(268);
				expr();
				setState(269);
				match(CLOSE_PAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public Typespec type = null;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			variable();
			setState(274);
			match(OPEN_PAREN);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 745311830016L) != 0) {
				{
				{
				setState(275);
				expr();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptFactorContext extends ParserRuleContext {
		public Typespec type = null;
		public VariableFactorContext variableFactor() {
			return getRuleContext(VariableFactorContext.class,0);
		}
		public TerminalNode OPEN_BRACK() { return getToken(PythonParser.OPEN_BRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(PythonParser.CLOSE_BRACK, 0); }
		public SubscriptFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterSubscriptFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitSubscriptFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitSubscriptFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptFactorContext subscriptFactor() throws RecognitionException {
		SubscriptFactorContext _localctx = new SubscriptFactorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_subscriptFactor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			variableFactor();
			setState(284);
			match(OPEN_BRACK);
			setState(285);
			expr();
			setState(286);
			match(CLOSE_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableFactorContext extends ParserRuleContext {
		public Typespec type = null;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterVariableFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitVariableFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitVariableFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableFactorContext variableFactor() throws RecognitionException {
		VariableFactorContext _localctx = new VariableFactorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableFactor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public Typespec type = null;
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public Typespec type = null;
		public TerminalNode STRING_LITERAL() { return getToken(PythonParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public Typespec type = null;
		public TerminalNode INTEGER() { return getToken(PythonParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(PythonParser.FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==INTEGER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u0129\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000R\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0005\u0001V\b\u0001\n\u0001\f\u0001Y\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0003\u0002_\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004i\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005m\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006t\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u0087\b\n\n\n\f\n\u008a\t\n\u0003\n\u008c\b\n\u0001"+
		"\n\u0003\n\u008f\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0094"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u009f\b\f\n\f\f\f\u00a2\t\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u00a7\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u00b2\b\u000e\u000b\u000e"+
		"\f\u000e\u00b3\u0001\u000e\u0001\u000e\u0003\u000e\u00b8\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0005\u0012\u00ca\b\u0012\n"+
		"\u0012\f\u0012\u00cd\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u00e4\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u00ea\b\u001b\u0001\u001c\u0003\u001c\u00ed\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u00f5\b\u001d\n\u001d\f\u001d\u00f8\t\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u00fe\b\u001e\n\u001e\f\u001e\u0101\t\u001e"+
		"\u0001\u001f\u0003\u001f\u0104\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0110\b\u001f\u0001 \u0001 \u0001 \u0005 \u0115"+
		"\b \n \f \u0118\t \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001%\u0000\u0000"+
		"&\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJ\u0000\u0006\u0001\u0000\u000e\u0011"+
		"\u0001\u0000\u0012\u0013\u0001\u0000\u0014\u0019\u0001\u0000\u001a\u001b"+
		"\u0002\u0000\u0005\u0005\u001c\u001e\u0001\u0000\u001f \u0124\u0000Q\u0001"+
		"\u0000\u0000\u0000\u0002W\u0001\u0000\u0000\u0000\u0004^\u0001\u0000\u0000"+
		"\u0000\u0006`\u0001\u0000\u0000\u0000\bh\u0001\u0000\u0000\u0000\nl\u0001"+
		"\u0000\u0000\u0000\fs\u0001\u0000\u0000\u0000\u000eu\u0001\u0000\u0000"+
		"\u0000\u0010w\u0001\u0000\u0000\u0000\u0012y\u0001\u0000\u0000\u0000\u0014"+
		"\u008e\u0001\u0000\u0000\u0000\u0016\u0093\u0001\u0000\u0000\u0000\u0018"+
		"\u0095\u0001\u0000\u0000\u0000\u001a\u00a8\u0001\u0000\u0000\u0000\u001c"+
		"\u00b7\u0001\u0000\u0000\u0000\u001e\u00b9\u0001\u0000\u0000\u0000 \u00bb"+
		"\u0001\u0000\u0000\u0000\"\u00c0\u0001\u0000\u0000\u0000$\u00cb\u0001"+
		"\u0000\u0000\u0000&\u00ce\u0001\u0000\u0000\u0000(\u00d3\u0001\u0000\u0000"+
		"\u0000*\u00d5\u0001\u0000\u0000\u0000,\u00d7\u0001\u0000\u0000\u0000."+
		"\u00d9\u0001\u0000\u0000\u00000\u00db\u0001\u0000\u0000\u00002\u00dd\u0001"+
		"\u0000\u0000\u00004\u00df\u0001\u0000\u0000\u00006\u00e5\u0001\u0000\u0000"+
		"\u00008\u00ec\u0001\u0000\u0000\u0000:\u00f0\u0001\u0000\u0000\u0000<"+
		"\u00f9\u0001\u0000\u0000\u0000>\u0103\u0001\u0000\u0000\u0000@\u0111\u0001"+
		"\u0000\u0000\u0000B\u011b\u0001\u0000\u0000\u0000D\u0120\u0001\u0000\u0000"+
		"\u0000F\u0122\u0001\u0000\u0000\u0000H\u0124\u0001\u0000\u0000\u0000J"+
		"\u0126\u0001\u0000\u0000\u0000LR\u0005!\u0000\u0000MR\u0003\u0006\u0003"+
		"\u0000NO\u0003\u0016\u000b\u0000OP\u0005!\u0000\u0000PR\u0001\u0000\u0000"+
		"\u0000QL\u0001\u0000\u0000\u0000QM\u0001\u0000\u0000\u0000QN\u0001\u0000"+
		"\u0000\u0000R\u0001\u0001\u0000\u0000\u0000SV\u0005!\u0000\u0000TV\u0003"+
		"\u0004\u0002\u0000US\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000"+
		"VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0005\u0000"+
		"\u0000\u0001[\u0003\u0001\u0000\u0000\u0000\\_\u0003\u0006\u0003\u0000"+
		"]_\u0003\u0016\u000b\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000"+
		"\u0000_\u0005\u0001\u0000\u0000\u0000`a\u0003\b\u0004\u0000ab\u0005!\u0000"+
		"\u0000b\u0007\u0001\u0000\u0000\u0000ci\u0003\n\u0005\u0000di\u0003\f"+
		"\u0006\u0000ei\u0003 \u0010\u0000fi\u0003\u0012\t\u0000gi\u00034\u001a"+
		"\u0000hc\u0001\u0000\u0000\u0000hd\u0001\u0000\u0000\u0000he\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000i\t\u0001"+
		"\u0000\u0000\u0000jm\u0003&\u0013\u0000km\u0005\"\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"no\u0005\u0001\u0000\u0000op\u00034\u001a\u0000p\u000b\u0001\u0000\u0000"+
		"\u0000qt\u0003\u000e\u0007\u0000rt\u0003\u0010\b\u0000sq\u0001\u0000\u0000"+
		"\u0000sr\u0001\u0000\u0000\u0000t\r\u0001\u0000\u0000\u0000uv\u0005\u0002"+
		"\u0000\u0000v\u000f\u0001\u0000\u0000\u0000wx\u0005\u0003\u0000\u0000"+
		"x\u0011\u0001\u0000\u0000\u0000yz\u0005\u0004\u0000\u0000z{\u00034\u001a"+
		"\u0000{\u0013\u0001\u0000\u0000\u0000|}\u0005\'\u0000\u0000}~\u00034\u001a"+
		"\u0000~\u007f\u0005(\u0000\u0000\u007f\u0080\u0005\u0005\u0000\u0000\u0080"+
		"\u0081\u00034\u001a\u0000\u0081\u008f\u0001\u0000\u0000\u0000\u0082\u008b"+
		"\u0005\'\u0000\u0000\u0083\u0088\u00034\u001a\u0000\u0084\u0085\u0005"+
		"\u0006\u0000\u0000\u0085\u0087\u00034\u001a\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000"+
		"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u0083\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u008f\u0005(\u0000\u0000\u008e|\u0001\u0000\u0000\u0000"+
		"\u008e\u0082\u0001\u0000\u0000\u0000\u008f\u0015\u0001\u0000\u0000\u0000"+
		"\u0090\u0094\u0003\u0018\f\u0000\u0091\u0094\u0003\u001a\r\u0000\u0092"+
		"\u0094\u0003\"\u0011\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0091"+
		"\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0017"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0007\u0000\u0000\u0096\u0097"+
		"\u0003\u001e\u000f\u0000\u0097\u0098\u0005\b\u0000\u0000\u0098\u00a0\u0003"+
		"\u001c\u000e\u0000\u0099\u009a\u0005\t\u0000\u0000\u009a\u009b\u0003\u001e"+
		"\u000f\u0000\u009b\u009c\u0005\b\u0000\u0000\u009c\u009d\u0003\u001c\u000e"+
		"\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u0099\u0001\u0000\u0000"+
		"\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\n\u0000\u0000"+
		"\u00a4\u00a5\u0005\b\u0000\u0000\u00a5\u00a7\u0003\u001c\u000e\u0000\u00a6"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u0019\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u000b\u0000\u0000\u00a9"+
		"\u00aa\u0003\u001e\u000f\u0000\u00aa\u00ab\u0005\b\u0000\u0000\u00ab\u00ac"+
		"\u0003\u001c\u000e\u0000\u00ac\u001b\u0001\u0000\u0000\u0000\u00ad\u00b8"+
		"\u0003\u0006\u0003\u0000\u00ae\u00af\u0005!\u0000\u0000\u00af\u00b1\u0005"+
		"-\u0000\u0000\u00b0\u00b2\u0003\u0004\u0002\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0005.\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b7\u00ad\u0001\u0000\u0000\u0000\u00b7\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b8\u001d\u0001\u0000\u0000\u0000\u00b9\u00ba\u00034\u001a\u0000"+
		"\u00ba\u001f\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\f\u0000\u0000\u00bc"+
		"\u00bd\u0005%\u0000\u0000\u00bd\u00be\u00034\u001a\u0000\u00be\u00bf\u0005"+
		"&\u0000\u0000\u00bf!\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\r\u0000"+
		"\u0000\u00c1\u00c2\u0003F#\u0000\u00c2\u00c3\u0005%\u0000\u0000\u00c3"+
		"\u00c4\u0003$\u0012\u0000\u00c4\u00c5\u0005&\u0000\u0000\u00c5\u00c6\u0005"+
		"\b\u0000\u0000\u00c6\u00c7\u0003\u001c\u000e\u0000\u00c7#\u0001\u0000"+
		"\u0000\u0000\u00c8\u00ca\u0003F#\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc%\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\"\u0000\u0000\u00cf\u00d0"+
		"\u0005\'\u0000\u0000\u00d0\u00d1\u00034\u001a\u0000\u00d1\u00d2\u0005"+
		"(\u0000\u0000\u00d2\'\u0001\u0000\u0000\u0000\u00d3\u00d4\u0007\u0000"+
		"\u0000\u0000\u00d4)\u0001\u0000\u0000\u0000\u00d5\u00d6\u0007\u0001\u0000"+
		"\u0000\u00d6+\u0001\u0000\u0000\u0000\u00d7\u00d8\u0007\u0002\u0000\u0000"+
		"\u00d8-\u0001\u0000\u0000\u0000\u00d9\u00da\u0007\u0003\u0000\u0000\u00da"+
		"/\u0001\u0000\u0000\u0000\u00db\u00dc\u0007\u0004\u0000\u0000\u00dc1\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0005\u001b\u0000\u0000\u00de3\u0001\u0000"+
		"\u0000\u0000\u00df\u00e3\u00036\u001b\u0000\u00e0\u00e1\u0003(\u0014\u0000"+
		"\u00e1\u00e2\u00036\u001b\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4"+
		"5\u0001\u0000\u0000\u0000\u00e5\u00e9\u00038\u001c\u0000\u00e6\u00e7\u0003"+
		",\u0016\u0000\u00e7\u00e8\u00038\u001c\u0000\u00e8\u00ea\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea7\u0001\u0000\u0000\u0000\u00eb\u00ed\u0003*\u0015\u0000\u00ec"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0003:\u001d\u0000\u00ef9\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f6\u0003<\u001e\u0000\u00f1\u00f2\u0003.\u0017"+
		"\u0000\u00f2\u00f3\u0003<\u001e\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7;\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9"+
		"\u00ff\u0003>\u001f\u0000\u00fa\u00fb\u00030\u0018\u0000\u00fb\u00fc\u0003"+
		">\u001f\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100=\u0001\u0000\u0000"+
		"\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0104\u00032\u0019\u0000"+
		"\u0103\u0102\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000"+
		"\u0104\u010f\u0001\u0000\u0000\u0000\u0105\u0110\u0003@ \u0000\u0106\u0110"+
		"\u0003B!\u0000\u0107\u0110\u0003\u0014\n\u0000\u0108\u0110\u0003D\"\u0000"+
		"\u0109\u0110\u0003J%\u0000\u010a\u0110\u0003H$\u0000\u010b\u010c\u0005"+
		"%\u0000\u0000\u010c\u010d\u00034\u001a\u0000\u010d\u010e\u0005&\u0000"+
		"\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u0105\u0001\u0000\u0000"+
		"\u0000\u010f\u0106\u0001\u0000\u0000\u0000\u010f\u0107\u0001\u0000\u0000"+
		"\u0000\u010f\u0108\u0001\u0000\u0000\u0000\u010f\u0109\u0001\u0000\u0000"+
		"\u0000\u010f\u010a\u0001\u0000\u0000\u0000\u010f\u010b\u0001\u0000\u0000"+
		"\u0000\u0110?\u0001\u0000\u0000\u0000\u0111\u0112\u0003F#\u0000\u0112"+
		"\u0116\u0005%\u0000\u0000\u0113\u0115\u00034\u001a\u0000\u0114\u0113\u0001"+
		"\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119\u0001"+
		"\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011a\u0005"+
		"&\u0000\u0000\u011aA\u0001\u0000\u0000\u0000\u011b\u011c\u0003D\"\u0000"+
		"\u011c\u011d\u0005\'\u0000\u0000\u011d\u011e\u00034\u001a\u0000\u011e"+
		"\u011f\u0005(\u0000\u0000\u011fC\u0001\u0000\u0000\u0000\u0120\u0121\u0003"+
		"F#\u0000\u0121E\u0001\u0000\u0000\u0000\u0122\u0123\u0005\"\u0000\u0000"+
		"\u0123G\u0001\u0000\u0000\u0000\u0124\u0125\u0005#\u0000\u0000\u0125I"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0007\u0005\u0000\u0000\u0127K\u0001"+
		"\u0000\u0000\u0000\u0018QUW^hls\u0088\u008b\u008e\u0093\u00a0\u00a6\u00b3"+
		"\u00b7\u00cb\u00e3\u00e9\u00ec\u00f6\u00ff\u0103\u010f\u0116";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}