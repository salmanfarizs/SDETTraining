package thirdday.third;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class Distinctsubstring {
	
	
	


	/*
	 * 
	Problem Statement:
A string is good if there are no repeated characters.
Given a string s, return the number of good substrings of length three in s.
Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
A substring is a contiguous sequence of characters in a string.
	
	 * 
	 * 
	 * 
	 * 
	 */

		    @Test
			public void squarePos() {
				
				String s  = "owuxoelszb";
				System.out.println(distinctString(s,3));
				
				/*
				 * 
				 * Algorithm
				 * equi direction sliding window
				 * create a set
				 * add into set
				 * if adds then return max length
				 * else
				 * move the right to left and reset set
				 * 
				 * 
				 * 
				 * 
				 */
				
				
				
			}

			//@Test
			public void squareEdge() {
				
				int[] nums = {100,12,-5,-6,50,3};
				//consecutive(nums,4);
				
			}

			//@Test
			public void squareNeg() {
				
				
			}
			
			

			
			public int distinctString(String s,int target) {
				
				/*int left=0,middle=1;
				String output="";
				ArrayList<String> as = new ArrayList<String>();
				
				char[] cs = s.toCharArray();
				for(int right=2;right<cs.length;right++) {
					
					 {
					if(Character.toLowerCase(cs[left])!=Character.toLowerCase(cs[right]) && Character.toLowerCase(cs[left])!=Character.toLowerCase(cs[middle])
							&&Character.toLowerCase(cs[middle])!=Character.toLowerCase(cs[right])) {
						
						
						output = cs[left++] +"" +cs[middle++]+ "" + cs[right];
						as.add(output);
						
					}else 
					{  left++;
					   middle++;
							
							}
							}
						}
				     return as.size();
					}*/
				
				
				
				/*
				 * 
				 * 
				 * 
				 * "owuxoelszb"
				 * 
				 * 
				 */
				
			
				int left=0,right=0,maxCount=0;
				
				HashSet<Character> set = new HashSet<Character>();
				
					
				while(right<s.length()) {
				
					if(set.add(s.charAt(right++)) && set.size()<=target) {
						
						if(set.size()==target)
						maxCount++;
					}else {
						
						right = ++left;
						set.clear();
					}
					
				
				}
				
				return maxCount;
				}
				
				
					
				}
				
				
				
				
		
			


