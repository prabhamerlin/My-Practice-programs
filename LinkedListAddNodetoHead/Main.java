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
		
		//to add node at the front
		System.out.println("Enter the element to add at the front:");
		int front = sc.nextInt();
		list.addtoFront(new Node(front));
		
		
	}

}
