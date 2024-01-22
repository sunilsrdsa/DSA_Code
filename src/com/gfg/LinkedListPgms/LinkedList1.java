package com.gfg.LinkedListPgms;

public class LinkedList1 {
	// head of list
	Node head;
	 
	/* Linked list Node. This inner class is made static so that 
    main() can access it */
	static class Node
	{
		int data;
		Node next;
		// Constructor 
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	/* This function prints contents of linked 
    list starting from head */
	void printList()
	{
		Node n =head;
		
		while(n !=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		
	}
	
    /* method to create a simple linked list with 3 nodes*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		/* Start with the empty list. */

		LinkedList1 Llist = new LinkedList1();
		
		Llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		/* Three nodes have been allocated dynamically. 
        We have refernces to these three blocks as first, 
        second and third 

        llist.head     second             third 
            |             |                 | 
            |             |                 | 
        +----+------+     +----+------+     +----+------+ 
        | 1 | null |     | 2 | null |     | 3 | null | 
        +----+------+     +----+------+     +----+------+ */
		
		
		// Link first node with the second node 
		Llist.head.next = second;
		
		 /* Now next of first Node refers to second. So they 
        both are linked. 

    llist.head     second             third 
        |             |                 | 
        |             |                 | 
    +----+------+     +----+------+     +----+------+ 
    | 1 | o-------->| 2 | null |     | 3 | null | 
    +----+------+     +----+------+     +----+------+ */
		
		// Link second node with the third node 
		second.next =third;
		
		
		/* Now next of second Node refers to third. So all three 
        nodes are linked. 

    llist.head     second             third 
        |             |                 | 
        |             |                 | 
    +----+------+     +----+------+     +----+------+ 
    | 1 | o-------->| 2 | o-------->| 3 | null | 
    +----+------+     +----+------+     +----+------+ */
		
		
		Llist.printList();
		
		

	}

}
