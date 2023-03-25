// Generated from c:\SCHOOL\COMPUTER SCIENCE\3rd Year\2nd Semester\PROGLANG CS322\Activities\Group9-Interpreter\Code_Interpreter\Code_Interpreter\Grammar\CodeGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CodeGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, CHAR=2, BOOL=3, TRUE=4, FALSE=5, DISPLAY=6, END=7, ASSIGN=8, SEMI=9, 
		COMMA=10, LPAREN=11, RPAREN=12, LBRACK=13, RBRACK=14, PLUS=15, MINUS=16, 
		MULT=17, DIV=18, MOD=19, EQ=20, NEQ=21, GT=22, LT=23, GTE=24, LTE=25, 
		AND=26, OR=27, NOT=28, INT_LITERAL=29, CHAR_LITERAL=30, ID=31;
	public static final int
		RULE_code = 0, RULE_statement = 1, RULE_variable_declaration = 2, RULE_data_type = 3, 
		RULE_identifier = 4, RULE_assignment_statement = 5, RULE_expression = 6, 
		RULE_literal = 7, RULE_display_statement = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "statement", "variable_declaration", "data_type", "identifier", 
			"assignment_statement", "expression", "literal", "display_statement"
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

	@Override
	public String getGrammarFileName() { return "CodeGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CodeGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CodeContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << BOOL) | (1L << DISPLAY) | (1L << ID))) != 0)) {
				{
				{
				setState(18);
				statement();
				}
				}
				setState(23);
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

	public static class StatementContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Display_statementContext display_statement() {
			return getRuleContext(Display_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				variable_declaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				assignment_statement();
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				display_statement();
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodeGrammarParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(CodeGrammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			data_type();
			setState(30);
			identifier();
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(31);
				match(ASSIGN);
				setState(32);
				expression(0);
				}
			}

			setState(35);
			match(SEMI);
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CodeGrammarParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(CodeGrammarParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(CodeGrammarParser.BOOL, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << BOOL))) != 0)) ) {
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CodeGrammarParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ID);
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CodeGrammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodeGrammarParser.SEMI, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			identifier();
			setState(42);
			match(ASSIGN);
			setState(43);
			expression(0);
			setState(44);
			match(SEMI);
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

	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CodeGrammarParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CodeGrammarParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(CodeGrammarParser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(CodeGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CodeGrammarParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(CodeGrammarParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CodeGrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CodeGrammarParser.MOD, 0); }
		public TerminalNode EQ() { return getToken(CodeGrammarParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(CodeGrammarParser.NEQ, 0); }
		public TerminalNode GT() { return getToken(CodeGrammarParser.GT, 0); }
		public TerminalNode LT() { return getToken(CodeGrammarParser.LT, 0); }
		public TerminalNode GTE() { return getToken(CodeGrammarParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(CodeGrammarParser.LTE, 0); }
		public TerminalNode AND() { return getToken(CodeGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(CodeGrammarParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case INT_LITERAL:
			case CHAR_LITERAL:
				{
				setState(47);
				literal();
				}
				break;
			case ID:
				{
				setState(48);
				identifier();
				}
				break;
			case LPAREN:
				{
				setState(49);
				match(LPAREN);
				setState(50);
				expression(0);
				setState(51);
				match(RPAREN);
				}
				break;
			case NOT:
				{
				setState(53);
				match(NOT);
				setState(54);
				expression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(66);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(57);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(58);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(59);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(60);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(61);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT) | (1L << GTE) | (1L << LTE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(62);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(63);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(64);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(65);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(CodeGrammarParser.INT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(CodeGrammarParser.CHAR_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(CodeGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CodeGrammarParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << INT_LITERAL) | (1L << CHAR_LITERAL))) != 0)) ) {
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

	public static class Display_statementContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(CodeGrammarParser.DISPLAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(CodeGrammarParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CodeGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeGrammarParser.COMMA, i);
		}
		public Display_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display_statement; }
	}

	public final Display_statementContext display_statement() throws RecognitionException {
		Display_statementContext _localctx = new Display_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_display_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(DISPLAY);
			setState(74);
			expression(0);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75);
				match(COMMA);
				setState(76);
				expression(0);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(SEMI);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!W\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26\n"+
		"\2\f\2\16\2\31\13\2\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\5\4$\n\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b:\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bE\n\b\f\b\16"+
		"\bH\13\b\3\t\3\t\3\n\3\n\3\n\3\n\7\nP\n\n\f\n\16\nS\13\n\3\n\3\n\3\n\2"+
		"\3\16\13\2\4\6\b\n\f\16\20\22\2\7\3\2\3\5\3\2\21\25\3\2\26\33\3\2\34\35"+
		"\4\2\6\7\37 \2X\2\27\3\2\2\2\4\35\3\2\2\2\6\37\3\2\2\2\b\'\3\2\2\2\n)"+
		"\3\2\2\2\f+\3\2\2\2\169\3\2\2\2\20I\3\2\2\2\22K\3\2\2\2\24\26\5\4\3\2"+
		"\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2"+
		"\31\27\3\2\2\2\32\36\5\6\4\2\33\36\5\f\7\2\34\36\5\22\n\2\35\32\3\2\2"+
		"\2\35\33\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2\2\37 \5\b\5\2 #\5\n\6\2!\"\7"+
		"\n\2\2\"$\5\16\b\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7\13\2\2&\7\3\2\2\2"+
		"\'(\t\2\2\2(\t\3\2\2\2)*\7!\2\2*\13\3\2\2\2+,\5\n\6\2,-\7\n\2\2-.\5\16"+
		"\b\2./\7\13\2\2/\r\3\2\2\2\60\61\b\b\1\2\61:\5\20\t\2\62:\5\n\6\2\63\64"+
		"\7\r\2\2\64\65\5\16\b\2\65\66\7\16\2\2\66:\3\2\2\2\678\7\36\2\28:\5\16"+
		"\b\39\60\3\2\2\29\62\3\2\2\29\63\3\2\2\29\67\3\2\2\2:F\3\2\2\2;<\f\7\2"+
		"\2<=\t\3\2\2=E\5\16\b\b>?\f\5\2\2?@\t\4\2\2@E\5\16\b\6AB\f\4\2\2BC\t\5"+
		"\2\2CE\5\16\b\5D;\3\2\2\2D>\3\2\2\2DA\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3"+
		"\2\2\2G\17\3\2\2\2HF\3\2\2\2IJ\t\6\2\2J\21\3\2\2\2KL\7\b\2\2LQ\5\16\b"+
		"\2MN\7\f\2\2NP\5\16\b\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2"+
		"\2\2SQ\3\2\2\2TU\7\13\2\2U\23\3\2\2\2\t\27\35#9DFQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}