package com.gfg.SearchingPgms;

public class IndexOFirstOccurrenceEfficientIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,10,10,15,15,20,20,20,30};
		
		int x=20;
		
		System.out.println(firstOccurrence(arr,arr.length,x));

	}

	private static int firstOccurrence(int[] arr, int n, int x) {
		// TODO Auto-generated method stub
		
		int low=0, high=n-1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			if(arr[mid]>x)
			{
				high=mid-1;
			}
			else if(arr[mid]<x)
			{
				low = mid+1;
			}
			else
			{ // if(arr[mid] =x)
			  // to check first occurrence mid = 0  and  if previous element is also same arr[mid-1]	
				if(mid == 0 || arr[mid-1] !=arr[mid])
				{
					return mid;
				}
				else
				{ // if the previous element is also same
					high = mid-1;
				}
			}
		}
		
		
		//return not found
		return -1;
		
		
	}

}
