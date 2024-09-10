package com.gfg.SearchingPgms;

public class CountOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,0,1,1,1,1}, n=6;
		
		System.out.println(countOnes(arr, n));

	}

	private static int countOnes(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		int low =0, high = n-1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			if(arr[mid] == 0)
			{
				low = mid+1;
			}
			else
			{  //arr[mid] == 1
				//arr[0]  ==1  || previous value is zero arr[mid-1] and next value is 1
				if(mid == 0 || arr[mid-1] ==0)
				{
					return (n-mid);
				}
				else
				{
					high = mid-1;
				}
				
			}
		}
		return 0;
	}

}
