package com.gfg.QueuePgms;

import java.util.Stack;

class MyQueuueQ1
{
	
	private Stack<Integer> input = new Stack<>();
	private Stack<Integer> output = new Stack<>();
	
	public MyQueuueQ1()
	{
		
	}
	
	public void push(int x)
	{
		System.out.println("The Element Pushed to is --"+x);
		input.push(x);
	}
	
	public int pop()
	{
		if(output.empty() && input.empty())
		{
			System.out.println("The Queue is Empty--");
			return -1;
		}
		
		if(output.empty())
		{
			while(input.empty() == false)
			{
				output.push(input.peek());
				input.pop();
			}
		}
		
		int val = output.peek();
		output.pop();
		return val;
	}
	
	public int peek()
	{
		if(output.empty() && input.empty())
		{
			System.out.println("The Queue is Empty--");
			return -1;
		}
		
		if(output.empty())
		{
			while(input.empty() == false)
			{
				output.push(input.peek());
				input.pop();
			}
		}
		
		return output.peek();
	}
	
	public int size()
	{
		return input.size()+output.size();
	}
}

public class QueueImplementationUsingTwoStacksAmortised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyQueuueQ1 q = new MyQueuueQ1();
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
