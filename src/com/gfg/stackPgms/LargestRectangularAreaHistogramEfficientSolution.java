package com.gfg.stackPgms;

import java.util.Stack;

public class LargestRectangularAreaHistogramEfficientSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long arr[] = new long[] {6,2,5,4,1,5,6};
		
		System.out.println("Max Area  :"+getMaxArea(arr,arr.length));

}

	private static long getMaxArea(long[] arr, long n) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s = new Stack<>();
		long res =0;
		int tp;
		long curr;
		
		for(int i=0; i<n; i++)
		{
			while(s.isEmpty() == false && arr[s.peek()] >= arr[i])
			{
				tp = s.peek();
				s.pop();
				curr = arr[tp] *(s.isEmpty()? i: i-s.peek()-1);
				res = Math.max(curr, res);
			}
			s.push(i);
		}
		
		while(!s.isEmpty())
		{
			tp =  s.peek();
			s.pop();
			curr = arr[tp]*(s.isEmpty()? n: n-s.peek()-1);
			res = Math.max(curr, res);
		}
		
		
		return res;
	}
	
}
