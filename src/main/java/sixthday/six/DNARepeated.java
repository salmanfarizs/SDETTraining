package sixthday.six;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class DNARepeated {
	
	/*
	 * The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

   For example, "ACGAATTCCG" is a DNA sequence.
   When studying DNA, it is useful to identify repeated sequences within the DNA.

   Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that 
   occur more than once in a DNA molecule. You may return the answer in any order.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	

	
	
	@Test
	public void search() {
		
		String s="AAAAAAAAAAA";
		
		System.out.println(binarySearch(s));
	}

	private List<String> binarySearch(String s) {

		List<String> list = new ArrayList<String>();
		int left = 0;
		int right = 10;

		
		//Brute force
		/*Set<String> set = new HashSet<String>();

		for (; right < s.length(); right++) {

			String substring = s.substring(right - 10, right);

			for (left = right - 10; left < s.length() - 10; left++) {

				if (s.substring(left + 1).contains(substring))
					set.add(substring);

			}

		}

		list.addAll(set);*/
		
		
		//Sliding window + HashMap
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		while(right<=s.length()) {
			
			String sub = s.substring(left, right);
			
			if(map.containsKey(sub)) {
				map.put(sub, map.get(sub)+1);
			}else {
				map.put(sub, 1);
			}
			left++;
			right++;
		}
		
		for(Map.Entry<String,Integer> entry:map.entrySet()) {
			if(map.get(entry.getKey())>=2)
					list.add(entry.getKey());
		}
		
		
		return list;
	}

	
	
	
	
	

}
