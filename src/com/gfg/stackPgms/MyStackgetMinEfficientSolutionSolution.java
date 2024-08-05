package com.gfg.stackPgms;

import java.util.Stack;

class MyStack3
{
	Stack<Integer> s;
	int min;
	
	public MyStack3() {
		s= new Stack<>();
	}
	
	
	void push(int x)
	{
		
		if(s.isEmpty())
		{
			min = x;
			s.push(x);
		}
		else if(x<=min)
		{
			s.push(2*x - min);
			min = x;
		}
		else
		{
			s.push(x);
		}
		
	}
	
	int pop()
	{
		int t = s.peek(); 
		s.pop();
		if(t<=min)
		{
			int res = min;
			min = 2*min-t;
			return res;
		}
		else
		{
			return t;
		}
	}
	
	
	int peek()
	{
		int t = s.peek();
		return ((t<=min)? min:t);
	}
	
	int getMin()
	{
		return min;
	}
	
	
	
}

public class MyStackgetMinEfficientSolutionSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack3 s = new MyStack3();
		s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        s.pop();
     
        System.out.print(" Minimum Element from Stack: " + s.getMin() );

	}

}
