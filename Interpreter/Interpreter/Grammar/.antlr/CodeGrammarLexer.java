// Generated from c:\SCHOOL\COMPUTER SCIENCE\3rd Year\2nd Semester\PROGLANG CS322\Activities\Group9-Interpreter\Interpreter\Interpreter\Grammar\CodeGrammar.g4 by ANTLR 4.9.2
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
		T__0=1, BEGIN=2, BEGINIF=3, END=4, ENDIF=5, DISPLAY=6, SCAN=7, AND=8, 
		ASSIGN=9, DIV=10, PLUS=11, MOD=12, MULT=13, MINUS=14, NEQ=15, NOT=16, 
		OR=17, GT=18, GTE=19, LT=20, LTE=21, EQ=22, POWER=23, DOUBLEQ=24, SINGLEQ=25, 
		DOLLAR=26, AMPERSAND=27, HASH=28, COMMA=29, RBRACK=30, RPAREN=31, LBRACK=32, 
		LPAREN=33, COLON=34, BOOL=35, CHAR=36, INT=37, FLOAT=38, STRING=39, ELSE=40, 
		IF=41, FALSE=42, TRUE=43, WHITESPACE=44, COMMENT=45, NEWLINE=46, INTEGER=47, 
		FLOATING=48, STRINGS=49, CHARA=50, BOOLEAN=51, SYMBOL=52, IDENTIFIER=53, 
		INT_LITERAL=54, CHAR_LITERAL=55, ID=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "BEGIN", "BEGINIF", "END", "ENDIF", "DISPLAY", "SCAN", "AND", 
			"ASSIGN", "DIV", "PLUS", "MOD", "MULT", "MINUS", "NEQ", "NOT", "OR", 
			"GT", "GTE", "LT", "LTE", "EQ", "POWER", "DOUBLEQ", "SINGLEQ", "DOLLAR", 
			"AMPERSAND", "HASH", "COMMA", "RBRACK", "RPAREN", "LBRACK", "LPAREN", 
			"COLON", "BOOL", "CHAR", "INT", "FLOAT", "STRING", "ELSE", "IF", "FALSE", 
			"TRUE", "WHITESPACE", "COMMENT", "NEWLINE", "INTEGER", "FLOATING", "STRINGS", 
			"CHARA", "BOOLEAN", "SYMBOL", "IDENTIFIER", "INT_LITERAL", "CHAR_LITERAL", 
			"ID", "DIGIT", "LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'update me later hehe'", "'BEGIN CODE'", "'BEGIN IF'", "'END CODE'", 
			"'END IF'", "'DISPLAY'", "'SCAN'", "'AND'", "'='", "'/'", "'+'", "'%'", 
			"'*'", "'-'", "'<>'", "'NOT'", "'OR'", "'>'", "'>='", "'<'", "'<='", 
			"'=='", "'**'", "'"'", "'''", "'$'", "'&'", "'#'", "','", "']'", "')'", 
			"'['", "'('", "':'", "'BOOL'", "'CHAR'", "'INT'", "'FLOAT'", "'STRING'", 
			"'ELSE'", "'IF'", "'FALSE'", "'TRUE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BEGIN", "BEGINIF", "END", "ENDIF", "DISPLAY", "SCAN", "AND", 
			"ASSIGN", "DIV", "PLUS", "MOD", "MULT", "MINUS", "NEQ", "NOT", "OR", 
			"GT", "GTE", "LT", "LTE", "EQ", "POWER", "DOUBLEQ", "SINGLEQ", "DOLLAR", 
			"AMPERSAND", "HASH", "COMMA", "RBRACK", "RPAREN", "LBRACK", "LPAREN", 
			"COLON", "BOOL", "CHAR", "INT", "FLOAT", "STRING", "ELSE", "IF", "FALSE", 
			"TRUE", "WHITESPACE", "COMMENT", "NEWLINE", "INTEGER", "FLOATING", "STRINGS", 
			"CHARA", "BOOLEAN", "SYMBOL", "IDENTIFIER", "INT_LITERAL", "CHAR_LITERAL", 
			"ID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0192\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3("+
		"\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,"+
		"\3,\3,\3-\6-\u012c\n-\r-\16-\u012d\3-\3-\3.\3.\7.\u0134\n.\f.\16.\u0137"+
		"\13.\3.\3.\3/\5/\u013c\n/\3/\3/\5/\u0140\n/\3\60\5\60\u0143\n\60\3\60"+
		"\6\60\u0146\n\60\r\60\16\60\u0147\3\61\6\61\u014b\n\61\r\61\16\61\u014c"+
		"\3\61\3\61\6\61\u0151\n\61\r\61\16\61\u0152\3\62\3\62\7\62\u0157\n\62"+
		"\f\62\16\62\u015a\13\62\3\62\3\62\3\63\3\63\7\63\u0160\n\63\f\63\16\63"+
		"\u0163\13\63\3\63\3\63\3\64\3\64\5\64\u0169\n\64\3\65\3\65\3\65\3\65\3"+
		"\66\3\66\7\66\u0171\n\66\f\66\16\66\u0174\13\66\3\67\6\67\u0177\n\67\r"+
		"\67\16\67\u0178\38\38\38\38\78\u017f\n8\f8\168\u0182\138\38\38\39\39\3"+
		"9\39\79\u018a\n9\f9\169\u018d\139\3:\3:\3;\3;\2\2<\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s\2u\2\3\2\13\4"+
		"\2\13\f\17\17\4\2\f\f\17\17\3\2//\3\2\62;\3\2$$\3\2))\5\2C\\aac|\6\2\62"+
		";C\\aac|\4\2C\\c|\2\u01a1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3w\3\2\2\2\5\u008c\3"+
		"\2\2\2\7\u0097\3\2\2\2\t\u00a0\3\2\2\2\13\u00a9\3\2\2\2\r\u00b0\3\2\2"+
		"\2\17\u00b8\3\2\2\2\21\u00bd\3\2\2\2\23\u00c1\3\2\2\2\25\u00c3\3\2\2\2"+
		"\27\u00c5\3\2\2\2\31\u00c7\3\2\2\2\33\u00c9\3\2\2\2\35\u00cb\3\2\2\2\37"+
		"\u00cd\3\2\2\2!\u00d0\3\2\2\2#\u00d4\3\2\2\2%\u00d7\3\2\2\2\'\u00d9\3"+
		"\2\2\2)\u00dc\3\2\2\2+\u00de\3\2\2\2-\u00e1\3\2\2\2/\u00e4\3\2\2\2\61"+
		"\u00e7\3\2\2\2\63\u00e8\3\2\2\2\65\u00ea\3\2\2\2\67\u00ec\3\2\2\29\u00ee"+
		"\3\2\2\2;\u00f0\3\2\2\2=\u00f2\3\2\2\2?\u00f4\3\2\2\2A\u00f6\3\2\2\2C"+
		"\u00f8\3\2\2\2E\u00fa\3\2\2\2G\u00fc\3\2\2\2I\u0101\3\2\2\2K\u0106\3\2"+
		"\2\2M\u010a\3\2\2\2O\u0110\3\2\2\2Q\u0117\3\2\2\2S\u011c\3\2\2\2U\u011f"+
		"\3\2\2\2W\u0125\3\2\2\2Y\u012b\3\2\2\2[\u0131\3\2\2\2]\u013f\3\2\2\2_"+
		"\u0142\3\2\2\2a\u014a\3\2\2\2c\u0154\3\2\2\2e\u015d\3\2\2\2g\u0168\3\2"+
		"\2\2i\u016a\3\2\2\2k\u016e\3\2\2\2m\u0176\3\2\2\2o\u017a\3\2\2\2q\u0185"+
		"\3\2\2\2s\u018e\3\2\2\2u\u0190\3\2\2\2wx\7w\2\2xy\7r\2\2yz\7f\2\2z{\7"+
		"c\2\2{|\7v\2\2|}\7g\2\2}~\7\"\2\2~\177\7o\2\2\177\u0080\7g\2\2\u0080\u0081"+
		"\7\"\2\2\u0081\u0082\7n\2\2\u0082\u0083\7c\2\2\u0083\u0084\7v\2\2\u0084"+
		"\u0085\7g\2\2\u0085\u0086\7t\2\2\u0086\u0087\7\"\2\2\u0087\u0088\7j\2"+
		"\2\u0088\u0089\7g\2\2\u0089\u008a\7j\2\2\u008a\u008b\7g\2\2\u008b\4\3"+
		"\2\2\2\u008c\u008d\7D\2\2\u008d\u008e\7G\2\2\u008e\u008f\7I\2\2\u008f"+
		"\u0090\7K\2\2\u0090\u0091\7P\2\2\u0091\u0092\7\"\2\2\u0092\u0093\7E\2"+
		"\2\u0093\u0094\7Q\2\2\u0094\u0095\7F\2\2\u0095\u0096\7G\2\2\u0096\6\3"+
		"\2\2\2\u0097\u0098\7D\2\2\u0098\u0099\7G\2\2\u0099\u009a\7I\2\2\u009a"+
		"\u009b\7K\2\2\u009b\u009c\7P\2\2\u009c\u009d\7\"\2\2\u009d\u009e\7K\2"+
		"\2\u009e\u009f\7H\2\2\u009f\b\3\2\2\2\u00a0\u00a1\7G\2\2\u00a1\u00a2\7"+
		"P\2\2\u00a2\u00a3\7F\2\2\u00a3\u00a4\7\"\2\2\u00a4\u00a5\7E\2\2\u00a5"+
		"\u00a6\7Q\2\2\u00a6\u00a7\7F\2\2\u00a7\u00a8\7G\2\2\u00a8\n\3\2\2\2\u00a9"+
		"\u00aa\7G\2\2\u00aa\u00ab\7P\2\2\u00ab\u00ac\7F\2\2\u00ac\u00ad\7\"\2"+
		"\2\u00ad\u00ae\7K\2\2\u00ae\u00af\7H\2\2\u00af\f\3\2\2\2\u00b0\u00b1\7"+
		"F\2\2\u00b1\u00b2\7K\2\2\u00b2\u00b3\7U\2\2\u00b3\u00b4\7R\2\2\u00b4\u00b5"+
		"\7N\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b7\7[\2\2\u00b7\16\3\2\2\2\u00b8\u00b9"+
		"\7U\2\2\u00b9\u00ba\7E\2\2\u00ba\u00bb\7C\2\2\u00bb\u00bc\7P\2\2\u00bc"+
		"\20\3\2\2\2\u00bd\u00be\7C\2\2\u00be\u00bf\7P\2\2\u00bf\u00c0\7F\2\2\u00c0"+
		"\22\3\2\2\2\u00c1\u00c2\7?\2\2\u00c2\24\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4"+
		"\26\3\2\2\2\u00c5\u00c6\7-\2\2\u00c6\30\3\2\2\2\u00c7\u00c8\7\'\2\2\u00c8"+
		"\32\3\2\2\2\u00c9\u00ca\7,\2\2\u00ca\34\3\2\2\2\u00cb\u00cc\7/\2\2\u00cc"+
		"\36\3\2\2\2\u00cd\u00ce\7>\2\2\u00ce\u00cf\7@\2\2\u00cf \3\2\2\2\u00d0"+
		"\u00d1\7P\2\2\u00d1\u00d2\7Q\2\2\u00d2\u00d3\7V\2\2\u00d3\"\3\2\2\2\u00d4"+
		"\u00d5\7Q\2\2\u00d5\u00d6\7T\2\2\u00d6$\3\2\2\2\u00d7\u00d8\7@\2\2\u00d8"+
		"&\3\2\2\2\u00d9\u00da\7@\2\2\u00da\u00db\7?\2\2\u00db(\3\2\2\2\u00dc\u00dd"+
		"\7>\2\2\u00dd*\3\2\2\2\u00de\u00df\7>\2\2\u00df\u00e0\7?\2\2\u00e0,\3"+
		"\2\2\2\u00e1\u00e2\7?\2\2\u00e2\u00e3\7?\2\2\u00e3.\3\2\2\2\u00e4\u00e5"+
		"\7,\2\2\u00e5\u00e6\7,\2\2\u00e6\60\3\2\2\2\u00e7\62\3\2\2\2\u00e8\u00e9"+
		"\7)\2\2\u00e9\64\3\2\2\2\u00ea\u00eb\7&\2\2\u00eb\66\3\2\2\2\u00ec\u00ed"+
		"\7(\2\2\u00ed8\3\2\2\2\u00ee\u00ef\7%\2\2\u00ef:\3\2\2\2\u00f0\u00f1\7"+
		".\2\2\u00f1<\3\2\2\2\u00f2\u00f3\7_\2\2\u00f3>\3\2\2\2\u00f4\u00f5\7+"+
		"\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7]\2\2\u00f7B\3\2\2\2\u00f8\u00f9\7*\2"+
		"\2\u00f9D\3\2\2\2\u00fa\u00fb\7<\2\2\u00fbF\3\2\2\2\u00fc\u00fd\7D\2\2"+
		"\u00fd\u00fe\7Q\2\2\u00fe\u00ff\7Q\2\2\u00ff\u0100\7N\2\2\u0100H\3\2\2"+
		"\2\u0101\u0102\7E\2\2\u0102\u0103\7J\2\2\u0103\u0104\7C\2\2\u0104\u0105"+
		"\7T\2\2\u0105J\3\2\2\2\u0106\u0107\7K\2\2\u0107\u0108\7P\2\2\u0108\u0109"+
		"\7V\2\2\u0109L\3\2\2\2\u010a\u010b\7H\2\2\u010b\u010c\7N\2\2\u010c\u010d"+
		"\7Q\2\2\u010d\u010e\7C\2\2\u010e\u010f\7V\2\2\u010fN\3\2\2\2\u0110\u0111"+
		"\7U\2\2\u0111\u0112\7V\2\2\u0112\u0113\7T\2\2\u0113\u0114\7K\2\2\u0114"+
		"\u0115\7P\2\2\u0115\u0116\7I\2\2\u0116P\3\2\2\2\u0117\u0118\7G\2\2\u0118"+
		"\u0119\7N\2\2\u0119\u011a\7U\2\2\u011a\u011b\7G\2\2\u011bR\3\2\2\2\u011c"+
		"\u011d\7K\2\2\u011d\u011e\7H\2\2\u011eT\3\2\2\2\u011f\u0120\7H\2\2\u0120"+
		"\u0121\7C\2\2\u0121\u0122\7N\2\2\u0122\u0123\7U\2\2\u0123\u0124\7G\2\2"+
		"\u0124V\3\2\2\2\u0125\u0126\7V\2\2\u0126\u0127\7T\2\2\u0127\u0128\7W\2"+
		"\2\u0128\u0129\7G\2\2\u0129X\3\2\2\2\u012a\u012c\t\2\2\2\u012b\u012a\3"+
		"\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\b-\2\2\u0130Z\3\2\2\2\u0131\u0135\7%\2\2\u0132"+
		"\u0134\n\3\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u0139\b.\2\2\u0139\\\3\2\2\2\u013a\u013c\7\17\2\2\u013b\u013a\3\2\2\2"+
		"\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0140\7\f\2\2\u013e\u0140"+
		"\7\17\2\2\u013f\u013b\3\2\2\2\u013f\u013e\3\2\2\2\u0140^\3\2\2\2\u0141"+
		"\u0143\t\4\2\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2"+
		"\2\2\u0144\u0146\t\5\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148`\3\2\2\2\u0149\u014b\t\5\2\2"+
		"\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\7\60\2\2\u014f\u0151\t\5\2\2"+
		"\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153b\3\2\2\2\u0154\u0158\7$\2\2\u0155\u0157\n\6\2\2\u0156\u0155"+
		"\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7$\2\2\u015cd\3\2\2\2\u015d"+
		"\u0161\7)\2\2\u015e\u0160\n\7\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2"+
		"\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0165\7)\2\2\u0165f\3\2\2\2\u0166\u0169\5W,\2\u0167"+
		"\u0169\5U+\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169h\3\2\2\2\u016a"+
		"\u016b\7]\2\2\u016b\u016c\13\2\2\2\u016c\u016d\7_\2\2\u016dj\3\2\2\2\u016e"+
		"\u0172\t\b\2\2\u016f\u0171\t\t\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2"+
		"\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173l\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0175\u0177\5s:\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179n\3\2\2\2\u017a\u0180\7)\2\2\u017b"+
		"\u017f\n\7\2\2\u017c\u017d\7^\2\2\u017d\u017f\13\2\2\2\u017e\u017b\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7)"+
		"\2\2\u0184p\3\2\2\2\u0185\u018b\5u;\2\u0186\u018a\5u;\2\u0187\u018a\5"+
		"s:\2\u0188\u018a\7a\2\2\u0189\u0186\3\2\2\2\u0189\u0187\3\2\2\2\u0189"+
		"\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018cr\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\t\5\2\2\u018ft\3\2"+
		"\2\2\u0190\u0191\t\n\2\2\u0191v\3\2\2\2\24\2\u012d\u0135\u013b\u013f\u0142"+
		"\u0147\u014c\u0152\u0158\u0161\u0168\u0172\u0178\u017e\u0180\u0189\u018b"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}