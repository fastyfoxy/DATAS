// This program will create a LinkedList of names.

public class NameList
{
	private ListNode list;

	public NameList()
	{
		list = null;
	}

	public void add(String name)
	{
		ListNode node = new ListNode(name, null);
		ListNode current;

		if(list==null)
			list = node;
		else
		{
			current = list;

			while(current.getNext() != null)
				current = current.getNext();

			current.setNext(node);
		}
	}

	public String toString()
	{
		String result = "";
		ListNode current = list;

		while(current != null)
		{
			result += current.getValue().toString() + "\n";
			current = current.getNext();
		}

		return result;
	}

	public void delete(String name)
	{
		ListNode current, test, last, mid;
		current = test = last = mid = list;
		int pos = 1;
		int length = 1;

		while(test.getNext() != null)
		{
			test = test.getNext();
			length++;
		}

		while(!(current.getValue().toString().equalsIgnoreCase(name)))
		{
			current = current.getNext();
			pos++;
		}

		if(pos==1)
			list = list.getNext();
		else if(pos==length)
		{
			for(int i=1; i<length-1; i++)
				if(last.getNext() != null)
					last = last.getNext();

			last.setNext(null);
		}
		else
		{
			for(int i=1; i<pos-1; i++)
				mid = mid.getNext();

			mid.setNext(mid.getNext().getNext());
		}
	}

	public void insert(String name)
	{
		ListNode node = new ListNode(name, null);
		ListNode test, current, place;
		test = current = place = list;
		int length = 1;
		int pos = 1;

		while(test.getNext() != null)
		{
			test = test.getNext();
			length++;
		}

		if(current.getValue().toString().compareTo(name) > 0)
		{
			node.setNext(list);
			list = node;
		}
		else
		{
			for(int i=0; i<length-1; i++)
			{
				if(current.getValue().toString().compareTo(name) > 0)
				{
					pos=i+1;
					break;
				}
				else
				{
					current = current.getNext();
				}
			}
			if(current.getValue().toString().equals(test.getValue().toString()))
			{
				for(int i=0; i<length-1; i++)
					place = place.getNext();

				place.setNext(node);
			}
			else
			{
				for(int i=0; i<pos-2; i++)
					place = place.getNext();

				node.setNext(place.getNext());
				place.setNext(node);
			}
		}
	}
}