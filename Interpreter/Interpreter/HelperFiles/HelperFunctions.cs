using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Interpreter.HelperFiles
{
    public class HelperFunctions
    {
        public static (Type, object) TypeParser(string input)
        {

            if (int.TryParse(input, out int intValue))
            {
                return (typeof(int), intValue);
            }
            else if (float.TryParse(input, out float floatValue))
            {
                return (typeof(float), floatValue);
            }
            else if (char.TryParse(input, out char charValue))
            {
                return (typeof(char), charValue);
            }
            else if (Regex.IsMatch(input, @"^[A-Za-z]+$"))
            {
                if (input == "TRUE")
                {
                    return (typeof(bool), bool.Parse("true"));
                }
                else if (input == "FALSE")
                {
                    return (typeof(bool), bool.Parse("false"));
                }
                else
                {
                    return (typeof(String), input);
                }
            }
            else
            {
                return (typeof(String), input);
            }
        }
    }
}
