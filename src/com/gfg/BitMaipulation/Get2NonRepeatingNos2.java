package com.gfg.BitMaipulation;

public class Get2NonRepeatingNos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {2,3,6,8,11,2,3,11};
		int n = arr.length;
		
		UniqueNumbers2(arr,n);

	}

	private static void UniqueNumbers2(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		int sum =0;
		for(int i=0; i<n; i++)
		{
			//Xor all the elements of the array
			//all the elements occuring twice will
			//Cancels out each other remaining 
			//two unique numbers will be xored
			
			sum = (sum ^ arr[i]);
		}
		
		//Bitwise & the sum with its 2's complement
		//Bitwise & will give us the sum containing
		//Only the rightmost set bit
		
		sum=(sum & -sum);
		
		int sum1 =0;
		int sum2=0;
		
		
		for(int i=0; i<n; i++)
		{
			if((arr[i] & sum) > 0)
			{
				sum1 = (sum1 ^ arr[i]);
			}
			else
			{
				sum2 = (sum2 ^ arr[i]);
			}
		}
		
		System.out.println("The non repeating elements are "+sum1+" and "+sum2);
	}

}
