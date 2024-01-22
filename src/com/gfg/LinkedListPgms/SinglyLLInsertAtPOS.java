package com.gfg.LinkedListPgms;


class Node3
{
	int data;
	Node3 next;
	
	Node3(int x)
	{
		data =x;
		next = null;
	}
	
}
public class SinglyLLInsertAtPOS {
	
	Node3 insertPos(Node3 head, int pos, int data)
	{
		Node3 temp = new Node3(data);
		if(pos==1)
		{
			temp.next = head;
			return temp;
		}
		
		Node3 curr = head;
		
		for(int i=1; i<=pos-2 && curr!=null; i++)
		{
			System.out.println(i);
			curr = curr.next;
		}
		if(curr == null)
			return head;
		
		temp.next =curr.next;
		curr.next=temp;
		
		return head;
			
	}
	
	
	//To Print the data
	void printList(Node3 head)
	{
		Node3 curr =head;
		while(curr !=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node3 head = new Node3(10);
		head.next = new Node3(20);
		head.next.next = new Node3(30);
		head.next.next.next = new Node3(40);

		SinglyLLInsertAtPOS LL = new SinglyLLInsertAtPOS();
		LL.printList(head);
		
		head = LL.insertPos(head, 3, 25);
		LL.printList(head);

	}

}
