package com.gfg.SearchingPgms;

public class CountOccurrance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,20,20,40,40}, n=6;
		
		int x=40;
		
		System.out.println(countOcc(arr, n, x));

	}

	private static int countOcc(int[] arr, int n, int x) {
		// TODO Auto-generated method stub
		int first = firstOcc(arr,n,x);
		
		if(first == -1)
			return 0;
		else
			return lastOcc(arr,n,x) - first+1;
		
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
					return mid;
				else
					low = mid+1;
			}
		}
		
		return -1;
	}

	private static int firstOcc(int[] arr, int n, int x) {
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
			   if(mid == 0 || arr[mid-1]!=arr[mid])
				   return mid;
			   else
				   high = mid-1;
		   }
		}
		
		return -1;
		
	}

}
