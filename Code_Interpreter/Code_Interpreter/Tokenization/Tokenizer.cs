
using System;

namespace Perl_Interpreter.Tokenization
{
    public class Tokenizer
    {
        
        private string token = "";
        private int pos;
        string[] words;

        public Tokenizer(string input)
        {
            token= input;
            words = token.Split(' ');
            pos = 0;

        }

        public void print()
        {
            foreach(string word in words)
            {
                Console.WriteLine(word);
            }
        }

        private char CurrentChar()
        {
            return pos >= token.Length ? '\0' : token[pos];
        }
        private void Advance()
        {
            pos++;
        }

        private string GetIdentifier()
        {
            string result = "";

            while (char.IsLetterOrDigit(CurrentChar()))
            {
                result += CurrentChar();
                Advance();
            }

            return result;
        }

        private string GetNumber()
        {
            string result = "";

            while (char.IsDigit(CurrentChar()))
            {
                result += CurrentChar();
                Advance();
            }

            return result;
        }

        private void SkipWhitespace()
        {
            while (char.IsWhiteSpace(CurrentChar()))
            {
                Advance();  
            }
        }

        public Token GetNextToken()
        {
            while (CurrentChar() != '\0')
            {
                if (char.IsWhiteSpace(CurrentChar()))
                {
                    SkipWhitespace();
                    continue;
                }

                /*if (char.IsLetter(CurrentChar()))
                {
                    string identifier = GetIdentifier();
                    return new Token(TokenType.Identifier, identifier);
                }*/

                if (char.IsDigit(CurrentChar()))
                {
                    string number = GetNumber();
                    return new Token(TokenType.Number, number);
                }

                if (CurrentChar() == '+')
                {
                    Advance();
                    return new Token(TokenType.Operator, "+");
                }

                if (CurrentChar() == '-')
                {
                    Advance();
                    return new Token(TokenType.Operator, "-");
                }

                if (CurrentChar() == '*')
                {
                    Advance();
                    return new Token(TokenType.Operator, "*");
                }

                if (CurrentChar() == '/')
                {
                    Advance();
                    return new Token(TokenType.Operator, "/");
                }

                if (CurrentChar() == '(')
                {
                    Advance();
                    return new Token(TokenType.LeftParen, "(");
                }

                if (CurrentChar() == ')')
                {
                    Advance();
                    return new Token(TokenType.RightParen, ")");
                }

                throw new Exception("Invalid character: " + CurrentChar());
            }

            return new Token(TokenType.Number, "");
        }
    }
}
