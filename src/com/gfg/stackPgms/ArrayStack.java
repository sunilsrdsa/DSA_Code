package com.gfg.stackPgms;
import java.util.*;


class MyStack
{
	int arr[];
	int cap;
	int top;
	
	public MyStack(int c) {
		// TODO Auto-generated constructor stub
	top = -1;
	cap = c;
	arr = new int[cap];
	
	}
	
	// Inserting the value into stack
	void push(int x)
	{
		if(top == cap-1)
		{
			System.out.println("The stack is full");
			return;
		}
		//Increment the pointer to insert new value into array
		top++;
		//Insert the value into array
		arr[top] = x;
		
	}
	
	// Removint the value from stack
	 int pop()
	 {
		 if(top == -1)
		 {
			 System.out.println("The stack is empty");
			 
			 return Integer.MIN_VALUE;
		 }
		 // store the value in to be removed from stack
		 int res = arr[top];
		 // decrement the pointer so that it will points to next value in stack after removing the value
		 top--;
		 
		 return res;
		 
	 }
	 
	 int peek()
	 {
		 if(top == -1)
		 {
			 System.out.println("The stack is Empty");
			 
			 return Integer.MIN_VALUE;
		 }
		 
		 return arr[top];
	 }
	 
	 // returns the size of stack
	 int size()
	 {
		 return top+1;
	 }
	 
	 // returns true if stack is empty else false
	 boolean isEmpty()
	 {
		 return top == -1;
	 }
	
	
}



public class ArrayStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack s = new MyStack(5);
		
		s.push(5);
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());

	}

}
