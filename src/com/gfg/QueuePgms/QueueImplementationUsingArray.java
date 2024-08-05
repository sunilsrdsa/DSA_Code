package com.gfg.QueuePgms;


class Queue1
{
	private int arr[];
	private int start, end, currSize, maxSize;
	
	Queue1()
	{
		arr = new int[16];
		start =-1;
		end =-1;
		currSize =0;
	}
	
	Queue1(int maxSize)
	{
		this.maxSize = maxSize;
		arr = new int[maxSize];
		start =-1;
		end =-1;
		currSize=0;
		
	}
	
	public void push(int newElement)
	{
		if(currSize == maxSize)
		{
			System.out.println("The Queue is full");
			return;
		}
	    if(end == -1)
	    {
	    	start =0;
	    	end =0;
	    }
	    else
	    {
		    //System.out.println("---end val-- before--"+end);

	    	end = (end+1)%maxSize;
	    }
	   // System.out.println("---end val----"+end+" mazsize"+maxSize);
	    arr[end] = newElement;
	    System.out.println("the Element pushed is--"+newElement);
	    currSize++;	    
	    
	}
	
	public int pop()
	{
		if(start == -1)
		{
			System.out.println("The Queue is Empty");
             return -1;
		}
		int popped = arr[start];
		
		if(currSize == 1)
		{
			start =-1;
			end =-1;
		}
		else
		{
			start = (start+1)%maxSize;
		}
		currSize--;
		return popped;
	}
	
	public int top()
	{
		if(start == -1)
		{
			System.out.println("The Queue is Empty");
			return -1;
		}
		
		return arr[start];
	}
	
	public int size()
	{
		return currSize;
	}

	public void printAllValue() {
		// TODO Auto-generated method stub
		System.out.println("Inside print all"+ start+"---end--"+end);
		for(int i=start; i<(maxSize+start); i++)
		{
			System.out.print(arr[i%maxSize]+" ");
		}
		
	}
	
	
	
}

public class QueueImplementationUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue1 q = new Queue1(6);
	/*	q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size()); */
		
		Queue1 q = new Queue1(5);
		q.pop();//Queue is Empty
		q.top(); //Queue is Empty
		q.push(3);
		q.push(2);
		q.push(1);
		q.push(8);
		q.push(6);
		q.push(7);//Queue is pull
		q.push(8);//Queue is full

        System.out.println("The top of queue " + q.top());
        q.pop();
        System.out.println("The top of queue " + q.top());
        q.push(9);
        q.pop();
        System.out.println("The top of queue " + q.top());
        q.push(10);
        
        q.printAllValue();
        

		

	}

}
