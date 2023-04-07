using System;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Dfa;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Sharpen;

namespace Interpreter.ErrorHandling
{
    public class ErrorListener : BaseErrorListener
    {
        public override void SyntaxError(IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
        {
            Console.Error.WriteLine($"Syntax error: Unexpected symbol {offendingSymbol.Text.Replace("\r\n", "NEWLINE")} at line {line}, column {charPositionInLine + 1}");
            Console.Error.WriteLine($"Details: {msg[0].ToString().ToUpper() + msg[1..].Replace("\\r\\n", "")}");
            Environment.Exit(400);
            base.SyntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
        }
    }
}