package com.gfg.MatrixPgms;

public class SearchElementInSortedMatrixNaiveSol {
	
	public static int R=4,C=4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{10,20,30,40},
				       {15,25,35,45},
				       {27,29,35,45},
				       {32,33,39,50}
		};
		
		int x=35;
		
		search(arr,x);

	}

	private static void search(int[][] mat, int x) {
		// TODO Auto-generated method stub

		for(int i=0; i<R; ++i)
		{
			for(int j=0; j<C; j++)
			{
				if(mat[i][j] == x)
				{
					System.out.println("Found at("+i+","+j+")");
					//return;
				}
			}
		}
	}

}
