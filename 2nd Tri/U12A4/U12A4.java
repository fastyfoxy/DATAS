// This program will distribute processing priority.

import java.util.ListIterator;
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
		String[] array = new String[13];

		try
		{
			Scanner in = new Scanner(new File("prg1060z.txt"));

			for(int c=0; in.hasNext(); c++)
			{
				array[c] = in.nextLine();
			}
		}
		catch(IOException e)
		{
			throw new RuntimeException(e.toString());
		}

		for(int i=0; i<array.length; i++)
		{
			if(array[i].substring(0,1).equals("P"))
				acceptReport();
			if(array[i].substring(0,1).equals("U"))
				addReport(array[i]);
			if(array[i].substring(0,1).equals("W"))
				writeQueue();
		}
	}

	public void acceptReport()
	{
		if(queue.isEmpty())
			System.out.println("Pop denied.\nCause: Empty Queue\n");
		else
		{
			System.out.println("Pop accepted.\nCurrently processing job: "+queue.dequeue()+"\n");
		}
	}

	public void addReport(String string)
	{
		if(string.substring(0,1).equals("A"))
			queue.getList().addFirst(string.substring(1));
		else
			queue.enqueue(string.substring(1));
	}

	public void writeQueue()
	{
		System.out.println("Processing Queue Report...");

		ListIterator<String> iter = queue.getList().listIterator();

		while(iter.hasNext())
			System.out.println(iter.next());

		System.out.println("End of Report\n");
	}
}

/*
OUTPUT:

<paste>

*/
