using Antlr4.Runtime.Misc;
using Interpreter.Grammar;
using System.Reflection.Metadata.Ecma335;
using System.Text.RegularExpressions;

namespace Interpreter.Visitors
{
    internal class CodeVisitor : CodeGrammarBaseVisitor<object>
    {
        private Dictionary<string, object?> Variables { get; } = new Dictionary<string, object?>();

        public override object VisitCode([NotNull] CodeGrammarParser.CodeContext context)
        {
            var code = context.GetText();
            // Visit each statement in the code
            foreach (var statementContext in context.statement())
            {
                Console.WriteLine(statementContext.GetText());
                VisitStatement(statementContext);
            }
            return new object();
        }


        public override object VisitStatement([NotNull] CodeGrammarParser.StatementContext context)
        {
            if (context.assignment_statement() != null)
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

        public override object VisitAssignment_statement([NotNull] CodeGrammarParser.Assignment_statementContext context)
        {
            // Extract the identifier and visit the expression
            var type = context.data_type().GetText();
            var varName = context.IDENTIFIER().GetText();
            var value = context.expression().GetText();

            if (type == "INT" && value.Contains("."))
                return new object();
            if (type == "STRING" || type == "CHAR" || type == "BOOL")
                value = value.Substring(1, value.Length - 2);

            //Console.WriteLine($"{varName} = {value}");

            Variables[varName] = value;

            return new object();
        }

        public override object VisitDisplay_statement([NotNull] CodeGrammarParser.Display_statementContext context)
        {
            //List<CodeGrammarParser.ExpressionContext> expressions = context.expression().ToList();

            // Visit each expression in the display statement
            /*foreach (var expressionContext in context.expression())
            {
                Console.Write(Visit(expressionContext));
            }*/
            var exp = context.expression().GetText();

            if (Variables.TryGetValue(exp, out var value))
            {
                Console.Write($"{value}");
            } else
            {
                Console.Write("No Variable exist");
            }

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
            else
            {
                return new object();
            }
        }

        public override object VisitExpression([NotNull] CodeGrammarParser.ExpressionContext context)
        {
            return new object();
        }

        public override object VisitLiteral([NotNull] CodeGrammarParser.LiteralContext context)
        {
            if (context.BOOLEAN() != null)
            {
                return bool.Parse(context.BOOLEAN().GetText());
            }
            else if (context.INTEGER() != null)
            {
                return int.Parse(context.INTEGER().GetText());
            }
            else if (context.FLOATING() != null)
            {
                return float.Parse(context.FLOATING().GetText());
            }
            else if (context.STRING() != null)
            {
                string text = context.STRING().GetText();
                // Remove the enclosing quotes from the string
                text = text.Substring(1, text.Length - 2);
                // Replace escape sequences with their corresponding characters
                text = Regex.Replace(text, @"\\(.)", "$1");
                return text;
            }
            else
            {
                throw new InvalidOperationException("Unknown literal type");
            }
        }



    }
}

