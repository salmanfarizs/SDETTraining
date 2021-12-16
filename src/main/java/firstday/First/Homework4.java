package firstday.First;

import java.util.Arrays;

import org.junit.Test;

public class Homework4 {
	
	
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

		
		public void square(int nums[]) {
			
			for(int i=0;i<nums.length;i++) {
				
				nums[i] = nums[i]*nums[i];
				
			}
			
			Arrays.sort(nums);
			
			System.out.println(Arrays.toString(nums));
			
			
		}
	
	
}
