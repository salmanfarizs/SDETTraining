package seconday.second;


import java.util.Arrays;

import org.junit.Test;

public class Squares {
	
	
	/*Problem Statement:
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	    //@Test
		public void squarePos() {
			
			int nums[]  = {3,2,3};
			square(nums);
			
		}

		@Test
		public void squareEdge() {
			
			int nums[]  = {-4,-1,0,3,10};
			square(nums);
			
		}

		//@Test
		public void squareNeg() {
			
			
		}

		
		//{-4,-1,0,3,10};
		
		public void square(int nums[]) {
			
			
			int left =0, right = nums.length -1 ;
			int result[] = new int[nums.length]; 
			int index = nums.length -1;
			
			
			
			
			while(left<=right) {
				
				if(Math.abs(nums[left]) < Math.abs(nums[right])) {
					
					result[index--]= nums[right] * nums[right--];
				}else {
					result[index--]=nums[left] * nums[left++];
				}
				
				
				
				
				
			}
			
			System.out.println(Arrays.toString(result));
			
			
		}
	
	
}
