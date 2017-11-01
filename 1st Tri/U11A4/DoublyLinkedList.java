// This program will set up a doubly linked list.

public class DoublyLinkedList
{
	private DoublyListNode header;
	private DoublyListNode trailer;
	private DoublyListNode current;
	private int size;

	public DoublyLinkedList()
	{
		header = new DoublyListNode(null, null, null);
		trailer = new DoublyListNode(header, null, null);
		header.setNext(trailer);
		current = header.getNext();
		size = 0;
	}

	public int getSize()
	{
		return size;
	}

	public DoublyListNode getFirstNode()
	{
		return header.getNext();
	}

	public DoublyListNode getLastNode()
	{
		return trailer.getPrev();
	}

	public void addLast(Object obj)
	{
		DoublyListNode p = new DoublyListNode(trailer.getPrev(), obj, trailer);

		trailer.getPrev().setNext(p);
		trailer.setPrev(p);
		current = header.getNext();
		size++;
	}

	public void goNext()
	{
		current = current.getNext();
	}

	public void goPrev()
	{
		current = current.getPrev();
	}

	public void insert(Object obj)
	{
		DoublyListNode p = new DoublyListNode(current, obj, current.getNext());

		current.setNext(p);
		current.getNext().getNext().setPrev(p);
		current = current.getNext();
	}

	public void delete()
	{
		current.getPrev().setNext(current.getNext());
		current.getNext().setPrev(current.getPrev());
		current = current.getNext();
	}

	public void printContents()
	{
		System.out.println();

		DoublyListNode a = header.getNext();

		while(a.getValue() != null)
		{
			System.out.println(a.getValue().toString());
			a = a.getNext();
		}
	}

	public String toString()
	{
		String r = "";
		DoublyListNode a = header;

		for(int i=0; i<size; i++)
		{
			if(i==size-1) r+=a.getNext().getValue().toString();
			else r+=a.getNext().getValue().toString()+"\n";
			a = a.getNext();
		}
		return r;
	}
}