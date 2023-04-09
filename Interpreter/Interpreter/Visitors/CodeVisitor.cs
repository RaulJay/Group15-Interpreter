using Antlr4.Runtime.Misc;
using Interpreter.ArithmeticOperations;
using Interpreter.Grammar;
using Microsoft.Win32.SafeHandles;
using Interpreter.ErrorHandling;
using System.ComponentModel.DataAnnotations;
using System.Reflection.Metadata.Ecma335;
using System.Runtime.ConstrainedExecution;
using System.Text.RegularExpressions;
using System.Xml.Linq;
using static System.Net.Mime.MediaTypeNames;
using System.Linq.Expressions;

namespace Interpreter.Visitors
{
    public  class CodeVisitor : CodeGrammarBaseVisitor<object>
    {
        private Dictionary<string, Variable> Variables { get; } = new Dictionary<string, Variable>();
        private ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

        public override object VisitIdentifierExpression([NotNull] CodeGrammarParser.IdentifierExpressionContext context)
        {
            var identifier = context.IDENTIFIER().GetText();
            if (Variables.ContainsKey(identifier))
            {
                return Variables[identifier].Value!;
            }
            else
            {
                throw new Exception($"Variable {identifier} is not declared");
            }
        }

        public override object VisitDeclaration_statement([NotNull] CodeGrammarParser.Declaration_statementContext context)
        {
            String varName;
            // Extract variable data type
            var type = Visit(context.data_type()) as Type;

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

                        var literalValue = Visit(exp[flagExp]);

                        var valueType = literalValue.GetType();

                        if (valueType != type)
                        {
                            SemanticErrorHandler.TypeErrorDeclaration(type!, literalValue, context.data_type().GetText(), context.GetText());
                        }

                        Variable val = new Variable()
                        {
                            Type = context.data_type().GetText(),
                            Name = varName,
                            Value = Visit(exp[flagExp]),
                            DataType = type
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
                        Type = context.data_type().GetText(),
                        Name = varName,
                        Value = null,
                        DataType = type
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

                if (Variables[i.GetText()].DataType != expression.GetType())
                {
                    SemanticErrorHandler.TypeErrorAssignment(Variables[i.GetText()].DataType!, expression, Variables[i.GetText()].Type!, context.GetText());
                }
                Variables[i.GetText()].Value = expression;
            }

            return new object();
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

            value = value.GetType() == typeof(bool) ? value.ToString()!.ToUpper() : value;

            Console.Write(value);
            return new object();
        }

        public override object VisitConcatExpression([NotNull] CodeGrammarParser.ConcatExpressionContext context)
        {
            var left = Visit(context.expression(0));
            var right = Visit(context.expression(1));

            left = left.GetType() == typeof(bool) ? left.ToString()!.ToUpper() : left;
            right = left.GetType() == typeof(bool) ? right.ToString()!.ToUpper() : right;

            return $"{left}{right}";
        }

        public override object VisitNewlineExpression([NotNull] CodeGrammarParser.NewlineExpressionContext context)
        {
            var left = Visit(context.expression(0));
            var right = Visit(context.expression(1));

            return $"{left}\n{right}";
        }

        public override object VisitSpecialCharExpression([NotNull] CodeGrammarParser.SpecialCharExpressionContext context)
        {
            var exp = context.symbol().GetText();


            return $"{exp}";
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
                text = text.Substring(1, text.Length - 2);
                text = Regex.Replace(text, "^\"|\"$|\\\\(.)", "$1");

                if (text == "TRUE")
                {
                    return bool.Parse("true");
                } 
                else if (text == "FALSE")
                {
                    return bool.Parse("false");
                }
                return text;
            }
            else if (context.literal().CHARA() is { } c)
            {
                string text = c.GetText();
                text = Regex.Replace(text, "^\'|\'$|\\\\(.)", "$1");
                char charaValue = text[0];
                return text;
            }
            else
            {
                return new object();
            }
        }

        public override object VisitUnaryExpression([NotNull] CodeGrammarParser.UnaryExpressionContext context)
        {
            return UnaryOperation(context.unary_operator().GetText(), Visit(context.expression()));
        }

        public static object UnaryOperation(string symbol, object value)
        {
            switch (symbol)
            {
                case "+":
                    return value;
                case "-":
                    switch (value)
                    {
                        case int intValue:
                            return -intValue;
                        case float floatValue:
                            return -floatValue;
                        default:
                            throw new ArgumentException("Unary negation is not supported for this value type.");
                    }
                case "++":
                    switch (value)
                    {
                        case int intValue:
                            return intValue + 1;
                        case float floatValue:
                            return floatValue + 1;
                        default:
                            throw new ArgumentException("Unary increment is not supported for this value type.");
                    }
                case "--":
                    switch (value)
                    {
                        case int intValue:
                            return intValue - 1;
                        case float floatValue:
                            return floatValue -1;
                        default:
                            throw new ArgumentException("Unary decrement is not supported for this value type.");
                    }
                default:
                    throw new ArgumentException($"Unary operator {symbol} is not supported.");
            }
        }

        public override object VisitBracketExpression([NotNull] CodeGrammarParser.BracketExpressionContext context)
        {
            return Visit(context.expression());
        }

        public override object VisitParenthesizeExpression([NotNull] CodeGrammarParser.ParenthesizeExpressionContext context)
        {
            return Visit(context.expression());
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

        public override object VisitComparisonExpression([NotNull] CodeGrammarParser.ComparisonExpressionContext context)
        {
            var left = Visit(context.expression(0));
            var op = context.compareOp().GetText();
            var right = Visit(context.expression(1));
            var results = context;

            switch (op)
            {
                case "<":
                    return (dynamic)left < (dynamic)right? "True": "False";
                case "<=":
                    return (dynamic)left <= (dynamic)right ? "True" : "False";
                case ">":
                    return (dynamic)left > (dynamic)right ? "True" : "False";
                case ">=":
                    return (dynamic)left >= (dynamic)right ? "True" : "False"; ;
                case "==":
                    return (dynamic)left == (dynamic)right ? "True" : "False";
                case "<>":
                    return (dynamic)left != (dynamic)right ? "True" : "False";
                default:
                    throw new Exception($"Invalid comparison operator: {op}");
            }
        }

        public override object VisitBooleanExpression([NotNull] CodeGrammarParser.BooleanExpressionContext context)
        {
            var left = Convert.ToBoolean(Visit(context.expression(0)));
            var right = Convert.ToBoolean(Visit(context.expression(1)));
            var op = context.boolOp().GetText();

            switch (op)
            {
                case "AND":
                    return (dynamic)left && right;
                case "OR":
                    return (dynamic)left || right;
                default:
                    throw new NotSupportedException($"Boolean operator {context.boolOp().GetText()} is not supported.");
            }
        }

        public override object VisitNotBooleanExpression([NotNull] CodeGrammarParser.NotBooleanExpressionContext context)
        {
            var right = Convert.ToBoolean(Visit(context.expression()));
            return !(dynamic)right;
        }
    }
}