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
		findRoute();
		print(stack);
		printRoute(stack);
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

	public void print(ArrayStack stack)
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
		int vS = Integer.parseInt((((String)stack.peekTop()).substring(0, 1)));
		int hS = Integer.parseInt((((String)stack.peekTop()).substring(2)));

		for(int i=0;i<99;i++)
		{
			if(maze[vS-1][hS].equals("0") || maze[vS-1][hS].equals("E"))		// check up
			{
				stack.push((vS-1)+","+hS);
				vS--;
			}
			else if(maze[vS][hS+1].equals("0") || maze[vS][hS+1].equals("E"))	// check right
			{
				stack.push(vS+","+(hS+1));
				hS++;
			}
			else if(maze[vS+1][hS].equals("0") || maze[vS+1][hS].equals("E"))	// check down
			{
				stack.push((vS+1)+","+hS);
				vS++;
			}
			else if(maze[vS][hS-1].equals("0") || maze[vS][hS-1].equals("E"))	// check left
			{
				stack.push(vS+","+(hS-1));
				hS++;
			}

			maze[vS][hS] = "X";

			if(stack.isEmpty())
			{
				System.out.println("There is nowhere to move.");
				break;
			}
		}

/*		for(int i=0;i<99;i++)
		{
			if(maze[vS-1][hS].equals("0") || maze[vS-1][hS].equals("E"))		// check up
			{
				System.out.println("up");
				stack.push((vS-1)+","+hS);
				vS--;

				if(maze[vS-1][hS].equals("E"))
				{
					System.out.println("Found the Exit!");
					break;
				}
			}
			else if(maze[vS][hS+1].equals("0") || maze[vS][hS+1].equals("E"))	// check right
			{
				System.out.println("right");
				stack.push(vS+","+(hS+1));
				hS++;

				if(maze[vS][hS+1].equals("E"))
				{
					System.out.println("Found the Exit!");
					break;
				}
			}
			else if(maze[vS+1][hS].equals("0") || maze[vS+1][hS].equals("E"))	// check down
			{
				System.out.println("down");
				stack.push((vS+1)+","+hS);
				vS++;

				if(maze[vS+1][hS].equals("E"))
				{
					System.out.println("Found the Exit!");
					break;
				}
			}
			else if(maze[vS][hS-1].equals("0") || maze[vS][hS-1].equals("E"))	// check left
			{
				System.out.println("left");
				stack.push(vS+","+(hS-1));
				hS--;

				if(maze[vS][hS-1].equals("E"))
				{
					System.out.println("Found the Exit!");
					break;
				}
			}
			else																// give up and cry
			{
				System.out.println("There is nowhere to move.");
				break;
			}
		}*/
	}
}
