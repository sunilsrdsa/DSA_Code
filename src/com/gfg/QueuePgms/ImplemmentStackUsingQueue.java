package com.gfg.QueuePgms;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    
	static int curr_size; 

    public MyStack() {
    	curr_size =0;
    }
    
    public void push(int x) {
    	curr_size++;
        while( q1.size() > 0)
            q2.add(q1.poll());
        
        q1.add(x);
        while( q2.size() > 0 )
            q1.add(q2.poll());
        return;
    }
    
    public int pop() {
    	curr_size--;
    	if(q1.size()>0)
    	{
        return q1.poll();
    	}
    	else
    	{
    		return -1;
    	}
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.size() == 0;
    }
    
    static int size() 
	{ 
		return curr_size; 
	} 
}

public class ImplemmentStackUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack s = new MyStack(); 
		s.push(10); 
		System.out.println("q1 " + s.q1); 
		System.out.println("q2 " + s.q2); 
        s.push(5); 
        System.out.println("---------------------");
        System.out.println("q1 " + s.q1); 
		System.out.println("q2 " + s.q2); 
        s.push(15); 
        System.out.println("---------------------");
        System.out.println("q1 " + s.q1); 
		System.out.println("q2 " + s.q2); 
        s.push(20);
        System.out.println("---------------------");
        System.out.println("q1 " + s.q1); 
		System.out.println("q2 " + s.q2); 

		System.out.println("current size: " + s.size()); 
		System.out.println("current values: " + s.q1); 

		System.out.println(s.top()); 
		s.pop(); 
		System.out.println("current values after pop: " + s.q1); 

		System.out.println(s.top()); 
		s.pop(); 
		System.out.println("current values after pop: " + s.q1); 
        s.pop();
		System.out.println("current values after pop: " + s.q1); 

		System.out.println(s.top()); 

		System.out.println("current size: " + s.size()); 

	}

}
