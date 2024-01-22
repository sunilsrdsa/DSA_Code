package com.gfg.LinkedListPgms;

public class CircularLLInsertBegin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = head;
		
		printList(head);
		head = insertBegin(head,15);
		printList(head);

	}

	private static Node insertBegin(Node head, int i) {
		// TODO Auto-generated method stub
		Node temp = new Node(i);
		if(head == null)
		{
			temp.next = temp;
			return temp;
		}
		else
		{
			temp.next = head.next;
			head.next = temp;
			int t = head.data;
			head.data = temp.data;
			temp.data = t;
			
			return head; 
		}
		
	}

	private static void printList(Node head) {
		// TODO Auto-generated method stub
		
		Node r = head;
		
		do {
			System.out.print(r.data+" ");
			r = r.next;
		}while(r!=head);
		System.out.println("");
	}

}
