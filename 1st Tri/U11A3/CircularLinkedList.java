// This program will set up a circular linked list.

public class CircularLinkedList
{
	private ListNode lastNode;
	private int size;

	public CircularLinkedList()
	{
		lastNode = null;
		size = 0;
	}

	public void addLast(Object obj)
	{
		if (lastNode == null)
		{
			lastNode = new ListNode(obj, null);
			lastNode.setNext(lastNode);
		}
		else
		{
			ListNode p = new ListNode(obj, lastNode.getNext());
			lastNode.setNext(p);
			lastNode = p;
		}
		size++;
	}

	public int downsize()
	{
		ListNode node = lastNode.getNext();
		while(size != 1)
		{
			node.setNext(node.getNext().getNext());
			node = node.getNext();
			size--;
		}
		return (int)node.getValue();
	}

	public String toString()
	{
		String result = "";
		ListNode node = lastNode.getNext();
		if(size==1)
			return node.getValue().toString();
		else
			for(int i=0; i<size; i++)
			{
				result+=node.getValue().toString()+"\n";
				node = node.getNext();
			}
		return result;
	}

	public int getSize()
	{
		return size;
	}
}