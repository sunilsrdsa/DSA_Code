package com.gfg.stackPgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElementEfficientSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {5,15,10,8,6,12,9,18};
		
		for(int x :nextGreaterElement(arr, arr.length))
		{
			System.out.print(x+" ");
		}
		System.out.println();
		int[] arr2 = new int[] {5,15,10,8,6,20,9,18};
		
		for(int x :nextGreaterElement(arr2, arr2.length))
		{
			System.out.print(x+" ");
		}


	}

	private static ArrayList<Integer> nextGreaterElement(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> v = new ArrayList<>();
		
		Stack<Integer> s = new Stack<>();
		   s.add(arr[n-1]);
		   v.add(-1);

		 for(int i = n-2; i>=0; i--)
		 {
			 
			 while(s.isEmpty()== false && s.peek() <= arr[i])
				 s.pop();
			 
			int ng =  s.isEmpty()? -1: s.peek();
			v.add(ng);
			s.add(arr[i]);			
			
		 }
			Collections.reverse(v);

		return v;
		   
	}

}
