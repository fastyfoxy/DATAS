// This interface will define a Queue.

public interface Queue
{
	boolean isEmpty();
	// returns true if the queue has no elements, false otherwise.

	void enqueue(Object obj);
	// adds an element to the end of the queue.

	Object dequeue();
	// removes an element at the front of the queue and returns it.

	Object peekFront();
	// returns the element at the front of the queue without removing it.
}
