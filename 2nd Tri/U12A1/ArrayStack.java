// Tariq
//
// This program will use an ArrayList to create a Stack.

// TODO: FINISH INT/DOUBLE HANDLING

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

		if(elements.get(elements.size()-1) instanceof Integer || elements.get(elements.size()-1) instanceof Double)
			return popNum();

		//else if(elements.get(elements.size()-1) instanceof Double)
		//	return (Double) elements.remove(elements.size()-1).doubleValue();

		return elements.remove(elements.size()-1);
	}

	public Object peekTop()
	{
		if(isEmpty())
			throw new NoSuchElementException();

		return elements.get(elements.size()-1);
	}

	public int popNum()
	{
		if(elements.get(elements.size()-1) instanceof Double)
			return (Double) elements.remove(elements.size()-1).doubleValue();

		if(elements.get(elements.size()-1) instanceof Integer)
			return (Double) elements.remove(elements.size()-1).doubleValue();

	}
}
