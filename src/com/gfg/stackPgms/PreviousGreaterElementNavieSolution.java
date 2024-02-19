package com.gfg.stackPgms;

public class PreviousGreaterElementNavieSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{20,30,10,5,15};
		
		printPrevGreater(arr,arr.length);

	}

	private static void printPrevGreater(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<n; ++i)
		{
			int j;
			for(j=i-1; j>=0; j--)
			{
				if(arr[j]>arr[i])
				{
					System.out.print(arr[j]+" ");
					break;
				}
			}
			
			if(j==-1)
			{
				System.out.print(-1+" ");
			}
		}
		
	}

}
