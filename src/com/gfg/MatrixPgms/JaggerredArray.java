package com.gfg.MatrixPgms;

public class JaggerredArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m=3;		
		int arr[][] = new int[m][];		
		for(int i=0; i<arr.length; ++i)
		{
			//Column Size
			arr[i] = new int[i+1];			
			for(int j=0; j<arr[i].length; ++j)
			{
				arr[i][j] =i;				
				System.out.print(arr[i][j]+" ");
			}			
			System.out.println("");
		}
		
		System.out.println("-----------------------------");

		for(int i=0; i<arr.length; ++i)
		{
			//Column Size
			arr[i] = new int[i+1];			
			for(int j=0; j<arr[i].length; ++j)
			{
				arr[i][j] =i+1;				
				System.out.print(arr[i][j]+" ");
			}			
			System.out.println("");
		}

	}

}
