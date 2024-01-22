package com.gfg.maths1;

public class GcdOrHcfOfTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gcdOrHcf = gcdOrHcf(10, 15);
		
		System.out.println("GCD or HCF of number is---"+gcdOrHcf);

	}
	
	
	private static int gcdOrHcf(int a, int b)
	{
		int res = Math.min(a, b);
		
		while(res>0)
		{
			if(a%res == 0 && b%res == 0)
			{
				//return res;
				break;
			}
          res--;			
		}
		
		return res;
	}

}
