package com.gfg.SearchingPgms;

public class MinimumInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
		int[] arr2 = {3,4,5,1,2};
		int[] arr3 = {6,7,0,1,2,4,5};

        int ans = findMin(arr3);
        System.out.println("The minimum element is: " + ans );
	}

	private static int findMin(int[] arr) {
		// TODO Auto-generated method stub
		
		int low =0, high = arr.length-1;
		
		int ans = Integer.MAX_VALUE;
		
		while(low<=high)
		{
			System.out.println("While Loop");
			int mid = (low+high)/2;
			System.out.println("low----"+low+"----high---"+high);

			System.out.println("mid----"+mid);
            
			// control will go directly into this if low < high   example left side is completed  then right low < high
			//search space is already sorted
            //then arr[low] will always be
            //the minimum in that search space:			
			if(arr[low] <=arr[high])
			{
				ans = Math.min(ans, arr[low]);
				break;
			}
			
			//if left part is sorted
			if(arr[low]<=arr[mid])
			{
				System.out.println("arr[low]----"+arr[low]);

				ans = Math.min(ans, arr[low]);
				System.out.println("Left Side ans--"+ans);

				//Eliminate Left half
				low = mid+1;
				System.out.println("low----"+low);

			}
			else
			{ // If right part is sorted
				System.out.println("arr[mid]----"+arr[mid]);

				ans = Math.min(ans, arr[mid]);
				System.out.println("Right Side ans--"+ans);

				//Eleminate Right half
				high = mid -1;
				System.out.println("high----"+high);

				
			}
		}
		return ans;
	}

}
