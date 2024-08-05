package com.gfg.stackPgms;

import java.util.Stack;

public class LargestRectangularAreaHistogramWithAll1ns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int R = 4;
        int C = 4;

        int A[][] = {
            { 0, 1, 1, 0 },
            { 1, 1, 1, 1 },
            { 1, 1, 1, 1 },
            { 1, 1, 0, 0 },
        };
        System.out.print("Area of maximum rectangle is "
                         + maxRectangle(R, C, A));
    

	}
	
	
	
	private static int maxRectangle(int r, int c, int[][] mat) {
		// TODO Auto-generated method stub
		
		int res = getMaxArea(mat[0], c);
		
		for(int i=1; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				if(mat[i][j] == 1)
				{
					mat[i][j]+= mat[i-1][j];
				}
			}
			res = Math.max(res, getMaxArea(mat[i], c));

		}
		return res;
	}



	private static int getMaxArea(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s = new Stack<>();
		int res =0;
		int tp;
		int curr;
		
		for(int i=0; i<n; i++)
		{
			while(s.isEmpty() == false && arr[s.peek()] >= arr[i])
			{
				tp = s.peek();
				s.pop();
				curr = arr[tp] *(s.isEmpty()? i: i-s.peek()-1);
				res = Math.max(curr, res);
			}
			s.push(i);
		}
		
		while(!s.isEmpty())
		{
			tp =  s.peek();
			s.pop();
			curr = arr[tp]*(s.isEmpty()? n: n-s.peek()-1);
			res = Math.max(curr, res);
		}
		
		
		return res;
	}

}
