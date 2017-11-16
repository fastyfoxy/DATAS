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

	public void evaluate(ArrayStack arraystack, String str)
	{
		StringTokenizer st = new StringTokenizer(str);

		while(st.hasMoreTokens())
		{
			String s = st.nextToken();

			if(isInteger(s))
				arraystack.push(s);
			else
			{
				Integer operand1 = (Integer) arraystack.pop();
				Integer operand2 = (Integer) arraystack.pop();

				if(st.nextToken().equals("+"))
					arraystack.push(operand2+operand1);
				if(st.nextToken().equals("-"))
					arraystack.push(operand2-operand1);
				if(st.nextToken().equals("*"))
					arraystack.push(operand2*operand1);
				if(st.nextToken().equals("/"))
					arraystack.push(operand2/operand1);
			}
		}

		System.out.printf("%.1f", arraystack.peekTop());
		System.out.println();
	}

	public boolean isInteger(String str)
	{
	    try
	    {
	        Integer.parseInt(str);
	        return true;
	    }
	    catch(Exception e)
	    {
	        return false;
	    }
	}
}
