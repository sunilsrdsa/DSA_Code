package com.gfg.SearchingPgms;

public class SquareRootEfficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Square Root--"+sqRootFloor(2147483647));

	}

	private static int sqRootFloor(int x) {
		// TODO Auto-generated method stub
		
		if(x<2)
			return x;
		// Use low =0 only leet code
		int low =0, high =x, ans =0;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			//Leet Code over flow use long
			long msq = (long) mid*mid;
			
			if(msq == x)
			{
				return mid;
			}
			else if(msq > x)
			{
				high = mid -1;
			}
			else
			{
				low = mid +1;
				ans =mid;
			}
		}
		
		return ans;
	}

}
