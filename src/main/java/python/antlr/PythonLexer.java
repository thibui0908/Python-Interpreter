// Generated from java-escape by ANTLR 4.11.1
package python.antlr;
                                                     //*** https://github.com/antlr/antlr4/blob/master/doc/grammars.md#actions-at-the-grammar-level
import org.antlr.v4.runtime.misc.Interval;
import java.util.*;
import python.type.Typespec;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, FLOAT=29, STRING=30, INTEGER=31, 
		NEWLINE=32, NAME=33, STRING_LITERAL=34, DECIMAL_INTEGER=35, OPEN_PAREN=36, 
		CLOSE_PAREN=37, OPEN_BRACK=38, CLOSE_BRACK=39, OPEN_BRACE=40, CLOSE_BRACE=41, 
		SKIP_=42, UNKNOWN_CHAR=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "FLOAT", "STRING", "INTEGER", "NEWLINE", "NAME", 
			"STRING_LITERAL", "DECIMAL_INTEGER", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACK", 
			"CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", "SKIP_", "UNKNOWN_CHAR", 
			"NON_ZERO_DIGIT", "DIGIT", "SPACES", "COMMENT", "LINE_JOINING", "ID_START", 
			"ID_CONTINUE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'break'", "'continue'", "','", "'if'", "':'", "'elif'", 
			"'else'", "'while'", "'print'", "'AND'", "'and'", "'OR'", "'or'", "'not'", 
			"'NOT'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", 
			"'*'", "'/'", "'//'", "'%'", null, null, null, null, null, null, null, 
			"'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "FLOAT", "STRING", "INTEGER", "NEWLINE", 
			"NAME", "STRING_LITERAL", "DECIMAL_INTEGER", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACK", "CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", "SKIP_", "UNKNOWN_CHAR"
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


	// The stack that keeps track of the indentation lengths
	private Stack<Integer> indentLengths = new Stack<>();
	// A linked list where extra tokens are pushed on
	private LinkedList<Token> pendingTokens = new LinkedList<>();
	// An int that stores the last pending token type (including the inserted INDENT/DEDENT/NEWLINE token types also)
	private int lastPendingTokenType;
	// The amount of opened braces, brackets and parenthesis
	private int opened = 0;
	// Was there space char in the indentations?
	private boolean wasSpaceIndentation = false;
	// Was there tab char in the indentations?
	private boolean wasTabIndentation = false;
	// A String list that stores the lexer warnings
	private List<String> warnings = new ArrayList<>();
	// A String list that stores the lexer error messages
	private List<String> errors = new ArrayList<>();
	// Patterns for the custom error listener to recognize error messages
	public static final String TEXT_LEXER = "lexer --> ";
	public static final String TEXT_INSERTED_INDENT = "inserted INDENT";
	@Override
	public Token nextToken() {
	    if (_input.size() == 0) {
	        return new CommonToken(EOF, "<EOF>"); // processing of the input stream until the first returning EOF
	    } else {
	        checkNextToken();
	        return this.pendingTokens.pollFirst(); // append the token stream with the upcoming pending token
	    }
	}

	private void checkNextToken() {
	    if (this.indentLengths != null) { // after the first incoming EOF token the indentLengths stack will be set to null
	        final int startSize = this.pendingTokens.size();
	        Token curToken;
	        do {
	            curToken = super.nextToken(); // get the next token from the input stream
	            checkStartOfInput(curToken);
	            switch (curToken.getType()) {
	                case OPEN_PAREN:
	                case OPEN_BRACK:
	                case OPEN_BRACE:
	                    this.opened++;
	                    this.pendingTokens.addLast(curToken);
	                    break;
	                case CLOSE_PAREN:
	                case CLOSE_BRACK:
	                case CLOSE_BRACE:
	                    this.opened--;
	                    this.pendingTokens.addLast(curToken);
	                    break;
	                case NEWLINE:
	                    handleNewLineToken(curToken);
	                    break;
	                case EOF:
	                    handleEofToken(curToken); // indentLengths stack will be set to null
	                    break;
	                default:
	                    this.pendingTokens.addLast(curToken); // insert the current token
	            }
	        } while (this.pendingTokens.size() == startSize);
	        this.lastPendingTokenType = curToken.getType();
	    }
	}

	private void checkStartOfInput(Token curToken) {
	    if (indentLengths.size() == 0) { // We're at the first token
	        indentLengths.push(0);  // initialize the stack with default 0 indentation length
	        if (_input.getText(new Interval(0, 0)).trim().length() == 0) { // the first char of the input is a whitespace
	            this.insertLeadingTokens(curToken.getType(), curToken.getStartIndex());
	        }
	    }
	}

	private void handleNewLineToken(Token curToken) {
	    if (this.opened == 0) { //*** https://docs.python.org/3/reference/lexical_analysis.html#implicit-line-joining
	        switch (_input.LA(1) /* next symbol */) { //*** https://www.antlr.org/api/Java/org/antlr/v4/runtime/IntStream.html#LA(int)
	            case '\r':
	            case '\n':
	            case '\f':
	            case '#':   //*** https://docs.python.org/3/reference/lexical_analysis.html#blank-lines
	            case EOF:   // skip the trailing inconsistent dedent or the trailing unexpected indent (or the trailing indent)
	                return; // We're on a blank line or before a comment or before the EOF, skip the NEWLINE token
	            default:
	                this.pendingTokens.addLast(curToken); // insert the current NEWLINE token
	                this.insertIndentDedentTokens(this.getIndentationLength(curToken.getText())); //*** https://docs.python.org/3/reference/lexical_analysis.html#indentation
	        }
	    }
	}

	private void handleEofToken(Token curToken) {
	    this.insertTrailingTokens(this.lastPendingTokenType); // indentLengths stack will be null!
	    this.pendingTokens.addLast(curToken); // insert the current EOF token
	    this.checkSpaceAndTabIndentation();
	}

	private void insertLeadingTokens(int type, int startIndex) {
	    if (type != NEWLINE && type != EOF) { // (after a whitespace) The first token is visible, so We insert a NEWLINE and an INDENT token before it to raise an 'unexpected indent' error later by the parser
	        this.insertToken(0, startIndex - 1, "<inserted leading NEWLINE>" + " ".repeat(startIndex), NEWLINE, 1, 0);
	        this.insertToken(startIndex, startIndex - 1, "<" + TEXT_INSERTED_INDENT + ", " + this.getIndentationDescription(startIndex) + ">", PythonParser.INDENT, 1, startIndex);
	        this.indentLengths.push(startIndex);
	    }
	}

	private void insertIndentDedentTokens(int curIndentLength) {
	    int prevIndentLength = this.indentLengths.peek();
	    if (curIndentLength > prevIndentLength) { // insert an INDENT token
	        this.insertToken("<" + TEXT_INSERTED_INDENT + ", " + this.getIndentationDescription(curIndentLength) + ">", PythonParser.INDENT);
	        this.indentLengths.push(curIndentLength);
	    } else {
	        while (curIndentLength < prevIndentLength) {   // More than 1 DEDENT token may be inserted
	            this.indentLengths.pop();
	            prevIndentLength = this.indentLengths.peek();
	            if (curIndentLength <= prevIndentLength) {
	                this.insertToken("<inserted DEDENT, " + this.getIndentationDescription(prevIndentLength) + ">", PythonParser.DEDENT);
	            } else {
	                this.insertToken("<inserted inconsistent DEDENT, " + "length=" + curIndentLength + ">", PythonParser.DEDENT);
	                this.errors.add(TEXT_LEXER + "line " + getLine() + ":" + getCharPositionInLine() + "\t IndentationError: unindent does not match any outer indentation level");
	            }
	        }
	    }
	}

	private void insertTrailingTokens(int type) {
	    if (type != NEWLINE && type != PythonParser.DEDENT) { // If the last pending token was not a NEWLINE and not a DEDENT then
	        this.insertToken("<inserted trailing NEWLINE>", NEWLINE); // insert an extra trailing NEWLINE token that serves as the end of the statement
	    }

	    while (this.indentLengths.size() > 1) { // Now insert as much trailing DEDENT tokens as needed
	        this.insertToken("<inserted trailing DEDENT, " + this.getIndentationDescription(this.indentLengths.pop()) + ">", PythonParser.DEDENT);
	    }
	    this.indentLengths = null; // there will be no more token read from the input stream
	}

	private String getIndentationDescription(int lengthOfIndent) {
	    return "length=" + lengthOfIndent + ", level=" + this.indentLengths.size();
	}

	private void insertToken(String text, int type) {
	    final int startIndex = _tokenStartCharIndex + getText().length(); //*** https://www.antlr.org/api/Java/org/antlr/v4/runtime/Lexer.html#_tokenStartCharIndex
	    this.insertToken(startIndex, startIndex - 1, text, type, getLine(), getCharPositionInLine());
	}

	private void insertToken(int startIndex, int stopIndex, String text, int type, int line, int charPositionInLine) {
	    CommonToken token = new CommonToken(_tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, startIndex, stopIndex); //*** https://www.antlr.org/api/Java/org/antlr/v4/runtime/CommonToken.html
	    token.setText(text);
	    token.setLine(line);
	    token.setCharPositionInLine(charPositionInLine);
	    this.pendingTokens.addLast(token);
	}

	// Calculates the indentation of the provided spaces, taking the
	// following rules into account:
	//
	// "Tabs are replaced (from left to right) by one to eight spaces
	//  such that the total number of characters up to and including
	//  the replacement is a multiple of eight [...]"
	//
	//  -- https://docs.python.org/3.1/reference/lexical_analysis.html#indentation
	private int getIndentationLength(String textOfMatchedNEWLINE) {
	    int count = 0;
	    for (char ch : textOfMatchedNEWLINE.toCharArray()) {
	        switch (ch) {
	            case ' ': // A normal space char
	                this.wasSpaceIndentation = true;
	                count++;
	                break;
	            case '\t':
	                this.wasTabIndentation = true;
	                count += 8 - (count % 8);
	                break;
	        }
	    }
	    return count;
	}

	private void checkSpaceAndTabIndentation() {
	    if (this.wasSpaceIndentation && this.wasTabIndentation) {
	        this.warnings.add("Mixture of space and tab were used for indentation.");
	    }
	}

	public List<String> getWarnings() {
	    return this.warnings;
	}

	public List<String> getErrorMessages() {
	    return this.errors;
	}


	public PythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Python.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000+\u012d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0003\u001f\u00d0\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u00d4\b\u001f\u0001\u001f\u0003\u001f"+
		"\u00d7\b\u001f\u0001 \u0001 \u0005 \u00db\b \n \f \u00de\t \u0001!\u0001"+
		"!\u0005!\u00e2\b!\n!\f!\u00e5\t!\u0001!\u0001!\u0001\"\u0001\"\u0005\""+
		"\u00eb\b\"\n\"\f\"\u00ee\t\"\u0001\"\u0004\"\u00f1\b\"\u000b\"\f\"\u00f2"+
		"\u0003\"\u00f5\b\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0003)\u0106\b)\u0001"+
		")\u0001)\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0004-\u0111"+
		"\b-\u000b-\f-\u0112\u0001.\u0001.\u0005.\u0117\b.\n.\f.\u011a\t.\u0001"+
		"/\u0001/\u0003/\u011e\b/\u0001/\u0003/\u0121\b/\u0001/\u0001/\u0003/\u0125"+
		"\b/\u00010\u00030\u0128\b0\u00011\u00011\u00031\u012c\b1\u0001\u00e3\u0000"+
		"2\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%"+
		"K&M\'O(Q)S*U+W\u0000Y\u0000[\u0000]\u0000_\u0000a\u0000c\u0000\u0001\u0000"+
		"\u0005\u0001\u000019\u0001\u000009\u0002\u0000\t\t  \u0002\u0000\n\n\f"+
		"\r\u0003\u0000AZ__az\u0135\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001"+
		"\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000"+
		"\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000"+
		"E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001"+
		"\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000"+
		"\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000"+
		"S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0001e\u0001"+
		"\u0000\u0000\u0000\u0003g\u0001\u0000\u0000\u0000\u0005m\u0001\u0000\u0000"+
		"\u0000\u0007v\u0001\u0000\u0000\u0000\tx\u0001\u0000\u0000\u0000\u000b"+
		"{\u0001\u0000\u0000\u0000\r}\u0001\u0000\u0000\u0000\u000f\u0082\u0001"+
		"\u0000\u0000\u0000\u0011\u0087\u0001\u0000\u0000\u0000\u0013\u008d\u0001"+
		"\u0000\u0000\u0000\u0015\u0093\u0001\u0000\u0000\u0000\u0017\u0097\u0001"+
		"\u0000\u0000\u0000\u0019\u009b\u0001\u0000\u0000\u0000\u001b\u009e\u0001"+
		"\u0000\u0000\u0000\u001d\u00a1\u0001\u0000\u0000\u0000\u001f\u00a5\u0001"+
		"\u0000\u0000\u0000!\u00a9\u0001\u0000\u0000\u0000#\u00ac\u0001\u0000\u0000"+
		"\u0000%\u00af\u0001\u0000\u0000\u0000\'\u00b1\u0001\u0000\u0000\u0000"+
		")\u00b4\u0001\u0000\u0000\u0000+\u00b6\u0001\u0000\u0000\u0000-\u00b9"+
		"\u0001\u0000\u0000\u0000/\u00bb\u0001\u0000\u0000\u00001\u00bd\u0001\u0000"+
		"\u0000\u00003\u00bf\u0001\u0000\u0000\u00005\u00c1\u0001\u0000\u0000\u0000"+
		"7\u00c4\u0001\u0000\u0000\u00009\u00c6\u0001\u0000\u0000\u0000;\u00ca"+
		"\u0001\u0000\u0000\u0000=\u00cc\u0001\u0000\u0000\u0000?\u00d3\u0001\u0000"+
		"\u0000\u0000A\u00d8\u0001\u0000\u0000\u0000C\u00df\u0001\u0000\u0000\u0000"+
		"E\u00f4\u0001\u0000\u0000\u0000G\u00f6\u0001\u0000\u0000\u0000I\u00f8"+
		"\u0001\u0000\u0000\u0000K\u00fa\u0001\u0000\u0000\u0000M\u00fc\u0001\u0000"+
		"\u0000\u0000O\u00fe\u0001\u0000\u0000\u0000Q\u0100\u0001\u0000\u0000\u0000"+
		"S\u0105\u0001\u0000\u0000\u0000U\u0109\u0001\u0000\u0000\u0000W\u010b"+
		"\u0001\u0000\u0000\u0000Y\u010d\u0001\u0000\u0000\u0000[\u0110\u0001\u0000"+
		"\u0000\u0000]\u0114\u0001\u0000\u0000\u0000_\u011b\u0001\u0000\u0000\u0000"+
		"a\u0127\u0001\u0000\u0000\u0000c\u012b\u0001\u0000\u0000\u0000ef\u0005"+
		"=\u0000\u0000f\u0002\u0001\u0000\u0000\u0000gh\u0005b\u0000\u0000hi\u0005"+
		"r\u0000\u0000ij\u0005e\u0000\u0000jk\u0005a\u0000\u0000kl\u0005k\u0000"+
		"\u0000l\u0004\u0001\u0000\u0000\u0000mn\u0005c\u0000\u0000no\u0005o\u0000"+
		"\u0000op\u0005n\u0000\u0000pq\u0005t\u0000\u0000qr\u0005i\u0000\u0000"+
		"rs\u0005n\u0000\u0000st\u0005u\u0000\u0000tu\u0005e\u0000\u0000u\u0006"+
		"\u0001\u0000\u0000\u0000vw\u0005,\u0000\u0000w\b\u0001\u0000\u0000\u0000"+
		"xy\u0005i\u0000\u0000yz\u0005f\u0000\u0000z\n\u0001\u0000\u0000\u0000"+
		"{|\u0005:\u0000\u0000|\f\u0001\u0000\u0000\u0000}~\u0005e\u0000\u0000"+
		"~\u007f\u0005l\u0000\u0000\u007f\u0080\u0005i\u0000\u0000\u0080\u0081"+
		"\u0005f\u0000\u0000\u0081\u000e\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"e\u0000\u0000\u0083\u0084\u0005l\u0000\u0000\u0084\u0085\u0005s\u0000"+
		"\u0000\u0085\u0086\u0005e\u0000\u0000\u0086\u0010\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005w\u0000\u0000\u0088\u0089\u0005h\u0000\u0000\u0089\u008a"+
		"\u0005i\u0000\u0000\u008a\u008b\u0005l\u0000\u0000\u008b\u008c\u0005e"+
		"\u0000\u0000\u008c\u0012\u0001\u0000\u0000\u0000\u008d\u008e\u0005p\u0000"+
		"\u0000\u008e\u008f\u0005r\u0000\u0000\u008f\u0090\u0005i\u0000\u0000\u0090"+
		"\u0091\u0005n\u0000\u0000\u0091\u0092\u0005t\u0000\u0000\u0092\u0014\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0005A\u0000\u0000\u0094\u0095\u0005N\u0000"+
		"\u0000\u0095\u0096\u0005D\u0000\u0000\u0096\u0016\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005a\u0000\u0000\u0098\u0099\u0005n\u0000\u0000\u0099\u009a"+
		"\u0005d\u0000\u0000\u009a\u0018\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"O\u0000\u0000\u009c\u009d\u0005R\u0000\u0000\u009d\u001a\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005o\u0000\u0000\u009f\u00a0\u0005r\u0000\u0000\u00a0"+
		"\u001c\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005n\u0000\u0000\u00a2\u00a3"+
		"\u0005o\u0000\u0000\u00a3\u00a4\u0005t\u0000\u0000\u00a4\u001e\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0005N\u0000\u0000\u00a6\u00a7\u0005O\u0000\u0000"+
		"\u00a7\u00a8\u0005T\u0000\u0000\u00a8 \u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005=\u0000\u0000\u00aa\u00ab\u0005=\u0000\u0000\u00ab\"\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005!\u0000\u0000\u00ad\u00ae\u0005=\u0000\u0000"+
		"\u00ae$\u0001\u0000\u0000\u0000\u00af\u00b0\u0005<\u0000\u0000\u00b0&"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005<\u0000\u0000\u00b2\u00b3\u0005"+
		"=\u0000\u0000\u00b3(\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005>\u0000"+
		"\u0000\u00b5*\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005>\u0000\u0000\u00b7"+
		"\u00b8\u0005=\u0000\u0000\u00b8,\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		"+\u0000\u0000\u00ba.\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005-\u0000"+
		"\u0000\u00bc0\u0001\u0000\u0000\u0000\u00bd\u00be\u0005*\u0000\u0000\u00be"+
		"2\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005/\u0000\u0000\u00c04\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0005/\u0000\u0000\u00c2\u00c3\u0005/\u0000"+
		"\u0000\u00c36\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005%\u0000\u0000\u00c5"+
		"8\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003E\"\u0000\u00c7\u00c8\u0005"+
		".\u0000\u0000\u00c8\u00c9\u0003E\"\u0000\u00c9:\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0003C!\u0000\u00cb<\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0003E\"\u0000\u00cd>\u0001\u0000\u0000\u0000\u00ce\u00d0\u0005\r\u0000"+
		"\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d4\u0005\n\u0000\u0000"+
		"\u00d2\u00d4\u0002\f\r\u0000\u00d3\u00cf\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d7\u0003[-\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d7@\u0001\u0000\u0000\u0000\u00d8\u00dc\u0003a0"+
		"\u0000\u00d9\u00db\u0003c1\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db"+
		"\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00ddB\u0001\u0000\u0000\u0000\u00de\u00dc"+
		"\u0001\u0000\u0000\u0000\u00df\u00e3\u0005\"\u0000\u0000\u00e0\u00e2\t"+
		"\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0005\"\u0000\u0000\u00e7D\u0001\u0000"+
		"\u0000\u0000\u00e8\u00ec\u0003W+\u0000\u00e9\u00eb\u0003Y,\u0000\u00ea"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed"+
		"\u00f5\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f1\u00050\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00e8"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f0\u0001\u0000\u0000\u0000\u00f5F\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0005(\u0000\u0000\u00f7H\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0005)\u0000\u0000\u00f9J\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0005[\u0000\u0000\u00fbL\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005"+
		"]\u0000\u0000\u00fdN\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005{\u0000"+
		"\u0000\u00ffP\u0001\u0000\u0000\u0000\u0100\u0101\u0005}\u0000\u0000\u0101"+
		"R\u0001\u0000\u0000\u0000\u0102\u0106\u0003[-\u0000\u0103\u0106\u0003"+
		"].\u0000\u0104\u0106\u0003_/\u0000\u0105\u0102\u0001\u0000\u0000\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0006)\u0000\u0000\u0108"+
		"T\u0001\u0000\u0000\u0000\u0109\u010a\t\u0000\u0000\u0000\u010aV\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0007\u0000\u0000\u0000\u010cX\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0007\u0001\u0000\u0000\u010eZ\u0001\u0000\u0000"+
		"\u0000\u010f\u0111\u0007\u0002\u0000\u0000\u0110\u010f\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\\\u0001\u0000\u0000\u0000"+
		"\u0114\u0118\u0005#\u0000\u0000\u0115\u0117\b\u0003\u0000\u0000\u0116"+
		"\u0115\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118"+
		"\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119"+
		"^\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011d"+
		"\u0005\\\u0000\u0000\u011c\u011e\u0003[-\u0000\u011d\u011c\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0124\u0001\u0000"+
		"\u0000\u0000\u011f\u0121\u0005\r\u0000\u0000\u0120\u011f\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000"+
		"\u0000\u0122\u0125\u0005\n\u0000\u0000\u0123\u0125\u0002\f\r\u0000\u0124"+
		"\u0120\u0001\u0000\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125"+
		"`\u0001\u0000\u0000\u0000\u0126\u0128\u0007\u0004\u0000\u0000\u0127\u0126"+
		"\u0001\u0000\u0000\u0000\u0128b\u0001\u0000\u0000\u0000\u0129\u012c\u0003"+
		"a0\u0000\u012a\u012c\u0007\u0001\u0000\u0000\u012b\u0129\u0001\u0000\u0000"+
		"\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012cd\u0001\u0000\u0000\u0000"+
		"\u0011\u0000\u00cf\u00d3\u00d6\u00dc\u00e3\u00ec\u00f2\u00f4\u0105\u0112"+
		"\u0118\u011d\u0120\u0124\u0127\u012b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}