package com.gfg.MatrixPgms;

public class BoundryTraversal {
	
//	public static final int R=4,C =4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{1,2,3,4},
				   {5,6,7,8},
				   {9,10,11,12},
				   {13,14,15,16}};

		boundryTraversal(arr);
	}

	private static void boundryTraversal(int[][] mat) {
		// TODO Auto-generated method stub
		
		//System.out.println(mat.length+" "+mat[0].length);
	int R = mat.length;
	int C = mat[0].length;
		if(R == 1)
		{ 
			for(int i=0; i<C; ++i)
				System.out.print(mat[0][i]+" ");
		}
		else if(C == 1)
	   {
		  for(int i=0; i<R; ++i)
			  System.out.print(mat[i][0]);
	   }
		else
		{
			for(int i=0; i<C; ++i)
				System.out.print(mat[0][i]+" ");
			
			for(int i=1; i<R; ++i)
				System.out.print(mat[i][C-1]+" ");
			
			for(int i=C-2; i>=0; --i)
				System.out.print(mat[R-1][i]+" ");
			
			for(int i=R-2; i>=1; --i)
				System.out.print(mat[i][0]+" ");
		}
	}

}
