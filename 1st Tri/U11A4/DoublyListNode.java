// This program will set up a doubly list node.

public class DoublyListNode
{
	private Object value;
	private DoublyListNode next;
	private DoublyListNode prev;

	public DoublyListNode(DoublyListNode initPrev, Object obj, DoublyListNode initNext)
	{
		value = obj;
		prev = initPrev;
		next = initNext;
	}

	public DoublyListNode getPrev()
	{
		return prev;
	}

	public DoublyListNode getNext()
	{
		return next;
	}

	public Object getValue()
	{
		return value;
	}

	public void setPrev(DoublyListNode newPrev)
	{
		prev = newPrev;
	}

	public void setValue(Object obj)
	{
		value = obj;
	}

	public void setNext(DoublyListNode newNext)
	{
		next = newNext;
	}
}