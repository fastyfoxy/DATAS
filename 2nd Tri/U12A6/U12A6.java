// This program will test the methods of the ERPatient and MyPriorityQueue classes.

import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class U12A6
{
	private MyPriorityQueue queue = new MyPriorityQueue();

	public U12A6()
	{
		try
		{
			Scanner in = new Scanner(new File("ER.txt"));

			while(in.hasNext())
			{
				String input = in.nextLine();
				System.out.println(input);

				if(input.substring(0,1).equals("P"))
				{
					StringTokenizer st = new StringTokenizer(in.nextLine());

					while(st.hasMoreTokens())
					{
						String n = st.nextToken()+st.nextToken();
						String c;
						System.out.println(n);
					}
				}
				else
				{

				}
			}
		}
		catch(IOException e)
		{
			throw new RuntimeException(e.toString());
		}
	}

	public static void main(String[] args)
	{

	}
}

/*
OUTPUT:

//

*/
