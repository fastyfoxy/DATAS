// Tariq
//
// This program will test the methods of Stack, and ArrayStack.

import java.util.StringTokenizer;
import java.util.ArrayList;

public class U12A1
{
	private ArrayStack stack1 = new ArrayStack();
	private ArrayStack stack2 = new ArrayStack();
	String exp1 = "5 2 + 8 5 - *";
	String exp2 = "4 7 * 4 9 - /";

	public static void main(String[] args)
	{
		U12A1 app = new U12A1();
	}

	public U12A1()
	{
		evaluate(stack1, exp1);
		evaluate(stack2, exp2);
	}

	public void evaluate(ArrayStack arraystack, String string)
	{
		StringTokenizer st = new StringTokenizer(string);

		while(st.hasMoreTokens())
		{
			String s = st.nextToken();

			if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
			{
				double operand1 = (new Double(arraystack.pop().toString())).doubleValue();
				double operand2 = (new Double(arraystack.pop().toString())).doubleValue();

				if(s.equals("+"))
					arraystack.push(""+(operand2+operand1));
				if(s.equals("-"))
					arraystack.push(""+(operand2-operand1));
				if(s.equals("*"))
					arraystack.push(""+(operand2*operand1));
				if(s.equals("/"))
					arraystack.push(""+(operand2/operand1));
			}
			else
				arraystack.push(s);
		}

		System.out.printf("The Answer is %.1f",(new Double(arraystack.pop().toString())).doubleValue());
		System.out.println();
	}
}