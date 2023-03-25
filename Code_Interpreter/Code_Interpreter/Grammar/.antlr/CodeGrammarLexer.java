// Generated from c:\SCHOOL\COMPUTER SCIENCE\3rd Year\2nd Semester\PROGLANG CS322\Activities\Group9-Interpreter\Code_Interpreter\Code_Interpreter\Grammar\CodeGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CodeGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, CHAR=2, BOOL=3, TRUE=4, FALSE=5, DISPLAY=6, END=7, ASSIGN=8, SEMI=9, 
		COMMA=10, LPAREN=11, RPAREN=12, LBRACK=13, RBRACK=14, PLUS=15, MINUS=16, 
		MULT=17, DIV=18, MOD=19, EQ=20, NEQ=21, GT=22, LT=23, GTE=24, LTE=25, 
		AND=26, OR=27, NOT=28, INT_LITERAL=29, CHAR_LITERAL=30, ID=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "CHAR", "BOOL", "TRUE", "FALSE", "DISPLAY", "END", "ASSIGN", "SEMI", 
			"COMMA", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "PLUS", "MINUS", "MULT", 
			"DIV", "MOD", "EQ", "NEQ", "GT", "LT", "GTE", "LTE", "AND", "OR", "NOT", 
			"INT_LITERAL", "CHAR_LITERAL", "ID", "DIGIT", "LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'INT'", "'CHAR'", "'BOOL'", "'TRUE'", "'FALSE'", "'DISPLAY:'", 
			"'END'", "'='", "';'", "','", "'('", "')'", "'['", "']'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&'", 
			"'|'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "CHAR", "BOOL", "TRUE", "FALSE", "DISPLAY", "END", "ASSIGN", 
			"SEMI", "COMMA", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "EQ", "NEQ", "GT", "LT", "GTE", "LTE", "AND", "OR", 
			"NOT", "INT_LITERAL", "CHAR_LITERAL", "ID"
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


	public CodeGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CodeGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00b6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\6\36\u009b\n\36\r\36\16\36\u009c"+
		"\3\37\3\37\3\37\3\37\7\37\u00a3\n\37\f\37\16\37\u00a6\13\37\3\37\3\37"+
		"\3 \3 \3 \3 \7 \u00ae\n \f \16 \u00b1\13 \3!\3!\3\"\3\"\2\2#\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\2C"+
		"\2\3\2\5\3\2))\3\2\62;\4\2C\\c|\2\u00b9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3"+
		"E\3\2\2\2\5I\3\2\2\2\7N\3\2\2\2\tS\3\2\2\2\13X\3\2\2\2\r^\3\2\2\2\17g"+
		"\3\2\2\2\21k\3\2\2\2\23m\3\2\2\2\25o\3\2\2\2\27q\3\2\2\2\31s\3\2\2\2\33"+
		"u\3\2\2\2\35w\3\2\2\2\37y\3\2\2\2!{\3\2\2\2#}\3\2\2\2%\177\3\2\2\2\'\u0081"+
		"\3\2\2\2)\u0083\3\2\2\2+\u0086\3\2\2\2-\u0089\3\2\2\2/\u008b\3\2\2\2\61"+
		"\u008d\3\2\2\2\63\u0090\3\2\2\2\65\u0093\3\2\2\2\67\u0095\3\2\2\29\u0097"+
		"\3\2\2\2;\u009a\3\2\2\2=\u009e\3\2\2\2?\u00a9\3\2\2\2A\u00b2\3\2\2\2C"+
		"\u00b4\3\2\2\2EF\7K\2\2FG\7P\2\2GH\7V\2\2H\4\3\2\2\2IJ\7E\2\2JK\7J\2\2"+
		"KL\7C\2\2LM\7T\2\2M\6\3\2\2\2NO\7D\2\2OP\7Q\2\2PQ\7Q\2\2QR\7N\2\2R\b\3"+
		"\2\2\2ST\7V\2\2TU\7T\2\2UV\7W\2\2VW\7G\2\2W\n\3\2\2\2XY\7H\2\2YZ\7C\2"+
		"\2Z[\7N\2\2[\\\7U\2\2\\]\7G\2\2]\f\3\2\2\2^_\7F\2\2_`\7K\2\2`a\7U\2\2"+
		"ab\7R\2\2bc\7N\2\2cd\7C\2\2de\7[\2\2ef\7<\2\2f\16\3\2\2\2gh\7G\2\2hi\7"+
		"P\2\2ij\7F\2\2j\20\3\2\2\2kl\7?\2\2l\22\3\2\2\2mn\7=\2\2n\24\3\2\2\2o"+
		"p\7.\2\2p\26\3\2\2\2qr\7*\2\2r\30\3\2\2\2st\7+\2\2t\32\3\2\2\2uv\7]\2"+
		"\2v\34\3\2\2\2wx\7_\2\2x\36\3\2\2\2yz\7-\2\2z \3\2\2\2{|\7/\2\2|\"\3\2"+
		"\2\2}~\7,\2\2~$\3\2\2\2\177\u0080\7\61\2\2\u0080&\3\2\2\2\u0081\u0082"+
		"\7\'\2\2\u0082(\3\2\2\2\u0083\u0084\7?\2\2\u0084\u0085\7?\2\2\u0085*\3"+
		"\2\2\2\u0086\u0087\7#\2\2\u0087\u0088\7?\2\2\u0088,\3\2\2\2\u0089\u008a"+
		"\7@\2\2\u008a.\3\2\2\2\u008b\u008c\7>\2\2\u008c\60\3\2\2\2\u008d\u008e"+
		"\7@\2\2\u008e\u008f\7?\2\2\u008f\62\3\2\2\2\u0090\u0091\7>\2\2\u0091\u0092"+
		"\7?\2\2\u0092\64\3\2\2\2\u0093\u0094\7(\2\2\u0094\66\3\2\2\2\u0095\u0096"+
		"\7~\2\2\u00968\3\2\2\2\u0097\u0098\7#\2\2\u0098:\3\2\2\2\u0099\u009b\5"+
		"A!\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d<\3\2\2\2\u009e\u00a4\7)\2\2\u009f\u00a3\n\2\2\2\u00a0"+
		"\u00a1\7^\2\2\u00a1\u00a3\13\2\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7)\2\2\u00a8>\3\2\2\2\u00a9"+
		"\u00af\5C\"\2\u00aa\u00ae\5C\"\2\u00ab\u00ae\5A!\2\u00ac\u00ae\7a\2\2"+
		"\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0@\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b3\t\3\2\2\u00b3B\3\2\2\2\u00b4\u00b5\t\4\2\2"+
		"\u00b5D\3\2\2\2\b\2\u009c\u00a2\u00a4\u00ad\u00af\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}