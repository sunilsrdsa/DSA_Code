package com.gfg.SearchingPgms;

public class InfiniteSizedArrayEfficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 40, 50,60,70,80,90,100};

		int x = 75;

        System.out.println(search(arr, x));

	}

	private static int search(int[] arr, int x) {
		// TODO Auto-generated method stub
		if(arr[0] == x) return 0;
		
		// if i use 0 multiple of 0 is 0 
		int i=1;
		while(arr[i] < x)
			i= i*2;
		
		if(arr[i] == x)
			return i;
		
		// i=i*2  low value will be i/2 +1  and high value will be i-1
		return bSearch(arr, i/2 + 1, i-1, x);
	}
	
	//Binary Search recursive
	private static int bSearch(int arr[], int low, int high, int x)
	{
		if(low > high)
		   return -1;
		
		int mid = (low+high)/2;
		
		if(arr[mid] == x)
		{
			return mid;
		}
		if(arr[mid] > x)
		{
			return bSearch(arr, low, mid-1, x);
		}
		else
		{
			return bSearch(arr, mid+1, high, x);
		}
		
	}
	
	private static int bSearchIterative(int arr[], int low1, int high1, int x)
	{
		int low = low1, high = high1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			
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
