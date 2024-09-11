package com.gfg.SearchingPgms;

public class InfiniteSizedArray {
	
	public static void main(String args[]) 
    {

		int arr[] = {1, 2, 3, 5, 5};

		int x = 4;

		System.out.println(search(arr, x));

    }

	private static int search(int[] arr, int x) {
		// TODO Auto-generated method stub
		
		int i=0;
		//Infinite Sized array
		while(true)
		{
			if(arr[i] == x)
				return i;
			
			//Not found
			if(arr[i] > x) return -1;
			
			i++;
			
		}
	} 

}
