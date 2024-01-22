package com.gfg.LinkedListPgms;

public class SinglyLLDeleteLastNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		printList(head);
		
		head = deleteTail(head);

		System.out.println("Print data after deleting last node");
		printList(head);


	}

	private static Node deleteTail(Node head) {
		// TODO Auto-generated method stub
		if(head == null)
			return null;
		if(head.next == null)
		{
			return null;
		}
		
		Node curr = head;
		
		while(curr.next.next !=null)
		{
			curr = curr.next;
		}
		
		curr.next = null;
		
		
		return head;
	}

	private static void printList(Node head) {
		// TODO Auto-generated method stub
		
		Node curr = head;
		
		while(curr !=null)
		{
			
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
		
	}

}
