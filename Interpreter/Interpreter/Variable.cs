
namespace Interpreter
{
    public class Variable
    {
        public String Name { get; set; }
        public Type DataType { get; set; }
        public object? Value { get; set; }
        // public int Line { get; set; }

        public override string ToString()
        {
            string valueString;
            if (Value == null)
                valueString = "null";
            else if (Value is string)
                valueString = $@"""{Value}""";
            else if (Value is bool)
                valueString = Value.ToString().ToLower();
            else
                valueString = Value.ToString();

            return $"    Variable Name: {Name} \n    Value: {valueString} \n    Data Type: {DataType}";
        }
    }
}
