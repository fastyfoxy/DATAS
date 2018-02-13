// This program will act as a waiting line for print operations.

import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class U12A5
{
	private ListQueue queue = new ListQueue();

	public static void main(String[] args)
	{
		U12A5 app = new U12A5();
	}

	public U12A5()
	{
		Scanner in = new Scanner(System.in);
		String task = "";
		int num = 0;

		for(;;)
		{
			System.out.print("Enter task: A)dd, D)elete, E)xit: ");
			task = in.nextLine();

			if(task.equalsIgnoreCase("A"))
			{
				System.out.print("Enter number: ");
				queue.enqueue(Integer.parseInt(in.nextLine()));
			}
			else if(task.equalsIgnoreCase("D"))
			{
				System.out.print("Enter number: ");
				del(Integer.parseInt(in.nextLine()));
			}
			else if(task.equalsIgnoreCase("E"))
			{
				exit();
			}
			else
				break;

			System.out.println("This is the list");
			printQueue();
		}
	}

	public void del(int n)
	{
		LinkedList list = queue.getList();
		ListIterator<Integer> iter = list.listIterator();

		while(iter.hasNext())
			if(n == iter.next())
			{
				iter.remove();
				return;
			}

		System.out.println("Number does not exist");
		return;
	}

	public void printQueue()
	{
		LinkedList list = queue.getList();
		ListIterator<Integer> iter = list.listIterator();

		while(iter.hasNext())
		{
			System.out.print(iter.next()+" ");			// list prints and dequeues
		}

		System.out.println("\n");
	}

	public void exit()
	{
		System.exit(0);
	}
}

/*
OUTPUT:

Enter task: A)dd, D)elete, E)xit: A
Enter number: 10
This is the list
10

Enter task: A)dd, D)elete, E)xit: A
Enter number: 15
This is the list
10 15

Enter task: A)dd, D)elete, E)xit: A
Enter number: 2
This is the list
10 15 2

Enter task: A)dd, D)elete, E)xit: D
Enter number: 10
This is the list
15 2

Enter task: A)dd, D)elete, E)xit: D
Enter number: 2
This is the list
15

Enter task: A)dd, D)elete, E)xit: D
Enter number: 15
This is the list


Enter task: A)dd, D)elete, E)xit: A
Enter number: 7
This is the list
7

Enter task: A)dd, D)elete, E)xit: D
Enter number: 8
Number does not exist
This is the list
7

Enter task: A)dd, D)elete, E)xit: A
Enter number: 12
This is the list
7 12

Enter task: A)dd, D)elete, E)xit: D
Enter number: 12
This is the list
7

Enter task: A)dd, D)elete, E)xit: E

*/
