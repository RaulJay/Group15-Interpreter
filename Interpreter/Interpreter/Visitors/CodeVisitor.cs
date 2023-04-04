﻿using Antlr4.Runtime.Misc;
using Interpreter.ArithmeticOperations;
using Interpreter.Grammar;
using System.ComponentModel.DataAnnotations;
using System.Reflection.Metadata.Ecma335;
using System.Text.RegularExpressions;
using System.Xml.Linq;
using static System.Net.Mime.MediaTypeNames;

namespace Interpreter.Visitors
{
    internal class CodeVisitor : CodeGrammarBaseVisitor<object>
    {
        private Dictionary<string, Variable> Variables { get; } = new Dictionary<string, Variable>();
        private ArithmeticOperation arithmeticOperation = new ArithmeticOperation();


        public override object VisitStatement([NotNull] CodeGrammarParser.StatementContext context)
        {
            if (context.declaration_statement() != null)
            {
                return VisitDeclaration_statement(context.declaration_statement());
            }
            else if (context.assignment_statement() != null)
            {
                return VisitAssignment_statement(context.assignment_statement());
            }
            else if (context.display_statement() != null)
            {
                return VisitDisplay_statement(context.display_statement());
            }
            else
            {
                return new object();
            }
        }

        public override object VisitIdentifierExpression([NotNull] CodeGrammarParser.IdentifierExpressionContext context)
        {
            var identifier = context.IDENTIFIER().GetText();
            if (Variables.ContainsKey(identifier))
            {
                return Variables[identifier].Value;
            }
            else
            {
                throw new Exception($"Variable {identifier} is not declared");
            }
        }

        public override object VisitDeclaration_statement([NotNull] CodeGrammarParser.Declaration_statementContext context)
        {
            String varName;
            object value;
            // Extract variable data type
            var type = Visit(context.data_type()) as Type;
            var typeName = TypeName(type.Name);
            var varNames = context.declaration().IDENTIFIER();

            var declaration = context.declaration().GetText().Split(',');
            var exp = context.declaration().expression();
            int flagExp = 0;

            for (int i = 0; i < declaration.Length; i++)
            {
                if (Variables.ContainsKey(varNames[i].GetText()))
                {
                    Console.WriteLine(varNames[i].GetText() + "is already declared");
                    continue;
                }
                if (declaration[i].Contains('='))
                {
                    if (flagExp < exp.Count())
                    {
                        varName = varNames[i].GetText();
                        Variable val = new Variable()
                        {
                            Name = varName,
                            Value = Visit(exp[flagExp]),
                            DataType = typeName
                        };
                        Variables[varName] = val;
                        flagExp++;
                    }
                }
                else
                {
                    varName = varNames[i].GetText();
                    Variable val = new Variable()
                    {
                        Name = varName,
                        Value = null,
                        DataType = typeName
                    };
                    Variables[varName] = val;
                }
            }

            return new object();
        }

        public override object VisitAssignment_statement([NotNull] CodeGrammarParser.Assignment_statementContext context)
        {
            var identifier = context.IDENTIFIER();
            foreach (var i in identifier)
            {
                var expression = context.expression().Accept(this);
                Variables[i.GetText()].Value = expression;
            }

            return null;
        }

        public static String TypeName(String typeName)
        {
            String typeDisplayName;
            switch (typeName)
            {
                case "Int32":
                    typeDisplayName = "int";
                    break;
                case "Single":
                    typeDisplayName = "float";
                    break;
                case "Boolean":
                    typeDisplayName = "bool";
                    break;
                case "Char":
                    typeDisplayName = "char";
                    break;
                case "String":
                    typeDisplayName = "string";
                    break;
                default:
                    typeDisplayName = typeName;
                    break;
            }

            return typeDisplayName;
        }

        public override object VisitData_type([NotNull] CodeGrammarParser.Data_typeContext context)
        {
            switch (context.GetText())
            {
                case "INT":
                    return typeof(int);
                case "FLOAT":
                    return typeof(float);
                case "BOOL":
                    return typeof(bool);
                case "CHAR":
                    return typeof(char);
                case "STRING":
                    return typeof(string);
                default:
                    throw new NotImplementedException();
            }
        }

        public override object VisitDisplay_statement([NotNull] CodeGrammarParser.Display_statementContext context)
        {
            var varName = context.expression().GetText();

            var value = Visit(context.expression());

            //var value = Variables[varName].Value;
            Console.Write(value);
            return null;
        }


        public override object VisitLiteralExpression([NotNull] CodeGrammarParser.LiteralExpressionContext context)
        {
            if (context.literal().INTEGER() is { } i)
            {
                return int.Parse(i.GetText());
            }
            else if (context.literal().FLOATING() is { } f)
            {
                return float.Parse(f.GetText());
            }
            else if (context.literal().STRINGS() is { } s)
            {
                String text = s.GetText();
                // Remove the enclosing quotes from the string
                text = text.Substring(1, text.Length - 2);
                // Replace escape sequences with their corresponding characters
                text = Regex.Replace(text, "^\"|\"$|\\\\(.)", "$1");
                return text;
            }
            else if (context.literal().CHARA() is { } c)
            {
                string text = c.GetText();
                text = Regex.Replace(text, "^\'|\'$|\\\\(.)", "$1");
                char charaValue = text[0];
                return text;
            }
            else if (context.literal().BOOLEAN() is { } t)
            {
                return bool.Parse(t.GetText());
            }
            else
            {
                return new object();
            }
        }

        public override object VisitMultiplicationExpression([NotNull] CodeGrammarParser.MultiplicationExpressionContext context)
        {
            var left = Visit(context.expression(0));
            var right = Visit(context.expression(1));

            var operation = context.multOp().GetText();

#pragma warning disable CS8603 // Possible null reference return.
            return operation switch
            {
                "*" => arithmeticOperation.Multiply(left, right),
                "/" => arithmeticOperation.Divide(left, right),
                "%" => arithmeticOperation.Modulo(left, right),
                _ => throw new NotImplementedException()
            };
#pragma warning restore CS8603 // Possible null reference return.
        }

        public override object VisitAdditionExpression([NotNull] CodeGrammarParser.AdditionExpressionContext context)
        {
            var left = Visit(context.expression(0));
            var right = Visit(context.expression(1));

            var operation = context.addOp().GetText();

#pragma warning disable CS8603 // Possible null reference return.
            return operation switch
            {
                "+" => arithmeticOperation.Add(left, right),
                "-" => arithmeticOperation.Subtract(left, right),
                _ => throw new NotImplementedException(),
            };
#pragma warning restore CS8603 // Possible null reference return.
        }
    }
}