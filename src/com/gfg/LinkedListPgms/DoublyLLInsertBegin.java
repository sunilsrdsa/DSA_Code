package com.gfg.LinkedListPgms;

public class DoublyLLInsertBegin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeD head = new NodeD(20);
		NodeD temp1 = new NodeD(30);
		NodeD temp2 = new NodeD(40);
		
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		
		printList(head);
		head = insertBegin(head,5);
		printList(head);

	}

	private static NodeD insertBegin(NodeD head, int i) {
		// TODO Auto-generated method stub
		NodeD temp = new NodeD(i);
		temp.next = head;
		if(head != null)
			head.prev = temp;
			
		return temp;
	}

	private static void printList(NodeD head) {
		// TODO Auto-generated method stub
		NodeD curr = head;
		while(curr !=null)
		{
			System.out.print(curr.data+" ");
		 curr = curr.next;
		}
		System.out.println(" ");
	}

}
