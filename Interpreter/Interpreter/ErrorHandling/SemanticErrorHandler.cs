using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Interpreter.ErrorHandling
{
    public class SemanticErrorHandler
    {
        private static int CodeLine(string codeLine)
        {
            string filePath = "..\\..\\..\\Grammar\\test.code";
            int atLine = 0;
            using (StreamReader reader = new StreamReader(filePath))
            {
                string line;
                while ((line = reader.ReadLine()!) != null)
                {
                    atLine++;

                    line = Regex.Replace(line, @"\s+", "");

                    codeLine = Regex.Replace(codeLine, @"\s+", "");

                    if (Regex.IsMatch(line, codeLine))
                    {
                        return atLine;
                    }
                }
            }

            return 0;
        }
        public static void TypeError(Type type, object value, string dataType, string text)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Statement Declaration at line {location}");
            Console.Error.WriteLine($"Literal Value {value} is not recognized as type of {dataType}");
            Environment.Exit(400);
        }

        public static void boolError(string type, object value)
        {
            Environment.Exit(400);
        }
    }
}