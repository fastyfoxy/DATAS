// This program will solve and exit a maze.

import java.util.Scanner;
import java.io.*;

public class U12A2
{
	private ArrayStack stack = new ArrayStack();

	public static void main(String[] args)
	{
		U12A2 app = new U12A2();
	}

	public U12A2()
	{
		try
		{
			String[] temp = new String[10];
			int c;
			
			Scanner in = new Scanner(new File("prg1071a.txt"));
			while(in.hasNext())
			{
				temp[c] = in.nextLine();
				c++;
			}
			
			for(int i=0; i<10; i++)
				stack.push(temp.pop());
		}
		catch(IOException e)
		{
			throw new RuntimeException(e.toString());
		}

		printStack(xPos, yPos);
		if(findRoute())
			printRoute();
		else
			failed();
	}

	public void printStack(ArrayStack stack)
	{
		System.out.println("Maze:");
		
		for(int i=0; i<0; i++)
			System.out.println(stack.pop());

		System.out.println();
		System.out.println("Starting position: ("+x+", "+y+")");
	}

	public boolean findRoute()
	{
		return false;
	}

	public void failed()
	{

	}

	public void printRoute()
	{

	}
}
