
namespace Perl_Interpreter.Tokenization
{
    public enum TokenType
    {
        NotDefined,
        And,
        CloseParenthesis,
        Comma,
        Equals,
        ExceptionType,
        In,
        Invalid,
        LeftParen,
        Like,
        Match,
        Message,
        NotEquals,
        NotIn,
        NotLike,
        Number,
        Or,
        OpenParenthesis,
        Operator,
        RightParen,
        StringValue,
        SequenceTerminator
    }

    public class Token
    {
        public TokenType Type { get; }
        public string Value { get; }

        public Token(TokenType type, string value)
        {
            Type = type;
            Value = value;
        }
    }
}