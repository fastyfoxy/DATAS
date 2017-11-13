// Tariq
//
// This program will use an ArrayList to create a Stack.

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayStack implements Stack
{
	private ArrayList elements;

	public ArrayStack()
	{
		elements = new ArrayList();
	}

	public boolean isEmpty()
	{
		return (elements.size() == 0);
	}

	public void push(Object obj)
	{
		elements.add(obj);
	}

	public Object pop()
	{
		if(isEmpty())
			throw new NoSuchElementException();

		return elements.remove(elements.size()-1);
	}

	public Object peekTop()
	{
		if(isEmpty())
			throw new NoSuchElementException();

		return elements.get(elements.size()-1);
	}
}