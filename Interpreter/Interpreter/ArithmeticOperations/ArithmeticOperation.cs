

namespace Interpreter.ArithmeticOperations
{
    public class ArithmeticOperation
    {
        public object? Multiply(object x, object y)
        {
            if(x is int && y is int)
                return Multiply(x, y);
            if(x is float && y is float)
                return Multiply(x, y);
            if(x is int && y is float)
                return Multiply(x, y);
            if(x is float && y is int)
                return Multiply(x, y);
            if (x is string && y is string)
                return $"{x}{y}";

            return null;
        }

        public object? Divide(object x, object y)
        {
            if (x is int && y is int)
                return Divide(x, y);
            if (x is float && y is float)
                return Divide(x, y);
            if (x is int && y is float)
                return Divide(x, y);
            if (x is float && y is int)
                return Divide(x, y);
            if (x is string && y is string)
                return $"{x}{y}";

            return null;
        }

        public object? Modulo(object x, object y)
        {
            if (x is int && y is int)
                return Modulo(x, y);
            if (x is float && y is float)
                return Modulo(x, y);
            if (x is int && y is float)
                return Modulo(x, y);
            if (x is float && y is int)
                return Modulo(x, y);
            if (x is string && y is string)
                return $"{x}{y}";

            return null;
        }

        public object? Add(object x, object y)
        {
            if (x is int && y is int)
                return Add(x, y);
            if (x is float && y is float)
                return Add(x, y);
            if (x is int && y is float)
                return Add(x, y);
            if (x is float && y is int)
                return Add(x, y);
            if (x is string && y is string)
                return $"{x}{y}";

            return null;
        }

        public object? Subtract(object x, object y)
        {
            if (x is int && y is int)
                return Subtract(x, y);
            if (x is float && y is float)
                return Subtract(x, y);
            if (x is int && y is float)
                return Subtract(x, y);
            if (x is float && y is int)
                return Subtract(x, y);
            if (x is string && y is string)
                return $"{x}{y}";

            return null;
        }
    }
}
