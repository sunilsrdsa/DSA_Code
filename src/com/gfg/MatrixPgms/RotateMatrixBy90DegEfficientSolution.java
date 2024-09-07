package com.gfg.MatrixPgms;

public class RotateMatrixBy90DegEfficientSolution {
 
	public static int n=4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},
				      {5,6,7,8},
				      {9,10,11,12},
				      {13,14,15,16}};
		
		rotateArr90(arr);
		
		for(int i=0; i<n; ++i)
		{
			for(int j=0; j<n; ++j)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}

	}

	private static void rotateArr90(int[][] mat) {
		// TODO Auto-generated method stub
		
		//Transpose of Matrix
		for(int i=0; i<n; i++)
			for(int j=i+1; j<n; ++j)
				swap(mat,i,j);
		
		//Reversing the column
		for(int i=0; i<n; i++)
		{
			int low=0,high=n-1;
			
			while(low < high)
			{
				swap2(low, high, i, mat);
				
				low++;
				high--;
			}
		}
		
	}

	private static void swap2(int low, int high, int i, int[][] mat) {
		// TODO Auto-generated method stub
		
		int temp = mat[low][i];
		mat[low][i] = mat[high][i];
		mat[high][i] = temp;
		
	}

	//transpose of matrix
	private static void swap(int[][] mat, int i, int j) {
		// TODO Auto-generated method stub
		int temp = mat[i][j];
		mat[i][j] = mat[j][i];
		mat[j][i] = temp; 
	}

}
