package com.gfg.MatrixPgms;

public class Mat2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{1,2,3},{4,5,6}};
		
		for(int i=0; i<arr.length; ++i)
		{
			for(int j=0; j<arr[i].length; ++j)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
		
		
		System.out.println("");
		System.out.println("--------------------------------------");		
		int m=2, n=3;
		
		int arr1[][] = new int[m][n];
		
		for(int i=0; i<arr1.length; ++i)
			for(int j=0; j<arr1[i].length; ++j)
				System.out.print(arr1[i][j]+" ");

		
		System.out.println("");
		System.out.println("--------------------------------------");		
		int m1=2, n1=3;
		
		int arr2[][] = new int[m1][n1];
		
		for(int i=0; i<arr2.length; ++i)
		{
			for(int j=0; j<arr2[i].length; ++j)
			{
				arr2[i][j] = 10;
				
				System.out.print(arr2[i][j]+" ");
			}	
		}	
		
		System.out.println("");
		System.out.println("--------------------------------------");

		int m2=2, n2=3;
		
		int arr3[][] = new int[m2][n2];
		
		for(int i=0; i<arr3.length; ++i)
		{
			for(int j=0; j<arr3[i].length; ++j)
			{
				 arr[i][j]=10;
				 System.out.print(arr[i][j]+" ");
			}
			
			System.out.println("");
		}
	}

}
