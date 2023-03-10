using System.Windows.Forms;

namespace Code_Interpreter
{
    class Program
    {
        static Form1 MyForm;
        public static void Main(string[] args)
        {
            string input = " Hello world";

            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            MyForm = new Form1();
            Application.Run(MyForm);

        }
    }
}
