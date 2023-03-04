package thirdday.third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class Containsduplicate {
	

	
	
	


	/*
	 * 
	Problem Statement:
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
	
	 * 
	 * 
	 * 
	 * 
	 */

		    @Test
			public void squarePos() {
				
				int nums[]  = {1,0,1,1};
				System.out.println(containsDup(nums,1));
				
			}

			//@Test
			public void squareEdge() {
				
				int[] nums = {100,12,-5,-6,50,3};
				//consecutive(nums,4);
				
			}

			//@Test
			public void squareNeg() {
				
				
			}
			
			

			
			public boolean containsDup(int[] nums,int target) {
				
				
				//brute force
				
				/*for(int left=0;left<nums.length;left++) {
				for(int right=left+1;right<nums.length;right++) {
					
					if(nums[left] == nums[right] && Math.abs(left-right)<=target) {
					return true;
					}
				}
			}
				*/
				
				
				//solution 2 // 123      123123
				
				Map<Integer,Integer> map =  new HashMap<Integer,Integer>();
				
				    map = findDuplicate(nums);
				
				
                int y=1,number=0;
				
				for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
					
					 if(entry.getValue()>y) {
						y =entry.getValue();
						number = entry.getKey();
					}				    
				}
				
				int k = number;
				
				for(int i=0;i<nums.length;i++) {
					
					if(nums[i]==k) {
						
						for(int j=i+1;j<nums.length;j++) {
							
								if(nums[i]==nums[j] && Math.abs(i-j)<=target)
									return true;
							
						}	
						
					}
					
				}				
				return false;
				//sliding window
				/*
				if(target==0||nums.length<2) return false;
				
				
				int left=0; 
				
				for(int right=target; right<nums.length;right++) {
					
					if(nums[left] == nums[right] && Math.abs(left-right)<=target) {
						return true;
						}
					left++;
				}
				
				return false;
				*/
				
		
				
			}
					
					
			public Map findDuplicate(int nums[]) {
				
				Map<Integer,Integer> map =  new HashMap<Integer,Integer>();
				
				
				for(int i=0;i<nums.length;i++) {
					
					
					if(map.containsKey(nums[i])) {
						map.put(nums[i], map.get(nums[i])+1);
					}else {					
					map.put(nums[i],1 );}

					
				}
				
				return map; 
			}
				

}
