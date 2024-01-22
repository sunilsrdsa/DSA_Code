package com.gfg.LinkedListPgms;


class Node2
{
	int data;
	Node2 next;
	
	Node2(int x)
	{
	 data = x;
	 next =null;
	}
}

public class SinglyLinkedListInserAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node2 head = null;
		
		head = insertEnd(head,10);
		head = insertEnd(head,20);
		head = insertEnd(head,30);
		head = insertEnd(head,40);

		printList(head);

	}

	private static void printList(Node2 head) {
		// TODO Auto-generated method stub
		Node2 curr = head;
		while(curr !=null)
		{
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		
	}

	private static Node2 insertEnd(Node2 head, int x) {
		// TODO Auto-generated method stub
		Node2 tmp = new Node2(x);
		if(head == null)
			return tmp;
		
		Node2 curr = head;
		while(curr.next != null)
		{
			curr = curr.next;
		}
		
		curr.next =tmp;
		
		
		
		return head;
	}

}
