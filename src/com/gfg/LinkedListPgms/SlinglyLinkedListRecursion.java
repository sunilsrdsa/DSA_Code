package com.gfg.LinkedListPgms;


class Node1
{
	int data;
	Node1 next;
	
	Node1(int data, Node1 next)
	{
		this.data = data;
		this.next = next;
	}
}

public class SlinglyLinkedListRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node1 next = new Node1(1, new Node1(2, new Node1(3, new Node1(4, null))));
		
		printList(next);

	}

	private static void printList(Node1 next) {
		// TODO Auto-generated method stub
		if(next == null)
			return;
		
		System.out.print(next.data+" ");
		
		printList(next.next);
		
	}

}
