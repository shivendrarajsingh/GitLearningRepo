/*This code is for stack data structure. This class is totally implemented with linked list*/

public class MyStack<E> {
	private static final Exception NullPointerException = null;
	Node<E> head;
	int size = 0;
	void push(E data)
	{
		size++;
		Node<E> new_node = new Node<>(data);
		if(head == null)
		{
			head = new_node;
			return;
		}
		new_node.next = head;
		head = new_node;
	}
	E pop() throws Exception
	{
		if(head == null)
			throw NullPointerException;
		E popped = head.data;
		head = head.next;
		size--;
		return popped;
	}
	E peek()
	{
		return head.data;
	}
	boolean empty()
	{
		return size == 0;
	}
	void search(E data)
	{
		Node<E> temp = head;
		int pos = 0;
		boolean isFound = false;
		while(temp != null)
		{
			if(temp.data == data)
			{
				isFound = true;
				break;
			}
			pos ++;
			temp = temp.next;
		}
		if(isFound)
			System.out.println("Search successful, found at index " + (size- pos - 1));
		else
			System.out.println("Not found in the stack.");
	}
	static class Node<E>{
		E data;
		Node<E> next;
		Node(E data)
		{
			this.data = data;
			this.next = null;
		}
	}
}
