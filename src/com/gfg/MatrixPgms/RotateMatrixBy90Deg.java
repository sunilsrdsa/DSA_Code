package com.gfg.MatrixPgms;

public class RotateMatrixBy90Deg {
    public static int n=4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{1,2,3,4},
				       {5,6,7,8},
				       {9,10,11,12},
				       {13,14,15,16}};
		
		rotateMatBu90(arr);
		
		for(int i=0; i<n; ++i)
		{
			for(int j=0; j<n; ++j)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}

	}
	private static void rotateMatBu90(int[][] mat) {
		// TODO Auto-generated method stub
		
		int temp[][] = new int[n][n];
		
		for(int i=0; i<n; ++i)
			for(int j=0; j<n; ++j)
				temp[n-j-1][i] = mat[i][j];
		
		for(int i=0; i<n; ++i)
			for(int j=0; j<n; ++j)
				mat[i][j] = temp[i][j];
				 
		
	}

}
