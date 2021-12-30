package thirdday.third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hamcrest.core.SubstringMatcher;
import org.junit.Test;

public class Nicestring {

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

		    @Test
			public void squarePos() {
				
				String s  = "jcJ";
				System.out.println(nice(s));
				
			}

			//@Test
			public void squareEdge() {
				
				int[] nums = {100,12,-5,-6,50,3};
				//consecutive(nums,4);
				
			}

			//@Test
			public void squareNeg() {
				
				
			}
			
			
			/*
			 * pseudo code
			 * keep left=0 right =1
			 * while left == right increment right
			 * 
			 * 
			 */
			
			

			
			public String nice(String s) {
				
				//solution 1 recursion
				
				/*if(s.length()<2)
					return "";
				
				
				Set<Character> set = new HashSet<Character>();
				
				for(char c:s.toCharArray()) set.add(c);
				
		for (int i = 0; i < s.length(); i++) {

			if (set.contains(Character.toLowerCase(s.charAt(i)))
					&& set.contains(Character.toUpperCase((s.charAt(i))))) {
				continue;
			}
			String substring1 = nice(s.substring(0, i));
			String substring2 = nice(s.substring(i + 1));
			return substring1.length()>=substring2.length()? substring1:substring2;

		}
		return s;
		*/
		        
				//brute force
				
				if(s.length()<2)
					return "";
				
               Set<Character> set = new HashSet<Character>();
				
				for(char c:s.toCharArray()) set.add(c);
				
				if(set.contains(s) || (set.size()==s.length() && set.size()%2==0)) {
					return s;
				}
				
				
				String output = "";
				char[] ch = s.toCharArray();
				int left=0;
				int k=1;
				for(int right=1;right<s.length();right++) {
							
					if(ascii(ch[left])-ascii(ch[right]) == Math.abs(32) || ascii(ch[right])-ascii(ch[left])==Math.abs(32)) {
						
						if(k++==1)
						output = ch[left]+""+ch[right];
						else
						output+=ch[right];	
					}else {
						
						String substring = nice(s.substring(right));
						if(s.equals(output+substring)&&s.length()%2==0)
							return s;
						if(output.length()>=substring.length() && (output!="")) {
							return output;
						}else if(substring!="" && !substring.equals(substring)){
							return substring;
						}
						
						
					}
					left++;
				}
				
				return output;
				
				
				
			}
			
			public int ascii(char c) {
				
				int value = c;
				return value;
			}
			
			
			}
	
	
	
	

