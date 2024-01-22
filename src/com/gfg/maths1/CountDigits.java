package com.gfg.maths1;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 3456;
		
		int count = 0;
		
		count=countNoOfDig(num);
		System.out.println("The No of Digits is--"+count);
		
		//Time Complexity is Theta(d) d is the number of digits

	}

	private static int countNoOfDig(int num) {
		// TODO Auto-generated method stub
		
		int res=0;
		
		while(num > 0)
		{
			num = num/10;
			System.out.println(num);
			res++;
		}
		return res;
		
	}

}
