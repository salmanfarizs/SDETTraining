package sixthday.six;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class PatternMatch {

	/*
	 * Example 1:
String[] ch = {"abb", "abc", "xyz", "xyy"};
String pattern = "mnn";
Output: ["xyy","abb"] --> List -> Any order
Answer: xyy and abb have same character at index 1 and 2 like the pattern
Example 2:
String[] ch = {"abb", "abc", "xyz", "xyy"};
String pattern =  "mno";
Output: ["abc", "xyz"]
Output: abc and xyz have all distinct characters, similar to the pattern.
Example 3:
String[] ch = ["abb", "abc", "xyz", "xyy"];
String pattern = "aba";
Output: [] 
Pattern has same character at index 0 and 2. No word in dictionary follows the pattern.+
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	/* pseudocode
	 * 
	 * store the pattern in map and equalent first string
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void square() {
		
		String pattern = "mnn";
		String[] s = {"abb", "abc", "xyz", "xyy"};
		
		System.out.println(pattern(pattern,s));
		
		
	}
	
	
     private List<String> pattern(String pattern,String[] s) {
		
		
		
    	 List<String> list = new ArrayList<String>();
		
		
		for(int j=0;j < s.length; j++) {
			
			
			if(isMatching(pattern,s[j])) {
				
				list.add(s[j]);
				
			}
		}
		
		
		return list;
	
}
	
	private boolean isMatching(String pattern,String s) {
		
		
		
		HashMap<Character,String> patternMap = new HashMap<Character,String>();
		HashMap<String,Character> dataMap = new HashMap<String,Character>();
		
		
		
		char[] ch = pattern.toCharArray();
		
			if(ch.length != s.length())
			return false;
			
			char[] sarray = s.toCharArray();
			
			
			for(int i=0;i<ch.length;i++) {
				
				if(!patternMap.containsKey(ch[i]) && !dataMap.containsKey(sarray[i] +"")){
					
					patternMap.put(ch[i], sarray[i]+"");
					dataMap.put(sarray[i]+"", ch[i]);
					
				}else if(patternMap.get(ch[i])==null){
					
					return false;
				}else				
					if(!(patternMap.get(ch[i]).equals((sarray[i]+"")))){
						
						return false;
					}
					
				}
				
				
			
			return true;
	}
	
}
