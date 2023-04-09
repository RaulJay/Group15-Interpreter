using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
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
        public static void TypeErrorDeclaration(Type type, object value, string dataType, string text)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Declaration Statement at line {location}");
            Console.Error.WriteLine($"Literal Value {value} is not recognized as type of {dataType}");
            Environment.Exit(400);
        }

        public static void TypeErrorAssignment(Type type, object value, string dataType, string text)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Assignment Statement at line {location}");
            Console.Error.WriteLine($"Literal Value {value} is not recognized as type of {dataType}");
            Environment.Exit(400);
        }

        public static void ScanErrorNotExist(string text, string varName)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Scan Statement at line {location}");
            Console.Error.WriteLine($"Variable {varName} is not declared");
            Environment.Exit(400);
        }

        public static void ScanErrorNotNull(string text, string varName)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Scan Statement at line {location}");
            Console.Error.WriteLine($"Variable {varName} already has a value stored");
            Environment.Exit(400);
        }

        public static void ScanErrorNotEqualLength(string text, int inputs, int varNames)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Scan Statement at line {location}");
            Console.Error.WriteLine($"Input has {inputs} value while Scan only takes {varNames} inputs");
            Environment.Exit(400);
        }
    }
}