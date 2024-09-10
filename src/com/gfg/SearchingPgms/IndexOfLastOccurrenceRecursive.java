package com.gfg.SearchingPgms;

public class IndexOfLastOccurrenceRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5, 10, 10, 10, 10, 20, 20}, n = 7;

		int x = 10;

        System.out.println(lastOcc(arr, 0, n - 1, x, n));

	}

	private static int lastOcc(int[] arr, int low, int high, int x, int n) {
		// TODO Auto-generated method stub
		
		if(low>high)
			return -1;
		int mid = (low+high)/2;
		if(arr[mid] > x)
		{
			return lastOcc(arr, low, mid-1, x, n);
		}
		else if(arr[mid] > x)
		{
			return lastOcc(arr, mid+1, high, x, n);
		}
		else
		{ // arr[mid] == x
			
			//to Check if its last value n-1  Or  mid+1 value is not same
			if(mid == n-1 || arr[mid+1] != arr[mid])
				return mid;
			else
				return lastOcc(arr, mid+1, high, x, n);
			
		}
		
	}

}
