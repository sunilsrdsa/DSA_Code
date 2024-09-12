package com.gfg.SearchingPgms;

public class SearchInSortedRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 20, 40, 60, 5, 8}, n=6;
		
		int x =5;
		
		System.out.println(search(arr, n , x));

	}

	private static int search(int[] arr, int n, int x) {
		// TODO Auto-generated method stub
		
		int low =0, high =n-1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			if(arr[mid] == x)
				return mid;
			//left half is sorted
			if(arr[low]<=arr[mid])
			{
				if(x>=arr[low] && x<arr[mid])
				{
					high = mid-1;
				}
				else
				{
					low = mid+1;
				}
			}
			else
			{
				//Right half is sorted
				if(x>arr[mid] && x<=arr[high])
				{
					low = mid+1;
				}
				else
				{
					high = mid -1;
				}
			}
		}
		return -1;
	}

}
