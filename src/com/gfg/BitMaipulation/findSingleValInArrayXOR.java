package com.gfg.BitMaipulation;

public class findSingleValInArrayXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,5,4,5,3,4};
		int n = arr.length;
		
		System.out.println("Element Occuring once is--"+findSingle(arr, n));

	}
	
	public static int findSingle(int arr[], int len)
	{
		//Do Xor of all the element and return 
		int res= arr[0];
		for(int i=1; i<len; ++i)
		{
			res = res^arr[i];
		}
		
		return res;
	}

}
