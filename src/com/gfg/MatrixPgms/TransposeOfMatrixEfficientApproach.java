package com.gfg.MatrixPgms;

public class TransposeOfMatrixEfficientApproach {

	public static int n=4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = {{1,2,3,4},
			       {5,6,7,8},
			       {9,10,11,12},
			       {13,14,15,16}};
	
	   transposeMatrix(arr);
	
	   for(int i=0; i<n; ++i)
	   {
		   for(int j=0; j<n; ++j)
		   {
			   System.out.print(arr[i][j]+" ");
		   }
		   System.out.println("");
	   }
	}

	private static void transposeMatrix(int[][] mat) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<n; ++i)
			for(int j=i+1; j<n; ++j)
				swap(mat,i,j);
		
	}

	private static void swap(int[][] mat, int i, int j) {
		// TODO Auto-generated method stub
		int temp = mat[i][j];
		mat[i][j] = mat[j][i];
		mat[j][i]= temp;
	}

}
