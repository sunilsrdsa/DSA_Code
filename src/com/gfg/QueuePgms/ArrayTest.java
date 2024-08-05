package com.gfg.QueuePgms;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[12];
		
		for(int i=0; i<12; i++)
		{
			arr[i]=i+1;
		}
		for(int val : arr)
		System.out.print(val+" ");
		int middle = arr.length/2;
       System.out.println("middle----"+middle);
	}

}
