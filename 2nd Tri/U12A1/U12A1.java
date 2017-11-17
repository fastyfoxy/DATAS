// Tariq
//
// This program will test the methods of Stack, and ArrayStack.

//TODO: solve double problem, is currently optimized for int

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

	public void evaluate(ArrayStack arraystack, String str)
	{
		StringTokenizer st = new StringTokenizer(str);

		while(st.hasMoreTokens())
		{
			String s = st.nextToken();

			if(isInteger(s))
				arraystack.push(Integer.valueOf(s));
			else
			{
				Integer operand1 = (Integer) arraystack.pop();
				Integer operand2 = (Integer) arraystack.pop();

				if(s.equals("+"))
					arraystack.push(operand2+operand1);
				if(s.equals("-"))
					arraystack.push(operand2-operand1);
				if(s.equals("*"))
					arraystack.push(operand2*operand1);
				if(s.equals("/"))
					arraystack.push(operand2/operand1);
			}
		}

		System.out.printf("The Answer is %.1f",(double)((Integer)arraystack.peekTop()).intValue());
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
