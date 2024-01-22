package com.gfg.maths1;

public class CountTrailingZerosForLargeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count = countTrailingZeros(251);
System.out.println("Count the TRailing zeros for factorial of 251--"+count);
	}
	
	
	private static int countTrailingZeros(int n)
	{
		int res =0;
		for(int i=5; i<=n; i=i*5)
		{
			res=res+n/i;
		}
		
		return res;
	}
	

}
