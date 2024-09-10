package com.gfg.SearchingPgms;

public class IndexOFirstOccurrenceRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int arr[] = {5,10,10,15,15,20,20,20,30};
		
		int x=20;
		
		System.out.println(firstOcc(arr,0,arr.length-1,x));

	}

	private static int firstOcc(int[] arr, int low, int high, int x) {
		// TODO Auto-generated method stub
		
		if(low>high)
			return -1;
		
		int mid = (low+high)/2;
		
		if(arr[mid]>x)
		{
			return firstOcc(arr, low, mid-1, x);
		}
		else if(arr[mid]<x)
		{
			return firstOcc(arr, mid+1, high, x);
		}
		else
		{
			if(mid == 0 || arr[mid-1] != arr[mid])
			{
				return mid;
			}
			else
			{
				return firstOcc(arr, low, mid-1, x);
			}
		}
		
		
	}

}
