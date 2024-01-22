package com.gfg.BitMaipulation;

public class ISPowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Is pow of 2--"+4+"----"+isPw2(4));
		System.out.println("Is pow of 2--"+6+"----"+isPw2(6));

	}
	
	
	public static boolean isPw2(int n)
	{
		if(n==0)
			return false;
		
		
		return ((n&(n-1)) == 0);
	}

}
