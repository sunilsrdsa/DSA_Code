package com.gfg.QueuePgms;

import java.util.Stack;

class MyQueueQ
{
	private Stack<Integer> input = new Stack<>();
	private Stack<Integer> output = new Stack<>();
	
	public MyQueueQ()
	{
		
	}
	
	public void push(int x)
	{
		while(input.empty() == false)
		{
			output.push(input.peek());
			input.pop();
		}
		System.out.println("The Element pushed is --"+x);
		input.push(x);
		
		while(output.empty() == false)
		{
			input.push(output.peek());
			output.pop();
		}
	}
	
	public int pop()
	{
		if(input.empty())
		{
			System.out.println("The Stack is empty");
			return -1;
	    }
		int val = input.peek();
		input.pop();
		return val;
    }
	
	public int peek()
	{
		if(input.empty())
		{
			System.out.println("The Stack is empty");
			return -1;
		}
		
		return input.peek();
	}
	
	public int size()
	{
		return input.size();
	}
	
	
}

public class QueueImplementationUsingTwoStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyQueueQ q = new MyQueueQ();
		q.pop();
		q.peek();
        q.push(3);
        q.push(4);
        System.out.println("The element poped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());

	}

}
