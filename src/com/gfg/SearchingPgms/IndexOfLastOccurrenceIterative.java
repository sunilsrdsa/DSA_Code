package com.gfg.SearchingPgms;

public class IndexOfLastOccurrenceIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 10, 10, 10, 10, 20, 20}, n = 7;

		int x = 20;

		System.out.println(lastOcc(arr, n, x));

	}

	private static int lastOcc(int[] arr, int n, int x) {
		// TODO Auto-generated method stub
		
		int low =0, high = n-1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			if(arr[mid]>x)
			{
				high = mid-1;
			}
			else if(arr[mid]<x)
			{
				low = mid+1;
			}
			else
			{
				if(mid == n-1 || arr[mid+1]!=arr[mid])
				{
					return mid;
				}
				else
				{
					low = mid+1;
				}
			}
		}
		return -1;
	}

}
