// This program will solve and exit a maze.

import java.util.Scanner;
import java.io.*;

public class U12A2
{
	private ArrayStack stack = new ArrayStack();
	private String[][] maze = new String[10][10];

	public static void main(String[] args)
	{
		U12A2 app = new U12A2();
	}

	public U12A2()
	{
		fill();
	//	findRoute();
		printStack(stack);
	//	printRoute(stack);
	}

	public void fill()
	{
		try
		{
			Scanner in = new Scanner(new File("prg1071a.txt"));
			int c=0;

			while(in.hasNext())
			{
				String line = in.nextLine();

				for(int i=0; i<10; i++)
					maze[c][i] = line.substring(i, i+1);
				c++;
			}
		}
		catch(IOException e)
		{
			throw new RuntimeException(e.toString());
		}

		for(int i=0; i<10; i++)
			for(int j=0; j<10; j++)
				if(maze[i][j].equals("S"))
					stack.push(i+","+j);
	}

	public void printStack(ArrayStack stack)
	{
		System.out.println("Maze:");

		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
				System.out.print(maze[i][j]);

			System.out.println();
		}

		System.out.println("\n"+"Starting position: ("+stack.peekTop()+")");
	}

	public void printRoute(ArrayStack stack)
	{
		for(int i=0; !stack.isEmpty(); i++)
		{
			if(i%9 == 0)
				System.out.println();
			System.out.print(stack.pop()+"  ");
		}
	}

	public void findRoute()
	{
		for(int i=0; i<10; i++)					// FINDS STARTING POINT (2, 1)
			for(int j=0; j<10; j++)
				if(maze[i][j].equals("S"))
					stack.push(i+", "+j);		// PUSHES TO STACK
		
		// <ROUTE FINDER>
		// look up, right, left, down
		// 
	}
}
