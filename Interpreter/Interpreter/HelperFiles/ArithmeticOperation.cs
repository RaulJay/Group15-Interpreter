

namespace Interpreter.HelperFiles
{
    public class ArithmeticOperation
    {
        /// <summary>
        /// Multiplication Operation
        /// </summary>
        /// <param name="x">Left Expression</param>
        /// <param name="y">Right Expression</param>
        /// <returns></returns>
        public object? Multiply(object x, object y)
        {
            if (x is int l && y is int r)
                return l * r;
            if(x is float lf && y is float rf)
                return lf * rf;
            if(x is int li && y is float rf2)
                return li * rf2;
            if(x is float lf2 && y is int ri)
                return lf2 * ri;
            if (x is string && y is string)
                return $"{x}{y}";

            return null;
        }

        /// <summary>
        /// Division Operation
        /// </summary>
        /// <param name="x">Left Expression</param>
        /// <param name="y">Right Expression</param>
        /// <returns></returns>
        public object? Divide(object x, object y)
        {
            if (x is int l && y is int r)
                return l / r;
            if (x is float lf && y is float rf)
                return lf / rf;
            if (x is int li && y is float rf2)
                return li / rf2;
            if (x is float lf2 && y is int ri)
                return lf2 / ri;
            if (x is string && y is string)
                return $"{x}{y}";

            return null;
        }

        /// <summary>
        /// Modulo Operation
        /// </summary>
        /// <param name="x">Left Expression</param>
        /// <param name="y">Right Expression</param>
        /// <returns></returns>
        public object? Modulo(object x, object y)
        {
            if (x is int l && y is int r)
                return l % r;
            if (x is float lf && y is float rf)
                return lf % rf;
            if (x is int li && y is float rf2)
                return li % rf2;
            if (x is float lf2 && y is int ri)
                return lf2 % ri;
            if (x is string && y is string)
                return $"{x}{y}";

            return null;
        }

        /// <summary>
        /// Addition Operation
        /// </summary>
        /// <param name="x">Left Expression</param>
        /// <param name="y">Right Expression</param>
        /// <returns></returns>
        public object? Add(object x, object y)
        {
            if (x is int l && y is int r)
                return l +r;
            if (x is float lf && y is float rf)
                return lf + rf;
            if (x is int li && y is float rf2)
                return li + rf2;
            if (x is float lf2 && y is int ri)
                return lf2 + ri;
            if (x is string && y is string)
                return $"{x}{y}";

            return null;
        }

        /// <summary>
        /// Subtraction Operation
        /// </summary>
        /// <param name="x">Left Expression</param>
        /// <param name="y">Right Expression</param>
        /// <returns></returns>
        public object? Subtract(object x, object y)
        {
            if (x is int l && y is int r)
                return l - r;
            if (x is float lf && y is float rf)
                return lf - rf;
            if (x is int li && y is float rf2)
                return li - rf2;
            if (x is float lf2 && y is int ri)
                return lf2 - ri;
            if (x is string && y is string)
                return $"{x}{y}";

            return null;
        }

        /// <summary>
        /// Unary Operation
        /// </summary>
        /// <param name="x">Left Expression</param>
        /// <param name="y">Right Expression</param>
        /// <returns></returns>
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
                            return ++intValue;
                        case float floatValue:
                            return ++floatValue;
                        default:
                            throw new ArgumentException("Unary increment is not supported for this value type.");
                    }
                case "--":
                    switch (value)
                    {
                        case int intValue:
                            return --intValue;
                        case float floatValue:
                            return --floatValue;
                        default:
                            throw new ArgumentException("Unary decrement is not supported for this value type.");
                    }
                default:
                    throw new ArgumentException($"Unary operator {symbol} is not supported.");
            }
        }
    }
}
