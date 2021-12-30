package thirdday.third;

import org.junit.Test;

public class Minimumsize {
	
	
	

	

	
	
	


	/*
	 * 
	Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] 
	of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.
	 * 
	 * 
	 * 
	 * 
	 */

		    @Test
			public void squarePos() {
				
				int nums[]  = {1,4,4};
				System.out.println(minSize(nums,4));
				
			}

			//@Test
			public void squareEdge() {
				
				int[] nums = {100,12,-5,-6,50,3};
				//consecutive(nums,4);
				
			}

			//@Test
			public void squareNeg() {
				
				
			}		

			
			public int minSize(int[] nums,int target) {
				
				//brute force/sliding window
/*				    int sum=0; 
					int k=0;
					while(k<nums.length) {  //O[n]
					
					 int i=0; 
					 int index=0;
					
						for(int j=i+k;j<nums.length;j++) { //O[n]
							
							index=i;
							while(i<=j) {
							sum += nums[i] ;
							i++;
							}
							i=index;
							if(sum>=target) {
								return j-i+1;	
							}else {
								sum = 0;
								i++;
							}
							
						}
						k++;
					}
								
				return 0;*/
				
				//{2,2,2,8}
				
				int min = Integer.MAX_VALUE;
				int sum=0;
				int left=0;
				for(int right =0; right<nums.length;right++) {
					
					sum+=nums[right];
					while(sum>=target && left<nums.length) {
						min = Math.min(right-left+1, min);
						sum-=nums[left++];
					}
					
				}
				
				
				return (min==Integer.MAX_VALUE)?0:min;
				
			}
					
					
				



}
