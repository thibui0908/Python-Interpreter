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
		T__24=25, T__25=26, T__26=27, NEG=28, FLOAT=29, STRING=30, INTEGER=31, 
		NEWLINE=32, NAME=33, STRING_LITERAL=34, DECIMAL_INTEGER=35, OPEN_PAREN=36, 
		CLOSE_PAREN=37, OPEN_BRACK=38, CLOSE_BRACK=39, OPEN_BRACE=40, CLOSE_BRACE=41, 
		SKIP_=42, UNKNOWN_CHAR=43, INDENT=44, DEDENT=45;
	public static final int
		RULE_single_input = 0, RULE_file_input = 1, RULE_stmt = 2, RULE_simple_stmt = 3, 
		RULE_small_stmt = 4, RULE_assignment_stmt = 5, RULE_flow_stmt = 6, RULE_break_stmt = 7, 
		RULE_continue_stmt = 8, RULE_list = 9, RULE_compound_stmt = 10, RULE_if_stmt = 11, 
		RULE_while_stmt = 12, RULE_suite = 13, RULE_test = 14, RULE_print_stmt = 15, 
		RULE_lookup = 16, RULE_expr = 17, RULE_logicOp = 18, RULE_notOp = 19, 
		RULE_compareExpression = 20, RULE_notExpression = 21, RULE_relOp = 22, 
		RULE_addOp = 23, RULE_mulOp = 24, RULE_simpleExpression = 25, RULE_term = 26, 
		RULE_factor = 27, RULE_variableFactor = 28, RULE_variable = 29, RULE_string = 30, 
		RULE_number = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"single_input", "file_input", "stmt", "simple_stmt", "small_stmt", "assignment_stmt", 
			"flow_stmt", "break_stmt", "continue_stmt", "list", "compound_stmt", 
			"if_stmt", "while_stmt", "suite", "test", "print_stmt", "lookup", "expr", 
			"logicOp", "notOp", "compareExpression", "notExpression", "relOp", "addOp", 
			"mulOp", "simpleExpression", "term", "factor", "variableFactor", "variable", 
			"string", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'break'", "'continue'", "','", "'if'", "':'", "'elif'", 
			"'else'", "'while'", "'print'", "'AND'", "'and'", "'OR'", "'or'", "'not'", 
			"'NOT'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", "'*'", 
			"'/'", "'//'", "'%'", "'-'", null, null, null, null, null, null, null, 
			"'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "NEG", "FLOAT", "STRING", "INTEGER", "NEWLINE", 
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(NEWLINE);
				}
				break;
			case T__1:
			case T__2:
			case T__9:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				simple_stmt();
				}
				break;
			case T__4:
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				compound_stmt();
				setState(67);
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 12884903468L) != 0) {
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(71);
					match(NEWLINE);
					}
					break;
				case T__1:
				case T__2:
				case T__4:
				case T__8:
				case T__9:
				case NAME:
					{
					setState(72);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__9:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				simple_stmt();
				}
				break;
			case T__4:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
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
			setState(84);
			small_stmt();
			setState(85);
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
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				assignment_stmt();
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				flow_stmt();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				print_stmt();
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(92);
				lookup();
				}
				break;
			case 2:
				{
				setState(93);
				match(NAME);
				}
				break;
			}
			setState(96);
			match(T__0);
			setState(97);
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				break_stmt();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
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
			setState(103);
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
			setState(105);
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
	public static class ListContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACK() { return getToken(PythonParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(PythonParser.CLOSE_BRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonListener ) ((PythonListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(OPEN_BRACK);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 97442168832L) != 0) {
				{
				setState(108);
				expr();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(109);
					match(T__3);
					setState(110);
					expr();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(118);
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
	public static class Compound_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
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
		enterRule(_localctx, 20, RULE_compound_stmt);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				if_stmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				while_stmt();
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
		enterRule(_localctx, 22, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__4);
			setState(125);
			test();
			setState(126);
			match(T__5);
			setState(127);
			suite();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(128);
				match(T__6);
				setState(129);
				test();
				setState(130);
				match(T__5);
				setState(131);
				suite();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(138);
				match(T__7);
				setState(139);
				match(T__5);
				setState(140);
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
		enterRule(_localctx, 24, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__8);
			setState(144);
			test();
			setState(145);
			match(T__5);
			setState(146);
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
		enterRule(_localctx, 26, RULE_suite);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__9:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(NEWLINE);
				setState(150);
				match(INDENT);
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(151);
					stmt();
					}
					}
					setState(154); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 8589936172L) != 0 );
				setState(156);
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
		enterRule(_localctx, 28, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
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
		enterRule(_localctx, 30, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__9);
			setState(163);
			match(OPEN_PAREN);
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(164);
				match(STRING);
				}
				break;
			case T__14:
			case T__15:
			case NEG:
			case FLOAT:
			case INTEGER:
			case NAME:
			case STRING_LITERAL:
			case OPEN_PAREN:
				{
				setState(165);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(168);
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
		enterRule(_localctx, 32, RULE_lookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(NAME);
			setState(171);
			match(OPEN_BRACK);
			setState(172);
			expr();
			setState(173);
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
		enterRule(_localctx, 34, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			compareExpression();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0) {
				{
				setState(176);
				logicOp();
				setState(177);
				compareExpression();
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
		enterRule(_localctx, 36, RULE_logicOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0) ) {
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
		enterRule(_localctx, 38, RULE_notOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
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
		enterRule(_localctx, 40, RULE_compareExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			notExpression();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8257536L) != 0) {
				{
				setState(186);
				relOp();
				setState(187);
				notExpression();
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
	public static class NotExpressionContext extends ParserRuleContext {
		public Typespec type = null;
		public NotOpContext notOp() {
			return getRuleContext(NotOpContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
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
		enterRule(_localctx, 42, RULE_notExpression);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				notOp();
				setState(192);
				simpleExpression();
				}
				break;
			case NEG:
			case FLOAT:
			case INTEGER:
			case NAME:
			case STRING_LITERAL:
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				simpleExpression();
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
			setState(197);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8257536L) != 0) ) {
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
		public TerminalNode NEG() { return getToken(PythonParser.NEG, 0); }
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
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==NEG) ) {
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
			setState(201);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0) ) {
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
	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode NEG() { return getToken(PythonParser.NEG, 0); }
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
		enterRule(_localctx, 50, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEG) {
				{
				setState(203);
				match(NEG);
				}
			}

			setState(206);
			term();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22 || _la==NEG) {
				{
				{
				setState(207);
				addOp();
				setState(208);
				term();
				}
				}
				setState(214);
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
		enterRule(_localctx, 52, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			factor();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0) {
				{
				{
				setState(216);
				mulOp();
				setState(217);
				factor();
				}
				}
				setState(223);
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
	public static class FactorContext extends ParserRuleContext {
		public Typespec type = null;
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
		enterRule(_localctx, 54, RULE_factor);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				variableFactor();
				}
				break;
			case FLOAT:
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				number();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				string();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(OPEN_PAREN);
				setState(228);
				expr();
				setState(229);
				match(CLOSE_PAREN);
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
		enterRule(_localctx, 56, RULE_variableFactor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
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
		public SymtabEntry entry = null;
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
		enterRule(_localctx, 58, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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
		enterRule(_localctx, 60, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		enterRule(_localctx, 62, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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
		"\u0004\u0001-\u00f2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000F\b\u0000\u0001\u0001\u0001\u0001\u0005\u0001"+
		"J\b\u0001\n\u0001\f\u0001M\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002S\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004[\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005_\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0003\u0006f\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tp\b\t\n\t\f\t"+
		"s\t\t\u0003\tu\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n{\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0086\b\u000b\n\u000b\f\u000b"+
		"\u0089\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008e\b"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0004\r\u0099\b\r\u000b\r\f\r\u009a\u0001\r\u0001\r\u0003\r\u009f"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00a7\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00b4\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00be\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u00c4\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0003\u0019\u00cd\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u00d3\b\u0019\n\u0019\f\u0019"+
		"\u00d6\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u00dc\b\u001a\n\u001a\f\u001a\u00df\t\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00e8"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0000\u0000 \u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>\u0000\u0006\u0001\u0000\u000b\u000e\u0001\u0000\u000f\u0010"+
		"\u0001\u0000\u0011\u0016\u0002\u0000\u0017\u0017\u001c\u001c\u0001\u0000"+
		"\u0018\u001b\u0002\u0000\u001d\u001d\u001f\u001f\u00eb\u0000E\u0001\u0000"+
		"\u0000\u0000\u0002K\u0001\u0000\u0000\u0000\u0004R\u0001\u0000\u0000\u0000"+
		"\u0006T\u0001\u0000\u0000\u0000\bZ\u0001\u0000\u0000\u0000\n^\u0001\u0000"+
		"\u0000\u0000\fe\u0001\u0000\u0000\u0000\u000eg\u0001\u0000\u0000\u0000"+
		"\u0010i\u0001\u0000\u0000\u0000\u0012k\u0001\u0000\u0000\u0000\u0014z"+
		"\u0001\u0000\u0000\u0000\u0016|\u0001\u0000\u0000\u0000\u0018\u008f\u0001"+
		"\u0000\u0000\u0000\u001a\u009e\u0001\u0000\u0000\u0000\u001c\u00a0\u0001"+
		"\u0000\u0000\u0000\u001e\u00a2\u0001\u0000\u0000\u0000 \u00aa\u0001\u0000"+
		"\u0000\u0000\"\u00af\u0001\u0000\u0000\u0000$\u00b5\u0001\u0000\u0000"+
		"\u0000&\u00b7\u0001\u0000\u0000\u0000(\u00b9\u0001\u0000\u0000\u0000*"+
		"\u00c3\u0001\u0000\u0000\u0000,\u00c5\u0001\u0000\u0000\u0000.\u00c7\u0001"+
		"\u0000\u0000\u00000\u00c9\u0001\u0000\u0000\u00002\u00cc\u0001\u0000\u0000"+
		"\u00004\u00d7\u0001\u0000\u0000\u00006\u00e7\u0001\u0000\u0000\u00008"+
		"\u00e9\u0001\u0000\u0000\u0000:\u00eb\u0001\u0000\u0000\u0000<\u00ed\u0001"+
		"\u0000\u0000\u0000>\u00ef\u0001\u0000\u0000\u0000@F\u0005 \u0000\u0000"+
		"AF\u0003\u0006\u0003\u0000BC\u0003\u0014\n\u0000CD\u0005 \u0000\u0000"+
		"DF\u0001\u0000\u0000\u0000E@\u0001\u0000\u0000\u0000EA\u0001\u0000\u0000"+
		"\u0000EB\u0001\u0000\u0000\u0000F\u0001\u0001\u0000\u0000\u0000GJ\u0005"+
		" \u0000\u0000HJ\u0003\u0004\u0002\u0000IG\u0001\u0000\u0000\u0000IH\u0001"+
		"\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000NO\u0005\u0000\u0000\u0001O\u0003\u0001\u0000\u0000\u0000PS\u0003"+
		"\u0006\u0003\u0000QS\u0003\u0014\n\u0000RP\u0001\u0000\u0000\u0000RQ\u0001"+
		"\u0000\u0000\u0000S\u0005\u0001\u0000\u0000\u0000TU\u0003\b\u0004\u0000"+
		"UV\u0005 \u0000\u0000V\u0007\u0001\u0000\u0000\u0000W[\u0003\n\u0005\u0000"+
		"X[\u0003\f\u0006\u0000Y[\u0003\u001e\u000f\u0000ZW\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\t\u0001\u0000\u0000"+
		"\u0000\\_\u0003 \u0010\u0000]_\u0005!\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0005\u0001"+
		"\u0000\u0000ab\u0003\"\u0011\u0000b\u000b\u0001\u0000\u0000\u0000cf\u0003"+
		"\u000e\u0007\u0000df\u0003\u0010\b\u0000ec\u0001\u0000\u0000\u0000ed\u0001"+
		"\u0000\u0000\u0000f\r\u0001\u0000\u0000\u0000gh\u0005\u0002\u0000\u0000"+
		"h\u000f\u0001\u0000\u0000\u0000ij\u0005\u0003\u0000\u0000j\u0011\u0001"+
		"\u0000\u0000\u0000kt\u0005&\u0000\u0000lq\u0003\"\u0011\u0000mn\u0005"+
		"\u0004\u0000\u0000np\u0003\"\u0011\u0000om\u0001\u0000\u0000\u0000ps\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tl\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0005\'\u0000"+
		"\u0000w\u0013\u0001\u0000\u0000\u0000x{\u0003\u0016\u000b\u0000y{\u0003"+
		"\u0018\f\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{\u0015"+
		"\u0001\u0000\u0000\u0000|}\u0005\u0005\u0000\u0000}~\u0003\u001c\u000e"+
		"\u0000~\u007f\u0005\u0006\u0000\u0000\u007f\u0087\u0003\u001a\r\u0000"+
		"\u0080\u0081\u0005\u0007\u0000\u0000\u0081\u0082\u0003\u001c\u000e\u0000"+
		"\u0082\u0083\u0005\u0006\u0000\u0000\u0083\u0084\u0003\u001a\r\u0000\u0084"+
		"\u0086\u0001\u0000\u0000\u0000\u0085\u0080\u0001\u0000\u0000\u0000\u0086"+
		"\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u008d\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0005\b\u0000\u0000\u008b\u008c"+
		"\u0005\u0006\u0000\u0000\u008c\u008e\u0003\u001a\r\u0000\u008d\u008a\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0017\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005\t\u0000\u0000\u0090\u0091\u0003\u001c"+
		"\u000e\u0000\u0091\u0092\u0005\u0006\u0000\u0000\u0092\u0093\u0003\u001a"+
		"\r\u0000\u0093\u0019\u0001\u0000\u0000\u0000\u0094\u009f\u0003\u0006\u0003"+
		"\u0000\u0095\u0096\u0005 \u0000\u0000\u0096\u0098\u0005,\u0000\u0000\u0097"+
		"\u0099\u0003\u0004\u0002\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005-\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u0094"+
		"\u0001\u0000\u0000\u0000\u009e\u0095\u0001\u0000\u0000\u0000\u009f\u001b"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003\"\u0011\u0000\u00a1\u001d\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0005\n\u0000\u0000\u00a3\u00a6\u0005$"+
		"\u0000\u0000\u00a4\u00a7\u0005\u001e\u0000\u0000\u00a5\u00a7\u0003\"\u0011"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005%\u0000\u0000"+
		"\u00a9\u001f\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005!\u0000\u0000\u00ab"+
		"\u00ac\u0005&\u0000\u0000\u00ac\u00ad\u0003\"\u0011\u0000\u00ad\u00ae"+
		"\u0005\'\u0000\u0000\u00ae!\u0001\u0000\u0000\u0000\u00af\u00b3\u0003"+
		"(\u0014\u0000\u00b0\u00b1\u0003$\u0012\u0000\u00b1\u00b2\u0003(\u0014"+
		"\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4#\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0007\u0000\u0000\u0000\u00b6%\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0007\u0001\u0000\u0000\u00b8\'\u0001\u0000\u0000\u0000\u00b9\u00bd"+
		"\u0003*\u0015\u0000\u00ba\u00bb\u0003,\u0016\u0000\u00bb\u00bc\u0003*"+
		"\u0015\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be)\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0003&\u0013\u0000\u00c0\u00c1\u00032\u0019\u0000\u00c1"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c4\u00032\u0019\u0000\u00c3\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4+\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0007\u0002\u0000\u0000\u00c6-\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0007\u0003\u0000\u0000\u00c8/\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0007\u0004\u0000\u0000\u00ca1\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cd\u0005\u001c\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d4\u00034\u001a\u0000\u00cf\u00d0\u0003.\u0017\u0000\u00d0\u00d1"+
		"\u00034\u001a\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d53\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00dd\u00036\u001b"+
		"\u0000\u00d8\u00d9\u00030\u0018\u0000\u00d9\u00da\u00036\u001b\u0000\u00da"+
		"\u00dc\u0001\u0000\u0000\u0000\u00db\u00d8\u0001\u0000\u0000\u0000\u00dc"+
		"\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00de5\u0001\u0000\u0000\u0000\u00df\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e8\u00038\u001c\u0000\u00e1\u00e8\u0003"+
		">\u001f\u0000\u00e2\u00e8\u0003<\u001e\u0000\u00e3\u00e4\u0005$\u0000"+
		"\u0000\u00e4\u00e5\u0003\"\u0011\u0000\u00e5\u00e6\u0005%\u0000\u0000"+
		"\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e1\u0001\u0000\u0000\u0000\u00e7\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e3\u0001\u0000\u0000\u0000\u00e87\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0003:\u001d\u0000\u00ea9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005"+
		"!\u0000\u0000\u00ec;\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\"\u0000"+
		"\u0000\u00ee=\u0001\u0000\u0000\u0000\u00ef\u00f0\u0007\u0005\u0000\u0000"+
		"\u00f0?\u0001\u0000\u0000\u0000\u0016EIKRZ^eqtz\u0087\u008d\u009a\u009e"+
		"\u00a6\u00b3\u00bd\u00c3\u00cc\u00d4\u00dd\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}