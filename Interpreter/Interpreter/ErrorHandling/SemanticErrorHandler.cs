﻿using Antlr4.Runtime.Atn;
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

        public static void VariableAlreadyDeclared(string variableName, string text)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Declaration Statement at line {location}");
            Console.Error.WriteLine($"Variable {variableName} is already declared");
            Environment.Exit(400);
        }
        public static void TypeErrorDeclaration(Type type, object value, string dataType, string text)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Declaration Statement at line {location}");
            Console.Error.WriteLine($"Literal Value {value} is not recognized as type of {dataType}");
            Environment.Exit(400);
        }

        public static void UnaryErrorValue(string text, object value)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Unary Operation at line {location}");
            Console.Error.WriteLine($"Value is of type {value.GetType()} and cannot use unary operations");
            Environment.Exit(400);
        }

        public static void TypeErrorAssignment(Type type, object value, string dataType, string text)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Assignment Statement at line {location}");
            Console.Error.WriteLine($"Literal Value {value} is not recognized as type of {dataType}");
            Environment.Exit(400);
        }

        public static void VariableNotDeclared(string variableName, string text)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Variable Expression at line {location}");
            Console.Error.WriteLine($"Variable {variableName} is not declared");
            Environment.Exit(400);
        }

        public static void DataTypeError(string text)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Declaration Statement at line {location}");
            Console.Error.WriteLine($"Data Type {text} is not an accepted  Data type");
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

        public static void ScanErrorNotValid(string text, string varName, Type input, Type variable)
        {
            int location = CodeLine(text);

            Console.Error.WriteLine($"Semantic Error: Scan Statement at line {location}");
            Console.Error.WriteLine($"Variable {varName} accepts value of type {variable}. Input is of type {input}");
            Environment.Exit(400);
        }

        public static void VariableNotDeclared(string text)
        {
            Console.Error.WriteLine($"Semantic Error: Variable {text} is not declared");
            Environment.Exit(400);
        }
    }
}