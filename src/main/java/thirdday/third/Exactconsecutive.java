package thirdday.third;
import java.util.Arrays;
import org.junit.Test;


//Exact Sum   //Sliding window


public class Exactconsecutive {
	
	


	

	
		
		
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
				
				int[] nums = {1,7,4,3,1,2,1,5,1};
				consecutive(nums,7);
				
			}

			//@Test
			public void squareNeg() {
				
				
			}

			/*
			 * start with first element
			 * if less grow
			 * if greater then shrink
			 * if equal then slide 
			 * 
			 * 
			 * 
			 * int[] nums = {1,7,4,3,1,2,1,5,1};
				consecutive(nums,7);
			 */
			
			
			//O[n]
			//space : O[1]
			
			public void consecutive(int nums[],int target) {
				
				
				int left=0;				
				int sum=0;
				
					for(int right=0;right<nums.length;right++) {
						
						sum +=nums[right]; //grow
						
						while(sum>target) {
							
							sum -=nums[left++]; //shrink
						}
						
						if(sum==target) { //match
							
							System.out.println(left+" " + right);
						}
						
					}
					
					
					
					
					
					
				
				
				
				
				
				
			}
				
				
	
			}
		
		
	



