package com.gfg.LinkedListPgms;


class Node
{
	Node next;
	int data;
	
	Node(int x)
	{
		data = x;
		next = null;
		
	}
}

public class SlinglyLinkedListPgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node next = new Node(10);
		next.next = new Node(20);
		next.next.next = new Node(30);
		next.next.next.next = new Node(40);
		
		printList(next);

	}

	private static void printList(Node next) {
		// TODO Auto-generated method stub
		Node curr = next;
		while(curr != null)
		{
			System.out.print(curr.data+" ");
			
			curr = curr.next;
		}
		
	}

}
