using Antlr4.Runtime.Misc;
using Interpreter.Grammar;
using System.Linq.Expressions;
using System.Text.RegularExpressions;

namespace Interpreter
{
    internal class CodeVisitor : CodeGrammarBaseVisitor<object>
    {
        private Dictionary<string, object?> Variables { get; } = new Dictionary<string, object?>();

        public override object VisitCode([NotNull] CodeGrammarParser.CodeContext context)
        {
            foreach (var statementContext in context.statement())
            {
                VisitStatement(statementContext);
            }

            return null;
        }

        public override object VisitStatement([NotNull] CodeGrammarParser.StatementContext context)
        {
            if (context.assignment_statement() != null) 
            {
                return VisitAssignment_statement(context.assignment_statement());
            }
            if (context.display_statement() != null) 
            {
                return VisitDisplay_statement(context.display_statement());
            }
            /*else if (context.if_block() != null)
            {
                return VisitIf_block(context.if_block());
            }*/
            else
            {
                return null;
            }
        }

        public override object VisitAssignment_statement([NotNull] CodeGrammarParser.Assignment_statementContext context)
        {
            // Extract the identifier and visit the expression
            var varName = context.IDENTIFIER().GetText();
            var value = Visit(context.expression());

            Console.WriteLine($"Assignment statement: {varName} = {value}");

            Variables[varName] = value;

            // Ibalihin ko sa Display_Statement later ah
            foreach (var var in Variables)
            {
                Console.WriteLine("{0}", var.Value);
            }

            return null;
        }
            
        public override object VisitDisplay_statement(CodeGrammarParser.Display_statementContext context)
        {
            //List<CodeGrammarParser.ExpressionContext> expressions = context.expression().ToList();

            // Visit each expression in the display statement
            /*foreach (var expressionContext in context.expression())
            {
                Console.Write(Visit(expressionContext));
            }*/
            foreach (var variable in Variables)
            {
                if (variable.Key == "z")
                {
                    Console.WriteLine("{0} = {1}", variable.Key, variable.Value);
                    break;
                }
            }

            Console.WriteLine(); 

            return null;
        }

        public override object VisitExpression([NotNull] CodeGrammarParser.ExpressionContext context)
        {
            if (context.literal != null)
            {
                return VisitLiteral(context.literal());
            }
            /*else if (context.IDENTIFIER() != null)
            {
                return VisitIDENTIFIER(context.IDENTIFIER());
            }*/
            else if (context.PLUS != null || context.MINUS != null || context.MULT != null
                || context.DIV != null || context.MOD != null)
            {
                object left = VisitExpression(context.expression(0));
                object right = VisitExpression(context.expression(1));
                if (context.PLUS != null)
                {
                    if (left is int && right is int)
                    {
                        return (int)left + (int)right;
                    }
                    else if (left is float && right is float)
                    {
                        return (float)left + (float)right;
                    }
                    else if (left is string || right is string)
                    {
                        return left.ToString() + right.ToString();
                    }
                    else
                    {
                        throw new ArgumentException("Invalid operands for '+' operator.");
                    }
                }
                else if (context.MINUS != null)
                {
                    if (left is int && right is int)
                    {
                        return (int)left - (int)right;
                    }
                    else if (left is float && right is float)
                    {
                        return (float)left - (float)right;
                    }
                    else
                    {
                        throw new ArgumentException("Invalid operands for '-' operator.");
                    }
                }
                else if (context.MULT != null)
                {
                    if (left is int && right is int)
                    {
                        return (int)left * (int)right;
                    }
                    else if (left is float && right is float)
                    {
                        return (float)left * (float)right;
                    }
                    else
                    {
                        throw new ArgumentException("Invalid operands for '*' operator.");
                    }
                }
                else if (context.DIV != null)
                {
                    if (left is int && right is int)
                    {
                        return (int)left / (int)right;
                    }
                    else if (left is float && right is float)
                    {
                        return (float)left / (float)right;
                    }
                    else
                    {
                        throw new ArgumentException("Invalid operands for '/' operator.");
                    }
                }
                else if (context.MOD != null)
                {
                    if (left is int && right is int)
                    {
                        return (int)left % (int)right;
                    }
                    else
                    {
                        throw new ArgumentException("Invalid operands for '%' operator.");
                    }
                }
            }
            else if (context.NOT != null)
            {
                object value = VisitExpression(context.expression(0));
                if (value is bool)
                {
                    return !(bool)value;
                }
                else
                {
                    throw new ArgumentException("Invalid operand for '!' operator.");
                }
            }
            else if (context.LPAREN() != null && context.RPAREN() != null)
            {
                return VisitExpression(context.expression(0));
            }
            else
            {
                throw new ArgumentException("Invalid expression.");
            }
            return null;
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
            else if (context.FLOAT() != null)
            {
                return float.Parse(context.FLOAT().GetText());
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
    
