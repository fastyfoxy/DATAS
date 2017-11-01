// This program will test the methods of circular linkedlists.

import java.util.Scanner;

public class U11A3
{
	private CircularLinkedList list = new CircularLinkedList();

	public static void main(String[] args)
	{
		U11A3 app = new U11A3();
	}

	public U11A3()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of employees laid off: ");
		int numOfEmployees = in.nextInt();

		fillArray(numOfEmployees);

		System.out.println("When releasing "+numOfEmployees+" employees, you need to be in position "+list.downsize());
	}

	public void fillArray(int n)
	{
		for(int i=0; i<n; i++)
			list.addLast(i+1);
	}
}