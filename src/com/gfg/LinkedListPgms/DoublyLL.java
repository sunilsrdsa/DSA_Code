package com.gfg.LinkedListPgms;

class NodeD
{
	int data;
	NodeD next;
	NodeD prev;
	
	NodeD(int d)
	{
		data =d;
		next = null;
		prev = null;
	}
}

public class DoublyLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeD head = new NodeD(10);
		NodeD temp1 = new NodeD(20);
		NodeD temp2 = new NodeD(30);
		
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		
		printList(head);

	}

	private static void printList(NodeD head) {
		// TODO Auto-generated method stub
		
		NodeD curr = head;
		while(curr !=null)
		{
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		
		System.out.println();
		
	}

}
