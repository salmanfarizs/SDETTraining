package fifthday.fifth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class GroupAnagramSliding {
	

	
	
	//6:44
	//
	@Test
	public void group() {
		
		String strs[]= {"","bat"};
		//String strs[]= {"eat","tea","tan","ate","nat","bat","tae"};
		
		
		System.out.println(anagram(strs));
	}

	private List<List<String>> anagram(String[] strs) {

		String[] compare = new String[strs.length];
		List<List<String>> output = new ArrayList<List<String>>();

		int left = 0, right = 0;

		while (left < strs.length) {

			List<String> inputList = new ArrayList<String>();

			while (right < strs.length) {

				if (isAnagram(strs[left], strs[right])) {

					inputList.add(strs[right]);
					compare[right] = strs[right];
				}
				right++;

			}
			output.add(inputList);

			for (int i = 0; i < compare.length; i++) {
				if (compare[i] == null) {
					left = i;
					break;
				} else {
					left++;
				}

			}
			right = left;
		}

		return output;

	}
	
	
	private boolean isAnagram(String string, String string2) {
		
		
		int sLength = string.length(),pLength=string2.length();
		
		HashMap<Character, Integer> pMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
		
		for (int i = 0; i < sLength; i++) {
			pMap.put(string.charAt(i), pMap.getOrDefault(string.charAt(i), 0)+1);
		}
		

		for (int i = 0; i < pLength; i++) {
			sMap.put(string2.charAt(i), sMap.getOrDefault(string2.charAt(i), 0)+1);
		}
		
		if(sMap.equals(pMap))
			return true;
		
		return false;
	}

	



}
