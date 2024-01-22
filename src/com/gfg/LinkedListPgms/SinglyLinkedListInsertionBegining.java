package com.gfg.LinkedListPgms;

/*class Node
{
	int data;
	Node next;
	Node(int x)
	{
		data =x;
		next = null;
	}
}*/

public class SinglyLinkedListInsertionBegining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head =null;
		head = insertBegin(head,30);
		head = insertBegin(head,20);
		head = insertBegin(head,10);
		
		printList(head);

	}

	private static void printList(Node head) {
		// TODO Auto-generated method stub
		while(head !=null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}
		
	}

	private static Node insertBegin(Node head, int i) {
		// TODO Auto-generated method stub
		Node temp = new Node(i);
		temp.next =head;
		
		return temp;
	}

}
