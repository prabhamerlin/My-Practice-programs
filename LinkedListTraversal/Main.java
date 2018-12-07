package dataStructures;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		Scanner sc = new Scanner(System.in);
		/*
		Node node1;
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		*/
		System.out.println("Enter number of elements in linked list:");
		int max = sc.nextInt();
		for(int i = 1;i<=max;i++)
		{
			int a = sc.nextInt();
			list.addElements(new Node(a));
		}
		
		/*
		list.head = new Node(10); //node1
		list.head.next = node2;
		node2.next = node3;
		*/
		
		
		list.display(list.head);
	}

}
