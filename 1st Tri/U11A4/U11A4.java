// This program will test the methods of doubly linked lists.

import java.util.Scanner;
import java.io.*;

public class U11A4
{
	private DoublyLinkedList list = new DoublyLinkedList();

	public static void main(String[] args)
	{
		U11A4 app = new U11A4();
	}

	public U11A4()
	{
		try
		{
			Scanner in = new Scanner(new File("VBCode.txt"));

			while(in.hasNext())
				list.addLast(in.nextLine());
		}
		catch(IOException e)
		{
			throw new RuntimeException(e.toString());
		}

		System.out.println(list.toString()+"\n");

		Scanner in = new Scanner(System.in);

		for(int i=0; i<11; i++)
		{
			String ln = in.nextLine();

			if(ln.equals("GN"))
				list.goNext();
			if(ln.equals("GP"))
				list.goPrev();
			if(ln.substring(0, 2).equals("IN"))
			{
				String line = ln.substring(4,ln.length()-1);
				list.insert(line);
			}
			if(ln.equals("DN"))
				list.delete();
			if(ln.equals("PC"))
			{
				list.printContents();
				break;
			}
		}
	}
}