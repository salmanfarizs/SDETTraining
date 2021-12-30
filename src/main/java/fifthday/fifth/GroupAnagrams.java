package fifthday.fifth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class GroupAnagrams {
	
	
	//6:44
	//
	@Test
	public void group() {
		
		//String strs[]= {"a"};
		String strs[]= {"eat","tea","tan","ate","nat","bat"};
		
		//             {5,5,1,5,1,2}
		System.out.println(anagram(strs));
	}

	private List<List<String>> anagram(String[] strs) {
		
		List<String> smallList = new ArrayList<String>();
		
		for(String str : strs) smallList.add(str);
		
		
		
		List<List<String>> output = new ArrayList<List<String>>();
	
		for (int i = 0; i < smallList.size();) {


			List<String> findAllAnagrams = findAllAnagrams(smallList, smallList.get(i));
			
			for(String s : findAllAnagrams) smallList.remove(s);
			

			if (findAllAnagrams.isEmpty()) {

				for (int j = 0; j < smallList.size(); j++) {
					List<String> NotAnagram = new ArrayList<String>();
					NotAnagram.add(smallList.get(j));
					output.add(NotAnagram);
				}

			}else {
			output.add(findAllAnagrams);
			}
		}
		
		
		return output;
		
	}
	
	
	private List<String> findAllAnagrams(List<String> s, String p) {
		
		int sLength = s.size(), pLength = p.length();
		
		
		List<String> list = new ArrayList<String>();
		
		if(pLength > sLength)
			new RuntimeException("Given Input is wrong");
		
		HashMap<Character, Integer> pMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
		
		for (int i = 0; i < pLength; i++) {
			pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0)+1);
		}
		
		       
			for (int j=0; j < sLength;j++) {
				
				char[] ch = s.get(j).toCharArray();
				for(int k=0;k<ch.length;k++) {
				sMap.put(ch[k], sMap.getOrDefault(ch[k], 0)+1);}
				if(pMap.equals(sMap)) {
					list.add(s.get(j));
					
				}
				sMap.clear();
			}
		
	
		
			return list;
	}
	

}
