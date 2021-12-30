package fourthday.four;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

public class LongestUnique {

	


	/*
	 * 
	 * 
	 * pseudo code 
	 * 
	 * 1)using sliding window keep left and right pointers
	 * 2)keep incrementing right and insert into map
	 * 3) if map contains key 
	 * 		a.remove it (store window size =max) move left to one
	 * 		b.else keep adding
	 * 4)	
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	

	

	@Test
	public void square() {
		
		String s = "dvdf";
		
		System.out.println(longest(s));
	}
	
	private int longest(String s) {
		
		int left = 0, right = 0, maxCount = 0;
		HashSet<Character> set = new HashSet<Character>();
		
		while(right < s.length()) {
			if(set.add(s.charAt(right++))) {
				maxCount = Math.max(maxCount, set.size());
			} else {
				right = ++left;
				set.clear();
			}
		}
		return maxCount;
	}

	
	
	
	
	
	
}
