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
		print();
		findRoute();
	}

	public void fill()
	{
		try
		{
			Scanner in = new Scanner(new File("prg1071a.txt"));

			for(int c=0; in.hasNext(); c++)
			{
				String line = in.nextLine();

				for(int i=0; i<10; i++)
					maze[c][i] = line.substring(i, i+1);
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

	public void print()
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

	public void findRoute()
	{
		int vS = Integer.parseInt((((String)stack.peekTop()).substring(0, 1)));
		int hS = Integer.parseInt((((String)stack.peekTop()).substring(2)));

		System.out.print("Locations:\n"+vS+","+hS+"  ");

		for(int i=1;;i++)
		{
			if(maze[vS][hS].equals("E"))
			{
				System.out.println("\nFound exit!");
				break;
			}

			if(maze[vS-1][hS].equals("0") || maze[vS-1][hS].equals("E"))
			{
				stack.push((vS-1)+","+hS);
				maze[vS][hS] = "X";
			}

			else if(maze[vS][hS+1].equals("0") || maze[vS][hS+1].equals("E"))
			{
				stack.push(vS+","+(hS+1));
				maze[vS][hS] = "X";
			}

			else if(maze[vS+1][hS].equals("0") || maze[vS+1][hS].equals("E"))
			{
				stack.push((vS+1)+","+hS);
				maze[vS][hS] = "X";
			}

			else if(maze[vS][hS-1].equals("0") || maze[vS][hS-1].equals("E"))
			{
				stack.push(vS+","+(hS-1));
				maze[vS][hS] = "X";
			}

			if(stack.isEmpty())
			{
				System.out.println("There is nowhere to move.");
				break;
			}

			if(i%9 == 0)
				System.out.println();
			System.out.print(stack.peekTop()+"  ");

			vS = Integer.parseInt((((String)stack.peekTop()).substring(0, 1)));
			hS = Integer.parseInt((((String)stack.pop()).substring(2)));
		}
	}
}

/* OUTPUT:

Maze:
1111111111
100001000E
1S10011011
1011001011
1011101001
1100001101
1100010001
1101100111
1100001011
1111111111

Starting position: (2,1)
Locations:
2,1  1,1  1,2  1,3  1,4  2,4  3,4  3,5  4,5
5,5  5,4  6,4  6,3  5,3  5,2  6,2  7,2  8,2
8,3  8,4  8,5  7,5  7,6  6,6  6,7  6,8  5,8
4,8  4,7  3,7  2,7  1,7  1,8  1,9
Found exit!

*/