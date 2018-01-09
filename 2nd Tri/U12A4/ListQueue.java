// This program will set up a ListQueue.

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ListQueue implements Queue
{
	private LinkedList list;

	public ListQueue()
	{
		list = new LinkedList();
	}

	public boolean isEmpty()
	{
		return (list.size() == 0);
	}

	public void enqueue(Object obj)
	{
		list.addLast(obj);
	}

	public Object dequeue()
	{
		if (isEmpty())
			throw new NoSuchElementException();

		return (list.removeFirst());
	}

	public Object peekFront()
	{
		if (isEmpty())
			throw new NoSuchElementException();

		return (list.getFirst());
	}

	public int getSize()
	{
		return list.size();
	}
}
