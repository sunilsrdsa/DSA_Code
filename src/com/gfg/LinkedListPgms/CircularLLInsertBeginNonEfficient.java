package com.gfg.LinkedListPgms;

public class CircularLLInsertBeginNonEfficient {

	public static void main(String[] args) 
		  { 
		        Node head=new Node(10);
		    	head.next=new Node(20);
		    	head.next.next=new Node(30);
		    	head.next.next.next=head;
		    	printlist(head);

		    	head=insertBegin(head,15);
		    	printlist(head);
		    	
		    } 
		    
		    private static Node insertBegin(Node head, int i) {
		// TODO Auto-generated method stub
		    	Node temp = new Node(i);
		    	if(head == null)
		    	{
		    		temp.next = temp;
		    	}
		    	else
		    	{
		    		Node curr = head;
		    		while(curr.next!=head)
		    		{
		    			curr=curr.next;
		    		}
		    		curr.next = temp;
		    		temp.next = head;
		    	}
		return temp;
	}

			public static void printlist(Node head){
		        if(head==null)return;
		        Node r=head;
		        do{
		            System.out.print(r.data+" ");
		            r=r.next;
		        }while(r!=head);
		        System.out.println("");
		    }

}
	
