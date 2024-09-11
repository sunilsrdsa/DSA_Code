package com.gfg.SearchingPgms;

public class SquareRootNaive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sqRootFloor(15));

	}

	private static int sqRootFloor(int x) {
		// TODO Auto-generated method stub
		int i=1;
		
		while(i*i <= x)
			i++;
		
		return i-1 ;
	}

}
