package com.gfg.QueuePgms;

import java.util.LinkedList;
import java.util.Queue;

class MyStack3
{
	Queue<Integer> q = new LinkedList<>();
	
	void push(int x)
	{
		q.add(x);
		
		for(int i=0; i<q.size()-1; ++i)
		{
			q.add(q.remove());
		}
	}
	
	int pop()
	{
		return q.remove();
	}
	
	int top()
	{
		return q.peek();
	}
	
	int size()
	{
		return q.size();
	}
	
}

public class ImplemmentStackUsingSingleQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack3 s = new MyStack3();
        s.push(3);
        s.push(2);
        s.push(4);
        s.push(1);
        System.out.println("Queue values--"+s.q);
        System.out.println("Top of the stack: " + s.top());
        System.out.println("Size of the stack before removing element: " + s.size());
        System.out.println("The deleted element is: " + s.pop());
        System.out.println("Top of the stack after removing element: " + s.top());
        System.out.println("Size of the stack after removing element: " + s.size());
		

	}

}
