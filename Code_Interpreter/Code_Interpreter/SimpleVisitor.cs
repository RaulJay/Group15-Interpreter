using Antlr4.Runtime.Misc;
using Code_Interpreter.Content;

namespace Code_Interpreter
{
    public class SimpleVisitor : SimpleBaseVisitor<object?>
    {
        private Dictionary<string, object> variables = new Dictionary<string, object>();

        public override object VisitCode(SimpleParser.CodeContext context)
        {
            foreach (var statement in context.statement())
            {
                Visit(statement);
            }
            return null;
        }

        public override object VisitVariable_declaration(SimpleParser.Variable_declarationContext context)
        {
            string dataType = context.data_type().GetText();
            string identifier = context.identifier().GetText();
            object value = null;

            if (context.expression() != null)
            {
                value = Visit(context.expression());
            }

            switch (dataType)
            {
                case "INT":
                    variables[identifier] = (int)value;
                    break;
                case "CHAR":
                    variables[identifier] = (char)value;
                    break;
                case "BOOL":
                    variables[identifier] = (bool)value;
                    break;
            }

            return null;
        }

        public override object VisitAssignment_statement(SimpleParser.Assignment_statementContext context)
        {
            string identifier = context.identifier().GetText();
            object value = Visit(context.expression());

            if (!variables.ContainsKey(identifier))
            {
                throw new Exception($"Variable {identifier} not declared.");
            }

            variables[identifier] = value;

            return null;
        }

        public override object VisitDisplay_statement(SimpleParser.Display_statementContext context)
        {
            foreach (var expressionContext in context.expression())
            {
                Console.Write(Visit(expressionContext));
            }
            Console.WriteLine();
            return null;
        }

        public override object VisitLiteral(SimpleParser.LiteralContext context)
        {
            if (context.INT_LITERAL() != null)
            {
                return int.Parse(context.INT_LITERAL().GetText());
            }
            else if (context.CHAR_LITERAL() != null)
            {
                string text = context.CHAR_LITERAL().GetText();
                return text.Substring(1, text.Length - 2)[0];
            }
            else if (context.TRUE() != null)
            {
                return true;
            }
            else if (context.FALSE() != null)
            {
                return false;
            }
            else
            {
                throw new Exception($"Unknown literal {context.GetText()}");
            }
        }

        public override object VisitIdentifier(SimpleParser.IdentifierContext context)
        {
            string identifier = context.GetText();
            if (!variables.ContainsKey(identifier))
            {
                throw new Exception($"Variable {identifier} not declared.");
            }
            return variables[identifier];
        }

        public override object VisitExpression([NotNull] SimpleParser.ExpressionContext context)
        {
            return base.VisitExpression(context);
        }

        public override object VisitData_type([NotNull] SimpleParser.Data_typeContext context)
        {
            return base.VisitData_type(context);
        }

        public override object VisitStatement(SimpleParser.StatementContext context)
        {
            return true;
        }
    }
}
