using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interpreter.ErrorHandling
{
    public class SemanticErrorHandler
    {
        public void SemanticError(string message)
        {
            Console.Error.WriteLine($"Semantic error: {message}");
            Environment.Exit(400);
        }

        public void boolError(string type, object value)
        {
            Environment.Exit(400);
        }
    }
}