package thirdday.third;

import org.junit.Test;

public class MaxConseccutive {
	
		
	


	

	
		
		
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
				//square(nums);
				
			}

			@Test
			public void squareEdge() {
				
				int[] nums = {1,5,0};
				consecutive(nums,2);
				
			}

			//@Test
			public void squareNeg() {
				
				
			}

			/*
			 * 1) Add first k elements and have a sum
			   2) loop from k element until end 
			    a) subtract the first element from the sum
			    b) add the new element to the sum
			    c) compare with existing sum --> whichever max --> make it max
			 * 
			 * 
			 * 
			 * int[] nums = {1,5,2,3,7,1};
               int k = 3; */
					
			//O[n]
			//space : O[1]
			
			public void consecutive(int nums[],int target) {
		
				int max=0;
				int sum=0;
				
				for(int i=0;i<target;i++) {					
					sum += nums[i];								
				}
				
				max = sum;
				System.out.println(max);
				
		for (int right = target; right < nums.length; right++) {

			sum = sum + nums[right] - nums[right - target];
			max = Math.max(sum, max);

		}
				
				
				System.out.println("maaximum value = " + max);
				
									
					}
					
					
					
					
					
					
				
				
				
				
				
				
			}
				
				
	
		
		
	





