using Antlr4.Runtime.Misc;
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
            else if (context.display_statement() != null)
            {
                return VisitDisplay_statement(context.display_statement());
            }
            else
            {
                return new object();
            }
        }

        public override object VisitDeclaration_statement([NotNull] CodeGrammarParser.Declaration_statementContext context)
        {
            String varName;
            object value;
            // Extract the identifier and visit the expression
            var type = Visit(context.data_type()) as Type;
            var typeName = TypeName(type.Name);
            var declared = context.declaration().GetText();
            var declaration = declared.Split(',');

            foreach (var dec in declaration)
            {
                if (dec.Contains('='))
                {
                    var equalIndex = dec.IndexOf('=');
                    varName = dec.Substring(0, equalIndex);

                    if (equalIndex + 1 == dec.Length - 1)
                    {
                        value = dec.Substring(equalIndex + 1);
                    }
                    else
                    {
                        value = dec.Substring(equalIndex + 1);
                    }

                    value = ConvertToType(value, type);

                    Variable val = new Variable()
                    {
                        Name = varName,
                        Value = value,
                        DataType = typeName
                    };

                    Variables[varName] = val;
                }
                // Declaration INT x
                else
                {
                    varName = dec;
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

        public static object ConvertToType(object value, Type type)
        {
            if (type == typeof(int))
            {
                return int.Parse(value.ToString());
            }
            else if (type == typeof(float))
            {
                return float.Parse(value.ToString());
            }
            else if (type == typeof(bool))
            {
                return bool.Parse(value.ToString());
            }
            else if (type == typeof(char))
            {
                string text = value.ToString();
                char character = text[1];
                return character;
            }
            else if (type == typeof(string))
            {
                String text = value.ToString();
                // Remove the enclosing quotes from the string
                text = text.Substring(1, text.Length - 2);
                // Replace escape sequences with their corresponding characters
                text = Regex.Replace(text, "^\"|\"$|\\\\(.)", "$1");
                return text;
            }
            else
            {
                throw new NotImplementedException();
            }
        }

        public override object VisitDisplay_statement([NotNull] CodeGrammarParser.Display_statementContext context)
        {
            var varName = context.expression().GetText();

            var value = Variables[varName].Value;
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
                String text =  s.GetText();
                // Remove the enclosing quotes from the string
                text = text.Substring(1, text.Length - 2);
                // Replace escape sequences with their corresponding characters
                text = Regex.Replace(text, "^\"|\"$|\\\\(.)", "$1");
                return text;
            }
            else if (context.literal().CHARA() is { } c)
            {
                string text = c.GetText();
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