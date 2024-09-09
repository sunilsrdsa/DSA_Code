package com.gfg.SearchingPgms;

public class BinarySearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,30,40,50,60};
		
		int x=50;
		
		System.out.println(bSearch(arr,arr.length,x));

	}

	private static int bSearch(int[] arr, int n, int x) {
		// TODO Auto-generated method stub
		
		int low=0, high = n-1;
		while(low<=high)
		{
			int mid =(low+high)/2;

			if(arr[mid] == x)
			{
				return mid;
			}
			else if(arr[mid]>x)
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
		}
		return -1;
	}

}
