package com.gfg.LinkedListPgms;
class Node4
{
	int data;
	Node4 next;
	
	Node4(int x)
	{
		data =x;
		next = null;
	}
	
}

public class SinglyLLInsertAtPOS2 {
	
	 Node4 insertPos(Node4 head, int pos, int data) {
		// TODO Auto-generated method stub
		 Node4 tmp = new Node4(data);
		 
		 if(head == null)
		 {
			 if(pos ==1)
			 {	 
				 return tmp;
			 }
			 else
			 {
				 return head;
			 }
		 }
		 
		 if(pos == 1)
		 {
			 tmp.next = head;
			 return head;
		 }
		 
		 Node4 curr = head;
		 
		 for(int i=1; i<pos-1; ++i)
		 {
			 curr = curr.next;
			 
			 if(curr == null)
				 return head;
		 }
		 
		 tmp.next=curr.next;
		 curr.next=tmp;
		 
		return head;
	}
	
	
	//To Print the data
		void printList(Node4 head)
		{
			Node4 curr =head;
			while(curr !=null)
			{
				System.out.print(curr.data+" ");
				curr=curr.next;
			}
			System.out.println();
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				Node4 head = new Node4(10);
				head.next = new Node4(20);
				head.next.next = new Node4(30);
				head.next.next.next = new Node4(40);

				SinglyLLInsertAtPOS2 LL = new SinglyLLInsertAtPOS2();
				LL.printList(head);
				
				head = LL.insertPos(head, 3, 25);
				LL.printList(head);

	}


	

}
