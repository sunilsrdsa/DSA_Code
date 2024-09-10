package com.gfg.SearchingPgms;

public class IndexOFirstOccurrenceNaiveSol {
	
	
	public static void main (String[] args)
	{
		int arr[]= {5,10,10,15,15};
		
		int x = 10;
		
		System.out.println(firstOccurrence(arr, arr.length, x));
	}

	private static int firstOccurrence(int[] arr, int n, int x) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<n; ++i)
			if(arr[i] == x)
				return i;
		
		return -1;
		
		
	}

}
