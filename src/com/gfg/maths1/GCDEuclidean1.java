package com.gfg.maths1;

public class GCDEuclidean1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int gcd = gcdEuc(12, 15);
		
		System.out.println("GCD---"+gcd);

	}
	
	
	private static int gcdEuc(int a, int b)
	{
         while(a!=b)        	 
         {
        	 if(a>b)
        	 {
        		 a=a-b;
        	 }
        	 else
        	 {
        		 b=b-a;
        	 }
         }
         
         return a;
	}

}
