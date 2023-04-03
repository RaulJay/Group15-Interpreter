// Generated from c:\SCHOOL\COMPUTER SCIENCE\3rd Year\2nd Semester\PROGLANG CS322\Activities\Group9-Interpreter\Interpreter\Interpreter\Grammar\CodeGrammar.g4 by ANTLR 4.9.2
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
		T__0=1, BEGIN=2, BEGINIF=3, END=4, ENDIF=5, DISPLAY=6, AND=7, ASSIGN=8, 
		DIV=9, PLUS=10, MOD=11, MULT=12, MINUS=13, NEQ=14, NOT=15, OR=16, GT=17, 
		GTE=18, LT=19, LTE=20, EQ=21, POWER=22, DOUBLEQ=23, SINGLEQ=24, COMMA=25, 
		RBRACK=26, RPAREN=27, LBRACK=28, LPAREN=29, COLON=30, BOOL=31, CHAR=32, 
		INT=33, FLOAT=34, STRING=35, ELSE=36, IF=37, FALSE=38, TRUE=39, WHITESPACE=40, 
		COMMENT=41, NEWLINE=42, INTEGER=43, FLOATING=44, STRINGS=45, CHARA=46, 
		BOOLEAN=47, IDENTIFIER=48, INT_LITERAL=49, CHAR_LITERAL=50, ID=51;
	public static final int
		RULE_code = 0, RULE_statement = 1, RULE_data_type = 2, RULE_declaration = 3, 
		RULE_declaration_statement = 4, RULE_assignment_statement = 5, RULE_expression = 6, 
		RULE_multOp = 7, RULE_addOp = 8, RULE_compareOp = 9, RULE_boolOp = 10, 
		RULE_exponentOp = 11, RULE_literal = 12, RULE_display_statement = 13, 
		RULE_if_statement = 14, RULE_if_block = 15, RULE_ifelse_block = 16, RULE_block = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "statement", "data_type", "declaration", "declaration_statement", 
			"assignment_statement", "expression", "multOp", "addOp", "compareOp", 
			"boolOp", "exponentOp", "literal", "display_statement", "if_statement", 
			"if_block", "ifelse_block", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'update me later hehe'", "'BEGIN CODE'", "'BEGIN IF'", "'END CODE'", 
			"'END IF'", "'DISPLAY'", "'&'", "'='", "'/'", "'+'", "'%'", "'*'", "'-'", 
			"'!='", "'!'", "'|'", "'>'", "'>='", "'<'", "'<='", "'=='", "'**'", "'"'", 
			"'''", "','", "']'", "')'", "'['", "'('", "':'", "'BOOL'", "'CHAR'", 
			"'INT'", "'FLOAT'", "'STRING'", "'ELSE'", "'IF'", "'FALSE'", "'TRUE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BEGIN", "BEGINIF", "END", "ENDIF", "DISPLAY", "AND", "ASSIGN", 
			"DIV", "PLUS", "MOD", "MULT", "MINUS", "NEQ", "NOT", "OR", "GT", "GTE", 
			"LT", "LTE", "EQ", "POWER", "DOUBLEQ", "SINGLEQ", "COMMA", "RBRACK", 
			"RPAREN", "LBRACK", "LPAREN", "COLON", "BOOL", "CHAR", "INT", "FLOAT", 
			"STRING", "ELSE", "IF", "FALSE", "TRUE", "WHITESPACE", "COMMENT", "NEWLINE", 
			"INTEGER", "FLOATING", "STRINGS", "CHARA", "BOOLEAN", "IDENTIFIER", "INT_LITERAL", 
			"CHAR_LITERAL", "ID"
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
		public TerminalNode BEGIN() { return getToken(CodeGrammarParser.BEGIN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CodeGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CodeGrammarParser.NEWLINE, i);
		}
		public TerminalNode END() { return getToken(CodeGrammarParser.END, 0); }
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(36);
				match(NEWLINE);
				}
			}

			setState(39);
			match(BEGIN);
			setState(40);
			match(NEWLINE);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGINIF) | (1L << DISPLAY) | (1L << BOOL) | (1L << CHAR) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << COMMENT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(41);
				statement();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(NEWLINE);
			setState(48);
			match(END);
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
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Display_statementContext display_statement() {
			return getRuleContext(Display_statementContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(CodeGrammarParser.COMMENT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case CHAR:
			case INT:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				declaration_statement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				assignment_statement();
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				display_statement();
				}
				break;
			case BEGINIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				if_block();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				match(COMMENT);
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CodeGrammarParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(CodeGrammarParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(CodeGrammarParser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(CodeGrammarParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(CodeGrammarParser.STRING, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << CHAR) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
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

	public static class DeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CodeGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CodeGrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeGrammarParser.COMMA, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CodeGrammarParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CodeGrammarParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(IDENTIFIER);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(60);
						match(ASSIGN);
						setState(61);
						match(IDENTIFIER);
						}
						} 
					}
					setState(66);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				{
				setState(67);
				match(ASSIGN);
				setState(68);
				expression(0);
				}
				}
			}

			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(71);
				match(COMMA);
				setState(72);
				match(IDENTIFIER);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(73);
					match(ASSIGN);
					setState(74);
					expression(0);
					}
				}

				}
				}
				setState(81);
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

	public static class Declaration_statementContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CodeGrammarParser.NEWLINE, 0); }
		public Declaration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_statement; }
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			data_type();
			setState(83);
			declaration();
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(84);
				match(NEWLINE);
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CodeGrammarParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(CodeGrammarParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(IDENTIFIER);
			setState(88);
			match(ASSIGN);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					expression(0);
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExponentExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExponentOpContext exponentOp() {
			return getRuleContext(ExponentOpContext.class,0);
		}
		public ExponentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AdditionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public AdditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(CodeGrammarParser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicationExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public MultiplicationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompareOpContext compareOp() {
			return getRuleContext(CompareOpContext.class,0);
		}
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesizeExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(CodeGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodeGrammarParser.RPAREN, 0); }
		public ParenthesizeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public BooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOATING:
			case STRINGS:
			case CHARA:
			case BOOLEAN:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(96);
				literal();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(IDENTIFIER);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenthesizeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(LPAREN);
				setState(99);
				expression(0);
				setState(100);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExponentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(105);
						exponentOp();
						setState(106);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(109);
						multOp();
						setState(110);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(113);
						addOp();
						setState(114);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(117);
						compareOp();
						setState(118);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new BooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(121);
						boolOp();
						setState(122);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class MultOpContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(CodeGrammarParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CodeGrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CodeGrammarParser.MOD, 0); }
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << MULT))) != 0)) ) {
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

	public static class AddOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CodeGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CodeGrammarParser.MINUS, 0); }
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class CompareOpContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CodeGrammarParser.LT, 0); }
		public TerminalNode GT() { return getToken(CodeGrammarParser.GT, 0); }
		public TerminalNode LTE() { return getToken(CodeGrammarParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(CodeGrammarParser.GTE, 0); }
		public TerminalNode EQ() { return getToken(CodeGrammarParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(CodeGrammarParser.NEQ, 0); }
		public CompareOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOp; }
	}

	public final CompareOpContext compareOp() throws RecognitionException {
		CompareOpContext _localctx = new CompareOpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEQ) | (1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE) | (1L << EQ))) != 0)) ) {
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

	public static class BoolOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(CodeGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(CodeGrammarParser.OR, 0); }
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	public static class ExponentOpContext extends ParserRuleContext {
		public TerminalNode POWER() { return getToken(CodeGrammarParser.POWER, 0); }
		public ExponentOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponentOp; }
	}

	public final ExponentOpContext exponentOp() throws RecognitionException {
		ExponentOpContext _localctx = new ExponentOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exponentOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(POWER);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(CodeGrammarParser.INTEGER, 0); }
		public TerminalNode FLOATING() { return getToken(CodeGrammarParser.FLOATING, 0); }
		public TerminalNode STRINGS() { return getToken(CodeGrammarParser.STRINGS, 0); }
		public TerminalNode BOOLEAN() { return getToken(CodeGrammarParser.BOOLEAN, 0); }
		public TerminalNode CHARA() { return getToken(CodeGrammarParser.CHARA, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOATING) | (1L << STRINGS) | (1L << CHARA) | (1L << BOOLEAN))) != 0)) ) {
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
		public TerminalNode COLON() { return getToken(CodeGrammarParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CodeGrammarParser.NEWLINE, 0); }
		public Display_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display_statement; }
	}

	public final Display_statementContext display_statement() throws RecognitionException {
		Display_statementContext _localctx = new Display_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_display_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(DISPLAY);
			setState(142);
			match(COLON);
			setState(143);
			expression(0);
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(144);
				match(NEWLINE);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CodeGrammarParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(CodeGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodeGrammarParser.RPAREN, 0); }
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(CodeGrammarParser.ELSE, 0); }
		public Ifelse_blockContext ifelse_block() {
			return getRuleContext(Ifelse_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IF);
			setState(148);
			match(LPAREN);
			setState(149);
			expression(0);
			setState(150);
			match(RPAREN);
			setState(151);
			if_block();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(152);
				match(ELSE);
				setState(153);
				ifelse_block();
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

	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode BEGINIF() { return getToken(CodeGrammarParser.BEGINIF, 0); }
		public TerminalNode ENDIF() { return getToken(CodeGrammarParser.ENDIF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(BEGINIF);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGINIF) | (1L << DISPLAY) | (1L << BOOL) | (1L << CHAR) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << COMMENT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(157);
				statement();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(ENDIF);
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

	public static class Ifelse_blockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public Ifelse_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse_block; }
	}

	public final Ifelse_blockContext ifelse_block() throws RecognitionException {
		Ifelse_blockContext _localctx = new Ifelse_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifelse_block);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				block();
				}
				break;
			case BEGINIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				if_block();
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__0);
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
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u00ae\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\5\2(\n\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\5\3\5\3\5\7\5A\n\5\f\5\16"+
		"\5D\13\5\3\5\3\5\5\5H\n\5\3\5\3\5\3\5\3\5\5\5N\n\5\7\5P\n\5\f\5\16\5S"+
		"\13\5\3\6\3\6\3\6\5\6X\n\6\3\7\3\7\3\7\7\7]\n\7\f\7\16\7`\13\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bi\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\177\n\b\f\b\16\b\u0082\13"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\5\17\u0094\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u009d\n"+
		"\20\3\21\3\21\7\21\u00a1\n\21\f\21\16\21\u00a4\13\21\3\21\3\21\3\22\3"+
		"\22\5\22\u00aa\n\22\3\23\3\23\3\23\2\3\16\24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\b\3\2!%\4\2\13\13\r\16\4\2\f\f\17\17\4\2\20\20\23\27"+
		"\4\2\t\t\22\22\3\2-\61\2\u00b2\2\'\3\2\2\2\49\3\2\2\2\6;\3\2\2\2\b=\3"+
		"\2\2\2\nT\3\2\2\2\fY\3\2\2\2\16h\3\2\2\2\20\u0083\3\2\2\2\22\u0085\3\2"+
		"\2\2\24\u0087\3\2\2\2\26\u0089\3\2\2\2\30\u008b\3\2\2\2\32\u008d\3\2\2"+
		"\2\34\u008f\3\2\2\2\36\u0095\3\2\2\2 \u009e\3\2\2\2\"\u00a9\3\2\2\2$\u00ab"+
		"\3\2\2\2&(\7,\2\2\'&\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\7\4\2\2*.\7,\2\2+"+
		"-\5\4\3\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3"+
		"\2\2\2\61\62\7,\2\2\62\63\7\6\2\2\63\3\3\2\2\2\64:\5\n\6\2\65:\5\f\7\2"+
		"\66:\5\34\17\2\67:\5 \21\28:\7+\2\29\64\3\2\2\29\65\3\2\2\29\66\3\2\2"+
		"\29\67\3\2\2\298\3\2\2\2:\5\3\2\2\2;<\t\2\2\2<\7\3\2\2\2=G\7\62\2\2>?"+
		"\7\n\2\2?A\7\62\2\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2"+
		"DB\3\2\2\2EF\7\n\2\2FH\5\16\b\2GB\3\2\2\2GH\3\2\2\2HQ\3\2\2\2IJ\7\33\2"+
		"\2JM\7\62\2\2KL\7\n\2\2LN\5\16\b\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OI\3\2"+
		"\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\t\3\2\2\2SQ\3\2\2\2TU\5\6\4\2UW\5"+
		"\b\5\2VX\7,\2\2WV\3\2\2\2WX\3\2\2\2X\13\3\2\2\2YZ\7\62\2\2Z^\7\n\2\2["+
		"]\5\16\b\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\r\3\2\2\2`^\3\2"+
		"\2\2ab\b\b\1\2bi\5\32\16\2ci\7\62\2\2de\7\37\2\2ef\5\16\b\2fg\7\35\2\2"+
		"gi\3\2\2\2ha\3\2\2\2hc\3\2\2\2hd\3\2\2\2i\u0080\3\2\2\2jk\f\7\2\2kl\5"+
		"\30\r\2lm\5\16\b\bm\177\3\2\2\2no\f\6\2\2op\5\20\t\2pq\5\16\b\7q\177\3"+
		"\2\2\2rs\f\5\2\2st\5\22\n\2tu\5\16\b\6u\177\3\2\2\2vw\f\4\2\2wx\5\24\13"+
		"\2xy\5\16\b\5y\177\3\2\2\2z{\f\3\2\2{|\5\26\f\2|}\5\16\b\4}\177\3\2\2"+
		"\2~j\3\2\2\2~n\3\2\2\2~r\3\2\2\2~v\3\2\2\2~z\3\2\2\2\177\u0082\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\17\3\2\2\2\u0082\u0080\3\2\2"+
		"\2\u0083\u0084\t\3\2\2\u0084\21\3\2\2\2\u0085\u0086\t\4\2\2\u0086\23\3"+
		"\2\2\2\u0087\u0088\t\5\2\2\u0088\25\3\2\2\2\u0089\u008a\t\6\2\2\u008a"+
		"\27\3\2\2\2\u008b\u008c\7\30\2\2\u008c\31\3\2\2\2\u008d\u008e\t\7\2\2"+
		"\u008e\33\3\2\2\2\u008f\u0090\7\b\2\2\u0090\u0091\7 \2\2\u0091\u0093\5"+
		"\16\b\2\u0092\u0094\7,\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\35\3\2\2\2\u0095\u0096\7\'\2\2\u0096\u0097\7\37\2\2\u0097\u0098\5\16"+
		"\b\2\u0098\u0099\7\35\2\2\u0099\u009c\5 \21\2\u009a\u009b\7&\2\2\u009b"+
		"\u009d\5\"\22\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\37\3\2\2"+
		"\2\u009e\u00a2\7\5\2\2\u009f\u00a1\5\4\3\2\u00a0\u009f\3\2\2\2\u00a1\u00a4"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a6\7\7\2\2\u00a6!\3\2\2\2\u00a7\u00aa\5$\23\2"+
		"\u00a8\u00aa\5 \21\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa#\3"+
		"\2\2\2\u00ab\u00ac\7\3\2\2\u00ac%\3\2\2\2\22\'.9BGMQW^h~\u0080\u0093\u009c"+
		"\u00a2\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}