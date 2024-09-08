package com.gfg.MatrixPgms;

public class SearchElementInSortedMatrixEfficientSol {
	
	public static int R=4,C=4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{10, 20, 30, 40},
				   {15, 25, 35, 45},
				   {27, 29, 35, 45},
				   {32, 33, 39, 50}};
	int x = 29;	   

	search(arr, x);

	}

	private static void search(int[][] mat, int x) {
		// TODO Auto-generated method stub
		
		int i=0, j=C-1;
		
		while(i<R && j>=0)
		{
			if(mat[i][j] == x)
			{
				System.out.println("Found at (" + i + ", " + j + ")");
                 return;
			}
			else if(mat[i][j]>x)
			{
				j--;
			}
			else
			{
				i++;
			}
		}
		System.out.println("Not Found");

		
	}

}
