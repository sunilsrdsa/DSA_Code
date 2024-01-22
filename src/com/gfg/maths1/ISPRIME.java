package com.gfg.maths1;

public class ISPRIME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("IsPrime--"+isPrimeVal(234)+"-234");
		System.out.println("IsPrime--"+isPrimeVal(7)+"-7");
		System.out.println("IsPrime--"+isPrimeVal(8)+"-8");

	}
	
	public static boolean isPrimeVal(int N)
	{
		if(N == 1)
		return false;
		
		for(int i=2; i<N; ++i)
		{
			if(N%i==0)
				return false;
		}
		
		return true;
		
	}

}
