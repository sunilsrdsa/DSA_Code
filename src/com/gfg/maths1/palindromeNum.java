package com.gfg.maths1;

public class palindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 3333;
		boolean check = palindromeCheck(num);
		System.out.println("The number--"+num+"--is palindrome number--"+check);
		// Time Complexity is Theta(d) where d is the number of digits

	}

	private static boolean palindromeCheck(int num) {
		// TODO Auto-generated method stub
		int rev =0;
		int temp =num;
		
		while(temp !=0)
		{
			int ld = temp%10;
			rev = rev*10+ld;
			temp = temp/10;
		}
		
		return (num == rev);
	}

}
