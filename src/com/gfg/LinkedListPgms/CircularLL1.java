package com.gfg.LinkedListPgms;


public class CircularLL1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = head;
		PrintList(head);

	}

	private static void PrintList(Node head) {
		// TODO Auto-generated method stub
		if(head == null)
			return ;
		
		System.out.print(head.data+" ");
		
		for(Node r = head.next; r!=head; r=r.next)
			System.out.print(r.data+" ");
		
	}

}
