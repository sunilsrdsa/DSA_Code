package com.gfg.stackPgms;

public class LargestRectangleHistogramNaivieSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {6,2,5,4,1,5,6};
		
		System.out.println("Maximum area--"+getMaxArea(arr, arr.length));

	}

	private static int getMaxArea(int[] arr, int n) {
		// TODO Auto-generated method stub
		int res =0;
		for(int i=0; i<n; i++)
		{
			int curr = arr[i];
			
			// will iterate left side
			for(int j=i-1; j>=0; j--)
			{
				if(arr[j]>=arr[i])
				{
					curr+=arr[i];
				}
				else
				{
					break;
				}
			}
		
		// will iterate right side
		for(int j=i+1; j<n; j++)
		{
			if(arr[j]>=arr[i])
			{
				curr+=arr[i];
			}
			else
			{
				break;
			}
		}
		res = Math.max(res, curr);
		}
		return res;
	}

}
