using Perl_Interpreter.Tokenization;

namespace Code_Interpreter
{
    class Program
    {
        public static void Main(string[] args)
        {
            string input = " Hello world";
            Tokenizer tokenizer = new Tokenizer(input);
            tokenizer.print();

        }
    }
}
