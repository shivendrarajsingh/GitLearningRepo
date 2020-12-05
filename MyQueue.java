//This is a queue data structure implementation with Linked List. This code is bugged and debuggedc by Shivendra Raj Singh.

public class MyQueue<E> {
	Node<E> head = null;
	public void add(E data)throws Exception
	{
		Node<E> new_node = new Node<>(data);
		if(head == null)
		{
			head = new_node;
			return;
		}
		Node<E> temp = head;
		while(temp.next != null)
			temp = temp.next;
		temp.next = new_node;
		return;
	}
	
	public boolean remove()throws Exception
	{
		if(head == null)
			throw new Exception("Cannot remove element from empty queue");
		head = head.next;
		return true;
	}
	
	public E element()throws Exception
	{
		if(head == null)
			throw new Exception("Cannot find an element from an empty queue");
		return head.data;
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
