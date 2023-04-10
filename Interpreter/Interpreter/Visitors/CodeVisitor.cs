using Antlr4.Runtime.Misc;
using Antlr4.Runtime;
using Interpreter.HelperFiles;
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
using System.Runtime.InteropServices;
using System.Security.Cryptography.X509Certificates;

namespace Interpreter.Visitors
{
    public  class CodeVisitor : CodeGrammarBaseVisitor<object>
    {
        private Dictionary<string, Variable> Variables { get; } = new Dictionary<string, Variable>();
        private ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

        /// <summary>
        /// Identifier expression Visitor
        /// </summary>
        /// <param name="context">Identifier Expression</param>
        /// <returns>Value stored in Variable</returns>
        public override object VisitIdentifierExpression([NotNull] CodeGrammarParser.IdentifierExpressionContext context)
        {
            var identifier = context.IDENTIFIER().GetText();
            if (Variables.ContainsKey(identifier))
            {
                return Variables[identifier].Value!;
            }
            else
            {
                SemanticErrorHandler.VariableNotDeclared(context.IDENTIFIER().GetText());
            }

            return new object();
        }

        /// <summary>
        /// Visitor for Declaration Statement.
        /// Store Variable Name and value in a dictionary.
        /// Declarations includes the following:
        /// 1. Declaration of a variable without value.
        /// 2. Declaration of a variable with value.
        /// 3. Declaration of multiple vaaibles with or without value.
        /// Error Handling:
        /// 1. Variable already declared.
        /// 2. Type Error.
        /// </summary>
        /// <param name="context">Declaration Statement</param>
        /// <returns></returns>
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
                if (Variables.ContainsKey(varNames[i].GetText())) SemanticErrorHandler.VariableAlreadyDeclared(varNames[i].GetText(), context.GetText());
                
                if (declaration[i].Contains('='))
                {
                    if (flagExp < exp.Count())
                    {
                        varName = varNames[i].GetText();

                        var literalValue = Visit(exp[flagExp]);
                        var valueType = literalValue.GetType();

                        if (valueType != type) SemanticErrorHandler.TypeErrorDeclaration(literalValue, context.data_type().GetText(), context.GetText());

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

        /// <summary>
        /// Visitor for Data Type.
        /// Will return the type of Data based on the following:
        /// 1. INT as int
        /// 2. FLOAT as float
        /// 3. BOOL as bool
        /// 4. CHAR as char
        /// 5. STRING as string
        /// Error Handling:
        /// 1. Data Type not found.
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
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
                    SemanticErrorHandler.DataTypeError(context.GetText());
                    return new object();
            }
        }

        /// <summary>
        /// Visitor for Assignment Statement.
        /// Store value in a variable.
        /// Assignment Includes:
        /// 1. Assign value to a Variable.
        /// 2. Multiple Assignment.
        /// Error Handling:
        /// 1. Variable is not declared
        /// 2. Variable type not the same as the value type.
        /// </summary>
        /// <param name="context">Assignment Statement</param>
        /// <returns></returns>
        public override object VisitAssignment_statement([NotNull] CodeGrammarParser.Assignment_statementContext context)
        {
            var identifier = context.IDENTIFIER();
            foreach (var i in identifier)
            {
                var expression = context.expression().Accept(this);

                if (Variables.ContainsKey(i.GetText()) == false) SemanticErrorHandler.VariableNotDeclared(i.GetText(), context.expression().GetText());
                if (Variables[i.GetText()].DataType != expression.GetType()) SemanticErrorHandler.TypeErrorAssignment(expression, Variables[i.GetText()].Type!, context.GetText());

                Variables[i.GetText()].Value = expression;
            }

            return new object();
        }
        /// <summary>
        /// Visitor for Display Statement
        /// Output the value of a variable.
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitDisplay_statement([NotNull] CodeGrammarParser.Display_statementContext context)
        {
            var varName = context.expression().GetText();

            var value = Visit(context.expression());

            if (value != null) value = value.GetType() == typeof(bool) ? value.ToString()!.ToUpper() : value;

            Console.Write(value);
            return new object();
        }
        /// <summary>
        /// Visit Scan Statement
        /// Scan value from the user and store it in a variable.
        /// Error Handling:
        /// 1. Variable is not declared.
        /// 2. Variable is already assigned a value.
        /// 3. Type Error.
        /// 4. Input is not a valid value.
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override object VisitScan_statement([NotNull] CodeGrammarParser.Scan_statementContext context)
        {
            int flagvarNames = 0;
            var varNames = context.IDENTIFIER();


            bool allExist = varNames.All(name => Variables.ContainsKey(name.GetText()));
            if (allExist == false)
            {
                foreach (var name in varNames)
                {
                    if (!Variables.ContainsKey(name.GetText())) SemanticErrorHandler.ScanErrorNotExist(context.GetText(), name.GetText());
                }
            }

            bool allNull = varNames.All(v => Variables[v.GetText()].Value == null);
            if (allNull == false)
            {
                foreach (var name in varNames)
                {
                    if (Variables[name.GetText()].Value != null) SemanticErrorHandler.ScanErrorNotNull(context.GetText(), name.GetText());
                }
            }

            String[] inputs = Console.ReadLine()!.Split(',');

            bool equalLength = (varNames.Length == inputs.Length);
            if (equalLength == false) SemanticErrorHandler.ScanErrorNotEqualLength(context.GetText(), inputs.Length, varNames.Length);

            foreach(var input in inputs)
            {

                Type inputType = HelperFunctions.TypeParser(input).Item1;
                var value = HelperFunctions.TypeParser(input).Item2;

                if (inputType == Variables[varNames[flagvarNames].GetText()].DataType)
                { 
                    Variables[varNames[flagvarNames].GetText()].Value = value;
                }
                else SemanticErrorHandler.ScanErrorNotValid(context.GetText(), input, inputType, Variables[varNames[flagvarNames].GetText()].DataType!);

                flagvarNames++;
            }

            return new object();
        }

