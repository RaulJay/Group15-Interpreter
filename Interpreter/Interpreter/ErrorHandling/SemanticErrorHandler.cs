using Antlr4.Runtime.Atn;
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using static System.Net.Mime.MediaTypeNames;

namespace Interpreter.ErrorHandling
{
    public class SemanticErrorHandler
    {
        /// <summary>
        /// Finds the line number of the code line
        /// </summary>
        /// <param name="codeLine">Text to find in file</param>
        /// <returns>Integer value of the line position</returns>
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

        /// <summary>
        /// Error Handling for Variables that are declared but is already declared.
        /// </summary>
        /// <param name="variableName">Name of the Variable</param>
        /// <param name="text">Text to find in file</param>
        public static void VariableAlreadyDeclared(string variableName, string text)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Declaration Statement at line {location}");
            Console.Error.WriteLine($"Variable {variableName} is already declared");
            Environment.Exit(400);
        }

        /// <summary>
        /// Error Handling for Variables with inputs that is a different data type from the declared name.
        /// </summary>
        /// <param name="value">Input Value</param>
        /// <param name="dataType">Data type of the Variable Declared</param>
        /// <param name="text">Text to find in file</param>
        public static void TypeErrorDeclaration(object value, string dataType, string text)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Declaration Statement at line {location}");
            Console.Error.WriteLine($"Literal Value {value} is not recognized as type of {dataType}");
            Environment.Exit(400);
        }

        /// <summary>
        /// Error Handling for Variables with inputs that cannot use unary operations.
        /// </summary>
        /// <param name="text">Text to find in file</param>
        /// <param name="value">Value that caused error</param>
        public static void UnaryErrorValue(string text, object value)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Unary Operation at line {location}");
            Console.Error.WriteLine($"Value is of type {value.GetType()} and cannot use unary operations");
            Environment.Exit(400);
        }

        /// <summary>
        /// Error Handling for Variables that are assigned with values of different data Type.
        /// </summary>
        /// <param name="value">Value that caused the error</param>
        /// <param name="dataType">Data Type of the Variable</param>
        /// <param name="text">Text to find in file</param>
        public static void TypeErrorAssignment(object value, string dataType, string text)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Assignment Statement at line {location}");
            Console.Error.WriteLine($"Literal Value {value} is not recognized as type of {dataType}");
            Environment.Exit(400);
        }

        /// <summary>
        /// Error Handling for Variables that are not declared.
        /// </summary>
        /// <param name="variableName">Variable Name</param>
        /// <param name="text">Text to find in file</param>
        public static void VariableNotDeclared(string variableName, string text)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Variable Expression at line {location}");
            Console.Error.WriteLine($"Variable {variableName} is not declared");
            Environment.Exit(400);
        }

        /// <summary>
        /// Error Handling for Declaration Statements with invalid Data Types.
        /// </summary>
        /// <param name="text">Text to find in file</param>
        public static void DataTypeError(string text)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Declaration Statement at line {location}");
            Console.Error.WriteLine($"Data Type {text} is not an accepted  Data type");
            Environment.Exit(400);
        }

        /// <summary>
        /// Error Handling for Scan Statement with variables that are not declared.
        /// </summary>
        /// <param name="text">Text to find in file</param>
        /// <param name="varName">Variable name that is not declared</param>
        public static void ScanErrorNotExist(string text, string varName)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Scan Statement at line {location}");
            Console.Error.WriteLine($"Variable {varName} is not declared");
            Environment.Exit(400);
        }

        /// <summary>
        /// Error Handling for Scan Statement with variables that are already assigned a value.
        /// </summary>
        /// <param name="text">Text to find in file</param>
        /// <param name="varName">Variable Name that already has value</param>
        public static void ScanErrorNotNull(string text, string varName)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Scan Statement at line {location}");
            Console.Error.WriteLine($"Variable {varName} already has a value stored");
            Environment.Exit(400);
        }

        /// <summary>
        /// Error Handling for Scan Statement with inputs that are not equal to the number of variables.
        /// </summary>
        /// <param name="text">Text to find in file</param>
        /// <param name="inputs">Number of inputs</param>
        /// <param name="varNames">Number of Variables</param>
        public static void ScanErrorNotEqualLength(string text, int inputs, int varNames)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Scan Statement at line {location}");
            Console.Error.WriteLine($"Input has {inputs} value while Scan only takes {varNames} inputs");
            Environment.Exit(400);
        }

        /// <summary>
        /// Error Handling for Scan Statement with input having different data type from the variable.
        /// </summary>
        /// <param name="text">Text to find in file</param>
        /// <param name="varName">Variable Name/param>
        /// <param name="input">Input Type</param>
        /// <param name="variable">Variable Type</param>
        public static void ScanErrorNotValid(string text, string varName, Type input, Type variable)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Scan Statement at line {location}");
            Console.Error.WriteLine($"Variable {varName} accepts value of type {variable}. Input is of type {input}");
            Environment.Exit(400);
        }

        /// <summary>
        /// Error Handling Variable is not declared for Identifier
        /// </summary>
        /// <param name="text">Text to find in file</param>
        public static void VariableNotDeclared(string text)
        {
            Console.Error.WriteLine($"Semantic Error: Variable {text} is not declared");
            Environment.Exit(400);
        }

        /// <summary>
        /// Error Handling for While Statement with possible infinite loop
        /// </summary>
        /// <param name="text">Text to find in file</param>
        public static void WhileInfiniteLoop(string text)
        {
            int location = CodeLine(text);
            Console.Error.WriteLine($"Semantic Error: While Statement at line {location}");
            Console.Error.WriteLine($"Possible infinite loop detected");
            Environment.Exit(400);
        }

        /// <summary>
        /// Error Handling for For Loop Statement with possible infinite loop
        /// </summary>
        /// <param name="text">Text to find in file</param>
        public static void ForInfiniteLoop(string text)
        {
            int location = CodeLine(text);
            Console.Error.WriteLine($"Semantic Error: For Loop Statement at line {location}");
            Console.Error.WriteLine($"Possible infinite loop detected");
            Environment.Exit(400);
        }
    }
}