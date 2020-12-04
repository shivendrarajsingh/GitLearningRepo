/*This is a linked list data structure implementation in java. This is designed and edited by Shivendra Raj Singh.*/
public class MyLinkedList <X> {
	Node<X> head;
	void add(X data)
	{
		Node<X> new_node = new Node<X>(data);
		if(head == null)
		{
			head = new_node;
			return;
		}
		Node<X> temp = head;
		while(temp.next != null)
			temp = temp.next;
		temp.next = new_node;
	}
	void print()
	{
		if(head == null)
			return;
		Node<X> temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	void rprint()
	{
		Node<X> temp = head;
		reverse(temp);
	}
	void reverse(Node<X> temp)
	{
		if(temp == null)
			return;
		reverse(temp.next);
		System.out.println(temp.data + " ");
	}
	static class Node <X>{
		X data;
		Node<X> next;
		Node(X data)
		{
			this.data = data;
			this.next = null;
		}
	}

}