        /// <summary>
        /// Visitor for Concatenated Display Statement.
        /// </summary>
        /// <param name="context">Concat Statement</param>
        /// <returns>Values of the left and right expression.</returns>
        public override object VisitConcatExpression([NotNull] CodeGrammarParser.ConcatExpressionContext context)
        {

            var left = Visit(context.expression(0));
            var right = Visit(context.expression(1));

            if (left != null) left = left.GetType() == typeof(bool) ? left.ToString()!.ToUpper() : left;
            if (right != null) right = right.GetType() == typeof(bool) ? right.ToString()!.ToUpper() : right;

            return $"{left}{right}";
        }

        /// <summary>
        /// Visitor for the Newline Expression in Display Statement
        /// </summary>
        /// <param name="context">Newline symbol ($)</param>
        /// <returns>Escape Sequence that will force the cursor to change position to the beginning of the next line.</returns>
        public override object VisitNewlineExpression([NotNull] CodeGrammarParser.NewlineExpressionContext context)
        {
            return "\n";
        }

        /// <summary>
        /// Visitor for Special Charater Expression.
        /// Uses two square brackets as the ecape code.
        /// </summary>
        /// <param name="context">Special Character enclosed in two square brackets</param>
        /// <returns>Character between two square brackets</returns>
        public override object VisitSpecialCharExpression([NotNull] CodeGrammarParser.SpecialCharExpressionContext context)
        {
            return context.SYMBOL().GetText()[1];
        }

