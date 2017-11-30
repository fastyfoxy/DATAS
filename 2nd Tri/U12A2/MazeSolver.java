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
		try
		{
			ArrayStack temp = new ArrrayStack();
			
			Scanner in = new Scanner(new File("prg1071a.txt"));
			while(in.hasNext())
				temp.push(in.nextLine());
			
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
