package com.gfg.stackPgms;

import java.util.Stack;

class MyStack2
{
	//Main Stack
	Stack<Integer> ms;
	//Auxiliary Stack
	Stack<Integer> as;
	
	public MyStack2()
	{
		ms = new Stack<>();
		as = new Stack<>();
	}
	
	void push(int x)
	{
		//If no value is present in both the stack
		if(ms.isEmpty())
		{
			ms.push(x);
			as.push(x);
			return;
		}
	   //if stack is not empty
		ms.push(x);
		
		if(as.peek()>=ms.peek())
		{
			as.push(x);
		}
		
		
	}
	
	void pop()
	{
		//pop from Auxiliary Stack only if both are equal
		if(as.peek()== ms.peek())
			as.pop();
		
		    ms.pop();
			
	}
	
	//top of the stack from auxiliary stack will be minimum
	int getmin() {
		return as.peek();
	}
	
	
	
}

public class MyStackgetMinNaivieSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack2 s = new MyStack2();
		s.push(4);
		s.push(5);
		s.push(8);
		s.push(1);
		s.pop();
		
		
		System.out.println("Minimum Element from Stack--"+s.getmin());

	}

}
