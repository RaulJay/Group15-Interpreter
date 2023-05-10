

namespace Interpreter.ArithmeticOperations
{
    public class ArithmeticOperation
    {
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
    }
}
