package dataStructures;

public class LinkedList 
{
	Node head;
	Node n;
	
	Node temp = head;
	public LinkedList() 
	{
		
	}
	public void display(Node head)
	{
		Node n = head;
		do
		{
			System.out.println(n.num);
			n = n.next;
		}while(n!=null);
	}
	public void addElements(Node n) 
	{
		if(head == null)
		{
			head = n;
			temp = n;
			//head.next = null;
		}
		
		else
		{
			if(n!=null)
			{
				temp.next = n;	
			}
			temp = n;
		}
		
		
	}

	public void addtoFront(Node front)
	{
		front.next = head;
		head = front;
		System.out.println("After adding element to front:");
		display(head);
	}
	public void insertInBetween(Node a, Node prev, int pdata)
	{
		
		Node ptr = head;
		while(ptr!=null && ptr.num!= pdata)
		{
			ptr = ptr.next;
		}
		if(ptr!=null && ptr.num == pdata)
		{
			prev = ptr;
			temp = prev.next;
			prev.next = a;
			a.next = temp;
		}
	}
	
	public void insertAtlast(Node b)
	{
		Node last = head;
		while(last.next !=null)
		{
			last = last.next;
		}
		last.next = b;
	}
}
