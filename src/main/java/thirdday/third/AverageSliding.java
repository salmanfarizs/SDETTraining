package thirdday.third;

import org.junit.Test;

public class AverageSliding {
	
/*
 * 
 * You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. 
Any answer with a calculation error less than 10-5 will be accepted.
 
Example 1:
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

 * 
 * 
 * 
 * 
 */

	    //@Test
		public void squarePos() {
			
			int nums[]  = {3,2,3};
			//square(nums);
			
		}

		@Test
		public void squareEdge() {
			
			int[] nums = {100,12,-5,-6,50,3};
			consecutive(nums,4);
			
		}

		//@Test
		public void squareNeg() {
			
			
		}

		
		public double consecutive(int nums[],int target) {
	
            int right=0;double avg=0;double finalavg=0; double sum =0;
			
			for(int i=0;i<target;i++) {
				
				sum += (nums[i]);
				
			}
			
			Double d= new Double(target);
			
			finalavg = sum/d;
			

			
			for( right=target;right<nums.length;right++) {				
				
				sum= sum-nums[right-target]+nums[right];
                Double e= new Double(target);
				avg = sum/e;
				
				finalavg = Math.max(avg, finalavg);
					
				}
			
			return finalavg;
        
			
			
		
								
		}
}
				
				
				
				
	
	
	
	

