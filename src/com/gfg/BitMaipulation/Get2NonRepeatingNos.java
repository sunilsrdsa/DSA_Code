package com.gfg.BitMaipulation;

import java.util.ArrayList;
import java.util.Arrays;

/*Find the two non-repeating elements in an array of repeating elements/ Unique Numbers 2
*/
public class Get2NonRepeatingNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,3,7,9,11,2,3,11};
		int arr1[] = {1,1,2,3,2,3,4,5};
		int n = arr1.length;
		
		ArrayList<Integer> ans = ger2NonRepeatingNos(arr1,n);
		System.out.println("The non repeating elements are ");
		System.out.println(ans.get(0)+"  and  "+ans.get(1));

	}

	private static ArrayList<Integer> ger2NonRepeatingNos(int[] nums, int n) {
		// TODO Auto-generated method stub
		
		Arrays.sort(nums);
		ArrayList<Integer> ans = new ArrayList<>();
		
		for(int i=0; i<n-1; i=i+2)
		{
			if(nums[i] != nums[i+1])
			{
				ans.add(nums[i]);
				i=i-1;
			}
		}
		
		//After Sorting if the element appear at the end for unique element this if block will execute
		if(ans.size() ==1)
		{
			System.out.println("Hello");
			ans.add(nums[n-1]);
		}
		return ans;
	}

}