        /// <summary>
        /// Visitor for Literal Expression.
        /// </summary>
        /// <param name="context"></param>
        /// <returns>
        /// Will return the following:
        /// 1. If literal is an integer will return an integer.
        /// 2. If literal is a float will return a float.
        /// 3. If literal is a string will return a string.
        /// 4. If literal is a boolean will return a boolean.
        /// 5. If literal is a character will return a character.
        /// If not, will return null.
        /// </returns>
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
                return charaValue;
            }
            else
            {
                return new object();
            }
        }

        /// <summary>
        /// Visitor for Unary Expression.
        /// Visits the UnaryOperation Function from the ArithmeticOperation class.
        /// Error Handling:
        /// 1. If the value is not an integer or a float, will throw an error.
        /// </summary>
        /// <param name="context">Unary Expression</param>
        /// <returns>Result of the expression</returns>
        public override object VisitUnaryExpression([NotNull] CodeGrammarParser.UnaryExpressionContext context)
        {
            var value = Visit(context.expression());

            if (value.GetType() != typeof(int) && value.GetType() != typeof(float)) SemanticErrorHandler.UnaryErrorValue(context.GetText(), value);

            return ArithmeticOperation.UnaryOperation(context.unary_operator().GetText(), value);
        }


        /// <summary>
        /// Visitor for Bracket Expression
        /// </summary>
        /// <param name="context">Bracket Expression</param>
        /// <returns>Value inside the brackets</returns>
        public override object VisitBracketExpression([NotNull] CodeGrammarParser.BracketExpressionContext context)
        {
            return Visit(context.expression());
        }
        
        /// <summary>
        /// Visitor for Parenthesis Expression
        /// </summary>
        /// <param name="context">Parenthesis Expression</param>
        /// <returns>Value inside the parenthesis</returns>
        public override object VisitParenthesizeExpression([NotNull] CodeGrammarParser.ParenthesizeExpressionContext context)
        {
            return Visit(context.expression());
        }

        /// <summary>
        /// Visitor for Multiplication Expression.
        /// MultOp Contains:
        /// 1. Multiplication
        /// 2. Division
        /// 3. Modulo
        /// 4. Exponentiation
        /// </summary>
        /// <param name="context">Multiplication Expression</param>
        /// <returns>
        /// Arithmetic Operation result of the following:
        /// 1. Multiplication
        /// 2. Division
        /// 3. Modulo
        /// </returns>
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

        /// <summary>
        /// Visitor for Addition Expression.
        /// AddOp Contains:
        /// 1. Addition
        /// 2. Subtraction
        /// </summary>
        /// <param name="context">Addition Expression</param>
        /// <returns>
        /// Arithmetic Operation result of the following:
        /// 1. Addition
        /// 2. Subtraction
        /// </returns>
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

        /// <summary>
        /// Visitor for Comparison Expression.
        /// CompOp contains:
        /// 1. Less than
        /// 2. Less than or equal to
        /// 3. Greater than
        /// 4. Greater than or equal to
        /// 5. Equal to
        /// 6. Not equal to
        /// </summary>
        /// <param name="context">Comparison Expression</param>
        /// <returns>
        /// Boolean Output of the following Operation:
        /// 1. Less than
        /// 2. Less than or equal to
        /// 3. Greater than
        /// 4. Greater than or equal to
        /// 5. Equal to
        /// 6. Not equal to
        /// </returns>
        public override object VisitComparisonExpression([NotNull] CodeGrammarParser.ComparisonExpressionContext context)
        {
            var left = Visit(context.expression(0));
            var op = context.compareOp().GetText();
            var right = Visit(context.expression(1));
            var results = context;

            switch (op)
            {
                case "<":
                    return (dynamic)left < (dynamic)right? true: false;
                case "<=":
                    return (dynamic)left <= (dynamic)right ? true : false;
                case ">":
                    return (dynamic)left > (dynamic)right ? true : false;
                case ">=":
                    return (dynamic)left >= (dynamic)right ? true : false;
                case "==":
                    return (dynamic)left == (dynamic)right ? true : false;
                case "<>":
                    return (dynamic)left != (dynamic)right ? true : false;
                default:
                    throw new Exception($"Invalid comparison operator: {op}");
            }
        }

        /// <summary>
        /// Visitor for Boolean Expression.
        /// BoolOp contains:
        /// 1. AND
        /// 2. OR
        /// </summary>
        /// <param name="context">Boolean Expression</param>
        /// <returns>
        /// Boolean Result of the following Operation:
        /// 1. AND
        /// 2. OR
        /// </returns>
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

        /// <summary>
        /// Visitor for If Statement.
        /// Contains the following conditional Statement:
        /// 1. If
        /// 2. If else
        /// 3. If else if else
        /// 4. Nested If
        /// </summary>
        /// <param name="context"> If Statement Expression</param>
        public override object VisitIf_statement([NotNull] CodeGrammarParser.If_statementContext context)
        {
            CodeGrammarParser.Condition_blockContext[] conditions = context.condition_block();

            bool evaluatedBlock = false;

            foreach(CodeGrammarParser.Condition_blockContext condition in conditions)
            {
                var evaluated = Visit(condition.expression());

                if (bool.Parse(evaluated.ToString()!) == true)
                {
                    evaluatedBlock = true;
                    Visit(condition.if_block());
                    break;
                }
            }

            if (!evaluatedBlock && context.if_block() != null)
            {
                Visit(context.if_block());
            }

            return new object();
        }


        /// <summary>
        /// Visitor for NOT Boolean Expression.
        /// </summary>
        /// <param name="context">Not Boolean Expression</param>
        /// <returns> Opposite of the boolean value</returns>
        public override object VisitNotBooleanExpression([NotNull] CodeGrammarParser.NotBooleanExpressionContext context)
        {
            var right = Convert.ToBoolean(Visit(context.expression()));
            return !(dynamic)right;
        }

        /// <summary>
        /// Visitor for While Statement.
        /// Error Handling:
        /// 1. Infinite Loop
        /// </summary>
        /// <param name="context">While Statement</param>
        public override object VisitWhile_statement([NotNull] CodeGrammarParser.While_statementContext context)
        {
            var value = Visit(context.expression());
            int currIterations = 0;
            int maxIterations = 1000;

            while (bool.Parse(value.ToString()!) == true)
            {
                currIterations++;
                if (currIterations > maxIterations)
                {
                    SemanticErrorHandler.WhileInfiniteLoop(context.GetText());
                }

                Visit(context.while_block());

                value = Visit(context.expression());
            }

            return new object();
        }
    }
}