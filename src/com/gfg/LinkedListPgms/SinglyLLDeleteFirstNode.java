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

public class SinglyLLDeleteFirstNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	printlist(head);
    	head=delHead(head);
	    printlist(head);

	}

	private static Node delHead(Node head) {
		// TODO Auto-generated method stub
		if(head == null)
		{
			return null;
		}
		else
		{
			return head.next;
		}
		
	}

	private static void printlist(Node head) {
		// TODO Auto-generated method stub
		 Node curr=head;
	        while(curr!=null){
	        System.out.print(curr.data+" ");
	        curr=curr.next;
	    }System.out.println();
		
	}

}
