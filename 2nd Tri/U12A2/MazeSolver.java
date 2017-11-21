// This program will solve and exit a maze.

import java.util.Scanner;
import java.io.*;

public class MazeSolver
{
	private ArrayStack stack = new ArrayStack();

	public static void main(String[] args)
	{
		MazeSolver mazesolver = new MazeSolver();
	}

	public MazeSolver()
	{
		int xPos = 2;
		int yPos = 1;

		try
		{
			Scanner in = new Scanner(new File("prg1071a.txt"));
			while(in.hasNext())
				stack.push(in.nextLine());
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

	public void printStack(int x, int y)
	{
		System.out.println("Maze:");

		String[] a = new String[10];

		for(int i=0; i<10; i++)
			a[i] = (String)stack.pop();

		for(int i=10; i>0; i--)
			System.out.println(a[i-1]);

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