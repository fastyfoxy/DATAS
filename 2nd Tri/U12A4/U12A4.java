// This program will distribute processing priority.

import java.util.Scanner;
import java.io.*;

public class U12A4
{
	private ListQueue queue = new ListQueue();

	public static void main(String[] args)
	{
		U12A4 app = new U12A4();
	}

	public U12A4()
	{
		try
		{
			Scanner in = new Scanner(new File("prg1060z.txt"));

			for(int c=0; in.hasNext(); c++)
			{
				String line = in.nextLine();

				for(int i=0; i<10; i++)
					queue.enqueue(line);
			}
		}
		catch(IOException e)
		{
			throw new RuntimeException(e.toString());
		}

		for(int i=0; i<queue.size(); i++)
		{

		}
	}
}
