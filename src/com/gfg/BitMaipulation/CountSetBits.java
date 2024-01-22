package com.gfg.BitMaipulation;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =7;
		int res =0;
		while(n>0)
		{
			if(n%2==1)
				res++;
			
			n=n/2;
		}
		
		System.out.println("How many bits are set---"+res);
//0111  == 7  3 bits are set
	}

}
