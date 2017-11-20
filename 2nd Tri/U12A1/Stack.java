// Tariq
//
// This interface will define a Stack.

public interface Stack
{
	boolean isEmpty();
	// return true if stack has no elements, false otherwise.

	void push(Object obj);
	// pushes an elemnt onto the stack.

	Object pop();
	// pops an element off the stack and returns it.

	Object peekTop();
	// returns the element on top of the stack without removing it
}
