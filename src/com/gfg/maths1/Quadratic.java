package com.gfg.maths1;

import java.util.ArrayList;
import java.util.List;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -264, b = -750, c = 504;
		 
        // Function call
		ArrayList<Integer> al2 = new ArrayList<>();
		al2=quadraticRoots(a, b, c);
		al2.forEach(i->System.out.println(i));

	}
	
	public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
		ArrayList<Integer> l1 = new ArrayList<Integer>();

		// If a is 0, then equation is not
        // quadratic, but linear
		if(a == 0)
		{
			System.out.println("Invalid");
			return null;
		}
		double firstroot, secondroot;
		 
		int d = b*b -4*a*c;
		
		double sqrtValue = Math.sqrt(Math.abs(d));
		
		if(d >0)
		{
			System.out.println("Roots are real and different");
			firstroot =((-b+sqrtValue)/(2*a));
			secondroot =((-b-sqrtValue)/(2*a));
			System.out.println("firstroot--"+firstroot+"--secondroot-"+secondroot);
			l1.add((int) Math.floor(secondroot));

			l1.add((int) Math.floor(firstroot));

		}
		else if(d==0)
		{
			System.out.println("Roots are real and same");
			l1.add(-(int)b/(2*a));
			l1.add(-(int)b/(2*a));
			
		}
		else
		{
			System.out.println("Roots are complex");
			l1.add(-1);
			
		}
		return l1;
		
               
              
    }

}
