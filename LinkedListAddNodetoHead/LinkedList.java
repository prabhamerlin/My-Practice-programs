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
}
