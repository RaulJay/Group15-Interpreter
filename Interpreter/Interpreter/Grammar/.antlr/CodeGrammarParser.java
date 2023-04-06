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
		GTE=18, LT=19, LTE=20, EQ=21, POWER=22, DOUBLEQ=23, SINGLEQ=24, DOLLAR=25, 
		AMPERSAND=26, COMMA=27, RBRACK=28, RPAREN=29, LBRACK=30, LPAREN=31, COLON=32, 
		BOOL=33, CHAR=34, INT=35, FLOAT=36, STRING=37, ELSE=38, IF=39, FALSE=40, 
		TRUE=41, WHITESPACE=42, COMMENT=43, NEWLINE=44, INTEGER=45, FLOATING=46, 
		STRINGS=47, CHARA=48, BOOLEAN=49, IDENTIFIER=50, INT_LITERAL=51, CHAR_LITERAL=52, 
		ID=53;
	public static final int
		RULE_code = 0, RULE_statement = 1, RULE_data_type = 2, RULE_declaration = 3, 
		RULE_declaration_statement = 4, RULE_assignment_statement = 5, RULE_expression = 6, 
		RULE_multOp = 7, RULE_addOp = 8, RULE_compareOp = 9, RULE_boolOp = 10, 
		RULE_exponentOp = 11, RULE_literal = 12, RULE_unary_operator = 13, RULE_display_statement = 14, 
		RULE_symbol = 15, RULE_if_statement = 16, RULE_if_block = 17, RULE_ifelse_block = 18, 
		RULE_block = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "statement", "data_type", "declaration", "declaration_statement", 
			"assignment_statement", "expression", "multOp", "addOp", "compareOp", 
			"boolOp", "exponentOp", "literal", "unary_operator", "display_statement", 
			"symbol", "if_statement", "if_block", "ifelse_block", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'update me later hehe'", "'BEGIN CODE'", "'BEGIN IF'", "'END CODE'", 
			"'END IF'", "'DISPLAY'", "'AND'", "'='", "'/'", "'+'", "'%'", "'*'", 
			"'-'", "'<>'", "'NOT'", "'OR'", "'>'", "'>='", "'<'", "'<='", "'=='", 
			"'**'", "'"'", "'''", "'$'", "'&'", "','", "']'", "')'", "'['", "'('", 
			"':'", "'BOOL'", "'CHAR'", "'INT'", "'FLOAT'", "'STRING'", "'ELSE'", 
			"'IF'", "'FALSE'", "'TRUE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BEGIN", "BEGINIF", "END", "ENDIF", "DISPLAY", "AND", "ASSIGN", 
			"DIV", "PLUS", "MOD", "MULT", "MINUS", "NEQ", "NOT", "OR", "GT", "GTE", 
			"LT", "LTE", "EQ", "POWER", "DOUBLEQ", "SINGLEQ", "DOLLAR", "AMPERSAND", 
			"COMMA", "RBRACK", "RPAREN", "LBRACK", "LPAREN", "COLON", "BOOL", "CHAR", 
			"INT", "FLOAT", "STRING", "ELSE", "IF", "FALSE", "TRUE", "WHITESPACE", 
			"COMMENT", "NEWLINE", "INTEGER", "FLOATING", "STRINGS", "CHARA", "BOOLEAN", 
			"IDENTIFIER", "INT_LITERAL", "CHAR_LITERAL", "ID"
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
		public TerminalNode END() { return getToken(CodeGrammarParser.END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CodeGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CodeGrammarParser.NEWLINE, i);
		}
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(40);
				match(NEWLINE);
				}
			}

			setState(43);
			match(BEGIN);
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(44);
				match(NEWLINE);
				}
				break;
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGINIF) | (1L << DISPLAY) | (1L << BOOL) | (1L << CHAR) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << COMMENT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(47);
				statement();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(53);
				match(NEWLINE);
				}
			}

			setState(56);
			match(END);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(57);
				match(NEWLINE);
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
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case CHAR:
			case INT:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				declaration_statement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				assignment_statement();
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				display_statement();
				}
				break;
			case BEGINIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				if_block();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
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
			setState(67);
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
			setState(69);
			match(IDENTIFIER);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70);
						match(ASSIGN);
						setState(71);
						match(IDENTIFIER);
						}
						} 
					}
					setState(76);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				{
				setState(77);
				match(ASSIGN);
				setState(78);
				expression(0);
				}
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(81);
				match(COMMA);
				setState(82);
				match(IDENTIFIER);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(83);
					match(ASSIGN);
					setState(84);
					expression(0);
					}
				}

				}
				}
				setState(91);
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
			setState(92);
			data_type();
			setState(93);
			declaration();
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(94);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(CodeGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CodeGrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CodeGrammarParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CodeGrammarParser.ASSIGN, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(99); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(97);
					match(IDENTIFIER);
					setState(98);
					match(ASSIGN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(101); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(103);
				expression(0);
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
	public static class SpecialCharExpressionContext extends ExpressionContext {
		public TerminalNode LBRACK() { return getToken(CodeGrammarParser.LBRACK, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(CodeGrammarParser.RBRACK, 0); }
		public SpecialCharExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class BracketExpressionContext extends ExpressionContext {
		public List<TerminalNode> RBRACK() { return getTokens(CodeGrammarParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CodeGrammarParser.RBRACK, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracketExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class ConcatExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AMPERSAND() { return getToken(CodeGrammarParser.AMPERSAND, 0); }
		public ConcatExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NewlineExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOLLAR() { return getToken(CodeGrammarParser.DOLLAR, 0); }
		public NewlineExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
			setState(124);
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

				setState(107);
				literal();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(IDENTIFIER);
				}
				break;
			case LBRACK:
				{
				_localctx = new SpecialCharExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(LBRACK);
				setState(110);
				symbol();
				setState(111);
				match(RBRACK);
				}
				break;
			case PLUS:
			case MINUS:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				unary_operator();
				setState(114);
				expression(8);
				}
				break;
			case RBRACK:
				{
				_localctx = new BracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(RBRACK);
				setState(117);
				expression(0);
				setState(118);
				match(RBRACK);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenthesizeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(LPAREN);
				setState(121);
				expression(0);
				setState(122);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ConcatExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(126);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(127);
						match(AMPERSAND);
						setState(128);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new NewlineExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(130);
						match(DOLLAR);
						setState(131);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExponentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(133);
						exponentOp();
						setState(134);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(136);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(137);
						multOp();
						setState(138);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(141);
						addOp();
						setState(142);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(145);
						compareOp();
						setState(146);
						expression(3);
						}
						break;
					case 7:
						{
						_localctx = new BooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(149);
						boolOp();
						setState(150);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			setState(157);
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
			setState(159);
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
			setState(161);
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
		public TerminalNode NOT() { return getToken(CodeGrammarParser.NOT, 0); }
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
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << NOT) | (1L << OR))) != 0)) ) {
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
			setState(165);
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
			setState(167);
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CodeGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CodeGrammarParser.MINUS, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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

	public static class Display_statementContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(CodeGrammarParser.DISPLAY, 0); }
		public TerminalNode COLON() { return getToken(CodeGrammarParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(CodeGrammarParser.AND, 0); }
		public TerminalNode NEWLINE() { return getToken(CodeGrammarParser.NEWLINE, 0); }
		public Display_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display_statement; }
	}

	public final Display_statementContext display_statement() throws RecognitionException {
		Display_statementContext _localctx = new Display_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_display_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(DISPLAY);
			setState(172);
			match(COLON);
			setState(173);
			expression(0);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(174);
				match(AND);
				}
			}

			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(177);
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

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CodeGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodeGrammarParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(CodeGrammarParser.COMMA, 0); }
		public TerminalNode COLON() { return getToken(CodeGrammarParser.COLON, 0); }
		public TerminalNode AND() { return getToken(CodeGrammarParser.AND, 0); }
		public TerminalNode ASSIGN() { return getToken(CodeGrammarParser.ASSIGN, 0); }
		public TerminalNode DIV() { return getToken(CodeGrammarParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(CodeGrammarParser.PLUS, 0); }
		public TerminalNode MOD() { return getToken(CodeGrammarParser.MOD, 0); }
		public TerminalNode MULT() { return getToken(CodeGrammarParser.MULT, 0); }
		public TerminalNode MINUS() { return getToken(CodeGrammarParser.MINUS, 0); }
		public TerminalNode NEQ() { return getToken(CodeGrammarParser.NEQ, 0); }
		public TerminalNode NOT() { return getToken(CodeGrammarParser.NOT, 0); }
		public TerminalNode OR() { return getToken(CodeGrammarParser.OR, 0); }
		public TerminalNode GT() { return getToken(CodeGrammarParser.GT, 0); }
		public TerminalNode LT() { return getToken(CodeGrammarParser.LT, 0); }
		public TerminalNode DOUBLEQ() { return getToken(CodeGrammarParser.DOUBLEQ, 0); }
		public TerminalNode SINGLEQ() { return getToken(CodeGrammarParser.SINGLEQ, 0); }
		public TerminalNode DOLLAR() { return getToken(CodeGrammarParser.DOLLAR, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(LPAREN);
			setState(181);
			match(RPAREN);
			setState(182);
			match(COMMA);
			setState(183);
			match(COLON);
			setState(184);
			match(AND);
			setState(185);
			match(ASSIGN);
			setState(186);
			match(DIV);
			setState(187);
			match(PLUS);
			setState(188);
			match(MOD);
			setState(189);
			match(MULT);
			setState(190);
			match(MINUS);
			setState(191);
			match(NEQ);
			setState(192);
			match(NOT);
			setState(193);
			match(OR);
			setState(194);
			match(GT);
			setState(195);
			match(LT);
			setState(196);
			match(DOUBLEQ);
			setState(197);
			match(SINGLEQ);
			setState(198);
			match(DOLLAR);
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
		enterRule(_localctx, 32, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(IF);
			setState(201);
			match(LPAREN);
			setState(202);
			expression(0);
			setState(203);
			match(RPAREN);
			setState(204);
			if_block();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(205);
				match(ELSE);
				setState(206);
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
		enterRule(_localctx, 34, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(BEGINIF);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGINIF) | (1L << DISPLAY) | (1L << BOOL) | (1L << CHAR) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << COMMENT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(210);
				statement();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
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
		enterRule(_localctx, 36, RULE_ifelse_block);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				block();
				}
				break;
			case BEGINIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
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
		enterRule(_localctx, 38, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u00e3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\5\2,\n\2\3\2\3\2\5\2\60\n\2\3\2\7\2"+
		"\63\n\2\f\2\16\2\66\13\2\3\2\5\29\n\2\3\2\3\2\5\2=\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\5\3D\n\3\3\4\3\4\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\3\5\5\5"+
		"R\n\5\3\5\3\5\3\5\3\5\5\5X\n\5\7\5Z\n\5\f\5\16\5]\13\5\3\6\3\6\3\6\5\6"+
		"b\n\6\3\7\3\7\6\7f\n\7\r\7\16\7g\3\7\5\7k\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009b\n\b\f\b\16\b\u009e\13\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\5\20\u00b2\n\20\3\20\5\20\u00b5\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d2\n\22\3\23\3\23\7\23\u00d6"+
		"\n\23\f\23\16\23\u00d9\13\23\3\23\3\23\3\24\3\24\5\24\u00df\n\24\3\25"+
		"\3\25\3\25\2\3\16\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\b"+
		"\3\2#\'\4\2\13\13\r\16\4\2\f\f\17\17\4\2\20\20\23\27\4\2\t\t\21\22\3\2"+
		"/\63\2\u00ef\2+\3\2\2\2\4C\3\2\2\2\6E\3\2\2\2\bG\3\2\2\2\n^\3\2\2\2\f"+
		"e\3\2\2\2\16~\3\2\2\2\20\u009f\3\2\2\2\22\u00a1\3\2\2\2\24\u00a3\3\2\2"+
		"\2\26\u00a5\3\2\2\2\30\u00a7\3\2\2\2\32\u00a9\3\2\2\2\34\u00ab\3\2\2\2"+
		"\36\u00ad\3\2\2\2 \u00b6\3\2\2\2\"\u00ca\3\2\2\2$\u00d3\3\2\2\2&\u00de"+
		"\3\2\2\2(\u00e0\3\2\2\2*,\7.\2\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-/\7\4\2"+
		"\2.\60\7.\2\2/.\3\2\2\2/\60\3\2\2\2\60\64\3\2\2\2\61\63\5\4\3\2\62\61"+
		"\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\66\64\3"+
		"\2\2\2\679\7.\2\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:<\7\6\2\2;=\7.\2\2<"+
		";\3\2\2\2<=\3\2\2\2=\3\3\2\2\2>D\5\n\6\2?D\5\f\7\2@D\5\36\20\2AD\5$\23"+
		"\2BD\7-\2\2C>\3\2\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\5\3\2\2"+
		"\2EF\t\2\2\2F\7\3\2\2\2GQ\7\64\2\2HI\7\n\2\2IK\7\64\2\2JH\3\2\2\2KN\3"+
		"\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\n\2\2PR\5\16\b\2QL"+
		"\3\2\2\2QR\3\2\2\2R[\3\2\2\2ST\7\35\2\2TW\7\64\2\2UV\7\n\2\2VX\5\16\b"+
		"\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YS\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2"+
		"\2\2\\\t\3\2\2\2][\3\2\2\2^_\5\6\4\2_a\5\b\5\2`b\7.\2\2a`\3\2\2\2ab\3"+
		"\2\2\2b\13\3\2\2\2cd\7\64\2\2df\7\n\2\2ec\3\2\2\2fg\3\2\2\2ge\3\2\2\2"+
		"gh\3\2\2\2hj\3\2\2\2ik\5\16\b\2ji\3\2\2\2jk\3\2\2\2k\r\3\2\2\2lm\b\b\1"+
		"\2m\177\5\32\16\2n\177\7\64\2\2op\7 \2\2pq\5 \21\2qr\7\36\2\2r\177\3\2"+
		"\2\2st\5\34\17\2tu\5\16\b\nu\177\3\2\2\2vw\7\36\2\2wx\5\16\b\2xy\7\36"+
		"\2\2y\177\3\2\2\2z{\7!\2\2{|\5\16\b\2|}\7\37\2\2}\177\3\2\2\2~l\3\2\2"+
		"\2~n\3\2\2\2~o\3\2\2\2~s\3\2\2\2~v\3\2\2\2~z\3\2\2\2\177\u009c\3\2\2\2"+
		"\u0080\u0081\f\f\2\2\u0081\u0082\7\34\2\2\u0082\u009b\5\16\b\r\u0083\u0084"+
		"\f\13\2\2\u0084\u0085\7\33\2\2\u0085\u009b\5\16\b\f\u0086\u0087\f\7\2"+
		"\2\u0087\u0088\5\30\r\2\u0088\u0089\5\16\b\b\u0089\u009b\3\2\2\2\u008a"+
		"\u008b\f\6\2\2\u008b\u008c\5\20\t\2\u008c\u008d\5\16\b\7\u008d\u009b\3"+
		"\2\2\2\u008e\u008f\f\5\2\2\u008f\u0090\5\22\n\2\u0090\u0091\5\16\b\6\u0091"+
		"\u009b\3\2\2\2\u0092\u0093\f\4\2\2\u0093\u0094\5\24\13\2\u0094\u0095\5"+
		"\16\b\5\u0095\u009b\3\2\2\2\u0096\u0097\f\3\2\2\u0097\u0098\5\26\f\2\u0098"+
		"\u0099\5\16\b\4\u0099\u009b\3\2\2\2\u009a\u0080\3\2\2\2\u009a\u0083\3"+
		"\2\2\2\u009a\u0086\3\2\2\2\u009a\u008a\3\2\2\2\u009a\u008e\3\2\2\2\u009a"+
		"\u0092\3\2\2\2\u009a\u0096\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\17\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0"+
		"\t\3\2\2\u00a0\21\3\2\2\2\u00a1\u00a2\t\4\2\2\u00a2\23\3\2\2\2\u00a3\u00a4"+
		"\t\5\2\2\u00a4\25\3\2\2\2\u00a5\u00a6\t\6\2\2\u00a6\27\3\2\2\2\u00a7\u00a8"+
		"\7\30\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\t\7\2\2\u00aa\33\3\2\2\2\u00ab"+
		"\u00ac\t\4\2\2\u00ac\35\3\2\2\2\u00ad\u00ae\7\b\2\2\u00ae\u00af\7\"\2"+
		"\2\u00af\u00b1\5\16\b\2\u00b0\u00b2\7\t\2\2\u00b1\u00b0\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b5\7.\2\2\u00b4\u00b3\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\37\3\2\2\2\u00b6\u00b7\7!\2\2\u00b7\u00b8"+
		"\7\37\2\2\u00b8\u00b9\7\35\2\2\u00b9\u00ba\7\"\2\2\u00ba\u00bb\7\t\2\2"+
		"\u00bb\u00bc\7\n\2\2\u00bc\u00bd\7\13\2\2\u00bd\u00be\7\f\2\2\u00be\u00bf"+
		"\7\r\2\2\u00bf\u00c0\7\16\2\2\u00c0\u00c1\7\17\2\2\u00c1\u00c2\7\20\2"+
		"\2\u00c2\u00c3\7\21\2\2\u00c3\u00c4\7\22\2\2\u00c4\u00c5\7\23\2\2\u00c5"+
		"\u00c6\7\25\2\2\u00c6\u00c7\7\31\2\2\u00c7\u00c8\7\32\2\2\u00c8\u00c9"+
		"\7\33\2\2\u00c9!\3\2\2\2\u00ca\u00cb\7)\2\2\u00cb\u00cc\7!\2\2\u00cc\u00cd"+
		"\5\16\b\2\u00cd\u00ce\7\37\2\2\u00ce\u00d1\5$\23\2\u00cf\u00d0\7(\2\2"+
		"\u00d0\u00d2\5&\24\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2#\3"+
		"\2\2\2\u00d3\u00d7\7\5\2\2\u00d4\u00d6\5\4\3\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\7\2\2\u00db%\3\2\2\2\u00dc\u00df"+
		"\5(\25\2\u00dd\u00df\5$\23\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"\'\3\2\2\2\u00e0\u00e1\7\3\2\2\u00e1)\3\2\2\2\27+/\648<CLQW[agj~\u009a"+
		"\u009c\u00b1\u00b4\u00d1\u00d7\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}