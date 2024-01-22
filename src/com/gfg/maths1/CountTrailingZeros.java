package com.gfg.maths1;

public class CountTrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		
		int count = countZeros(n);
		
		System.out.println("The no of trailing zeros in Factorial 10 is--"+count);

	}

	private static int countZeros(int n) {
		// TODO Auto-generated method stub
		int fact =1;
		
		for(int i=2; i<=n; ++i)
			fact = fact*i;
		int res =0;
		while(fact%10==0)
		{
			++res;
			fact = fact/10;
			System.out.println(fact);
		}
		
		return res;
	}

}
