package com.gfg.BitMaipulation;

public class CountTotalSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Counting total set bits---"+countSetBits(4));

	}
	
	public static int countSetBits(int n)
	{			int res =0;

		for(int i=1; i<=4; ++i)
		{
			int val = i;
			
			while(val>0)
			{
				val = val&(val-1);
				res++;
			}
					
		}
		
		return res;
	}

}
