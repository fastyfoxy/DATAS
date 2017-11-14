// Tariq
//
// This program will test the methods of Stack, and ArrayStack.

import java.util.StringTokenizer;
import java.util.ArrayList;

public class U12A1
{
	private ArrayStack stack1;
	private ArrayStack stack2;
	String exp1 = "5 2 + 8 5 - *";
	String exp2 = "4 7 * 4 9 - /";

	public static void main(String[] args)
	{
		U12A1 app = new U12A1();
	}

	public U12A1()
	{
		evaluate(stack1, exp1);
	}

	public void evaluate(ArrayStack stack, String exp)
	{
		StringTokenizer st = new StringTokenizer(exp);

		while (st.hasMoreTokens())
		{
			if(st.nextToken().equals("+") || st.nextToken().equals("-") || st.nextToken().equals("*") ||st.nextToken().equals("/"))
				stack.push(st.nextToken());
			else
			{

			}
		}
	}
}