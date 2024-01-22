package com.gfg.maths1;

public class DigitsinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digits in Number---"+digitsInFactorial(42));

	}
	public static int digitsInFactorial(int N){
        // code here
         long fact = 1;
    for ( int i = 2; i <= N; i++ ) {
        fact *= i;
    }
    System.out.println("Factorial of -"+N+"--is--"+fact);
 
    int res = 0; // Number of digit of n!
    while ( fact!=0 ) { //  Loop until fact becomes 0
        res++;
        fact /= 10; // Remove last digit
    }
 
    return res;
     }
}
