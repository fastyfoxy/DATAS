// This program will test the methods of NameLists.

import java.util.Scanner;
import java.io.*;

public class U11A2
{
	private NameList myList = new NameList();

	public static void main(String[] args)
	{
		U11A2 app = new U11A2();
	}

	public U11A2()
	{
		try
		{
			Scanner in = new Scanner(new File("u11a2.txt"));

			while(in.hasNext())
				myList.add(in.nextLine());
		}
		catch(IOException e)
		{
			throw new RuntimeException(e.toString());
		}

		myList.delete("Mahler");
		myList.insert("Erickson");
		myList.delete("Baker");
		myList.insert("Adams");
		myList.delete("Wessendorf");
		myList.insert("Zorba");

		System.out.println(myList);
	}
}