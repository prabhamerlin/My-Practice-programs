package dataStructures;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in linked list:");
		int max = sc.nextInt();
		for(int i = 1;i<=max;i++)
		{
			int a = sc.nextInt();
			list.addElements(new Node(a));
		}
		
		list.display(list.head);
		int c;
		System.out.println("1.Add element to front");
		System.out.println("2.Add element after a node");
		System.out.println("Enter your choice");
		c = sc.nextInt();
		switch(c)
		{
		case 1: //to add node at the front
		
			System.out.println("Enter the element to add at the front:");
			int front = sc.nextInt();
			list.addtoFront(new Node(front));
			break;
		
		case 2: //to add element after a given node
			System.out.println("Enter the element to insert:");
			Node a = new Node(sc.nextInt());
			System.out.println("Enter the previous element :");
			Node prev = new Node(sc.nextInt());
			list.insertInBetween(a, prev,prev.num);
			System.out.println("List after insertion:");
			list.display(list.head);
		}
		
	}

}
