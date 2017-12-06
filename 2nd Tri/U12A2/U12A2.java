// This program will solve and exit a maze.

import java.util.Scanner;
import java.io.*;

public class U12A2
{
	private ArrayStack stack = new ArrayStack();
	private String[10][10] maze;

	public static void main(String[] args)
	{
		U12A2 app = new U12A2();
	}

	public U12A2()
	{
		fillArray();
		findRoute();
	}
	
	public void fillArray()
	{
		try
		{
			int c;
			
			Scanner in = new Scanner(new File("prg1071a.txt"));
			while(in.hasNext())					// fill maze with prg1071a
			{
				
			}
		}
		catch(IOException e)
		{
			throw new RuntimeException(e.toString());
		}

		printStack(xPos, yPos);
	}

	public void printStack(ArrayStack stack)
	{
		System.out.println("Maze:");
		
		for(int i=0; i<0; i++)
			System.out.println(stack.pop());

		System.out.println();
		System.out.println("Starting position: ("+x+", "+y+")");
	}

	public void findRoute()
	{
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(maze[i][j].equals("S")
				   {
					   
				   }
			}
		}
		for(;;;)
	
	}
}
