package com.gfg.MatrixPgms;

public class Array2DArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{1,2,3},{4,5,6}};

		printArray(arr);
	}

	private static void printArray(int[][] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<arr.length; ++i)
			for(int j=0; j<arr[i].length; ++j)
                   System.out.print(arr[i][j]+" ");
		
	}

}
