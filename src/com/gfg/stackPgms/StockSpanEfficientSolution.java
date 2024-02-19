package com.gfg.stackPgms;

import java.util.Stack;

public class StockSpanEfficientSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[] {18,12,13,14,11,16};
		
		printSpan(arr, arr.length);

	}

	private static void printSpan(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s = new Stack<>();
		//pushing index of array to the stack
		s.push(0);
		System.out.println(1);
		
		for(int i=1; i<n; i--)
		{
			while(s.isEmpty()==false && arr[s.peek()] <= arr[i])
			{
				s.pop();
			}	
				int span = s.isEmpty() ? i+1 : i-s.peek();
				System.out.print(span+" ");
				s.push(i);
			
		}
	}

}
