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

            // Print the line of the code that has the error
            string[] lines = recognizer.InputStream.ToString().Split(new[] { "\r\n", "\r", "\n" }, StringSplitOptions.None);
            if (line > 0 && line <= lines.Length)
            {
                Console.Error.WriteLine($"Code line {line}: {lines[line - 1]}");
            }

            Environment.Exit(400);
        }
    }
}