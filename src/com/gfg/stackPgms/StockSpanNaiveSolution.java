package com.gfg.stackPgms;

public class StockSpanNaiveSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {18,12,13,14,11,16};
		
		int size = arr.length;
		
		StockSpanNaiveSolution s = new StockSpanNaiveSolution();
		s.printSpan(arr, size);

	}
	
	
	void printSpan(int arr[], int n)
	{
		for(int i=0; i<n; i++)
		{
			int span =1;
			
			for(int j= i-1; j>=0&&arr[j]<arr[i]; j--)
			{
				++span;
			}
			
			System.out.println("Span of "+arr[i]+"---is--"+span);
		}
	}

}
