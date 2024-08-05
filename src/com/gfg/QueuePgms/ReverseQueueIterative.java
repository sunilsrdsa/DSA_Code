package com.gfg.QueuePgms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueIterative {
	
	Queue<Integer> queue = new LinkedList<Integer>();
	
	void print()
	{
		for(Integer x : queue)
		{
			System.out.print(x+" ");
		}
	}
	
	void reverse() {
		Stack<Integer> s = new Stack<>();
		
		while(!queue.isEmpty())
		{
			s.push(queue.peek());
			queue.remove();
		}
		while(!s.isEmpty())
		{
			queue.add(s.pop());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseQueueIterative r = new ReverseQueueIterative();
		
		r.queue.add(12); 
		r.queue.add(5); 
		r.queue.add(15); 
		r.queue.add(20);
		System.out.println("Before reversing the queue");
		r.print();
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("After reversing the queue");
		r.reverse();
		r.print();

	}

}
