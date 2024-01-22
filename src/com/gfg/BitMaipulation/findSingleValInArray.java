package com.gfg.BitMaipulation;

/*Find the element that appears once in an array where every other element appears twice
*/
public class findSingleValInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,5,4,5,3,4};
		int n = arr.length;
		
		System.out.println("The element occuring once--"+findSingele(arr, n));

	}
	
	public static int findSingele(int arr[], int len)
	{
		
		for(int i=0; i<len; ++i)
		{
			int count =0;
			
			for(int j=0; j<len; ++j)
			{
				if(arr[i]==arr[j])
					count++;
			}
			
			//if the frequency of element is one
			if(count ==1)
			{
				return arr[i];
			}
		}
		// if no element exists return -1	
		return -1;
	}

}
