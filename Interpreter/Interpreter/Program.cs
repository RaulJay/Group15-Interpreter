using Antlr4.Runtime;
using Interpreter.Visitors;
using Interpreter.Grammar;

var file = "Grammar\\test.ss";

var fileContents = File.ReadAllText(file);

var inputStream = new AntlrInputStream(fileContents);

// Create a lexer and parser for the code
var codeLexer = new CodeGrammarLexer(inputStream);
CommonTokenStream commonTokenStream = new CommonTokenStream(codeLexer);
var codeParser = new CodeGrammarParser(commonTokenStream);
var codeContext = codeParser.code();

// Parse the code and walk the parse tree using the CodeVisitor
var visitor = new CodeVisitor();
visitor.VisitCode(codeContext);


/*
// Create a lexer and parser for the code
var inputStream = new AntlrInputStream(fileContents);
var lexer = new CodeGrammarLexer(inputStream);
var tokenStream = new CommonTokenStream(lexer);
var parser = new CodeGrammarParser(tokenStream);
var codeContext = codeParser.code();

// Parse the code and walk the parse tree using the CodeVisitor
var visitor = new CodeVisitor();
visitor.Visit(parser.code());
*/