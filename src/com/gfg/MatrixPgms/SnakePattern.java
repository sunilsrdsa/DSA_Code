package com.gfg.MatrixPgms;

public class SnakePattern {

  public static final int R =4, C=4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{1,2,3,4},
				       {5,6,7,8},
				       {9,10,11,12},
				       {13,14,15,16}};
		
		printSnakePattern(arr);

	}

	private static void printSnakePattern(int[][] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<R; ++i)
		{
			if(i%2==0)
			{
				for(int j=0; j<C; ++j)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			else
			{
				for(int j=C-1; j>=0; --j)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}

}
