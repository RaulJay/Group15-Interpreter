using Antlr4.Runtime;
using Interpreter.Visitors;
using Interpreter.Grammar;
using Interpreter.ErrorHandling;

bool isContinue = true;

while(isContinue) {
    var file = "..\\..\\..\\Grammar\\test.code";
    var fileContents = File.ReadAllText(file);

    var inputStream = new AntlrInputStream(fileContents);

    // Create a lexer and parser for the code
    var codeLexer = new CodeGrammarLexer(inputStream);
    CommonTokenStream commonTokenStream = new CommonTokenStream(codeLexer);
    var codeParser = new CodeGrammarParser(commonTokenStream);

    // Error Listener
    var errorListener = new ErrorListener();
    codeParser.AddErrorListener(errorListener);

    var codeContext = codeParser.code();
    // Parse the code and walk the parse tree using the CodeVisitor
    var visitor = new CodeVisitor();
    visitor.VisitCode(codeContext);

    Console.WriteLine("\n\n");
    Console.Write("Finish?(Y/N): ");
    _ = Console.ReadLine()[0] == 'N' ? isContinue = true : isContinue = false;

    Console.WriteLine("********************************************************************");
    Console.WriteLine("\n\n");
}