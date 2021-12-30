import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

public class WordPattern {
	
	
	
	


	


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
	

	
	/*
	     * Hashing PsuedoCode
	     *
	     * Pattern -> Character (Key) : String (Value) && 
	     * Data -> String (Key) : Character (Value)
	     * 
	     * Iterate through each word of String and corresponding character in Pattern
	     *     1) If it is new (no entry) on both -> add to the respective map 
	     *  2) If the character is not there but String in map -> return false
	     *  3) If the character is there in map, then get the corresponding value & compare
	     *      a) If it is not same as expected -> return false
	     *   If all above conditions passed through then return true
     * 
     */

	@Test
	public void square() {
		
		String pattern = "abba";
		String s = "dog cat cat dog";
		
		System.out.println(noOfJewel(pattern,s));
	}
	
	private boolean noOfJewel(String pattern,String s) {
		
		
		/*HashMap<Character,String> patternMap = new HashMap<Character,String>();
		HashMap<String,Character> dataMap = new HashMap<String,Character>();
		
		
		char[] ch = pattern.toCharArray();
		
		String[] sp = s.split(" ");
		
		
		if(ch.length != sp.length)
		return false;
		
		for(int i=0;i<ch.length;i++) {
			
			if(!patternMap.containsKey(ch[i]) && !dataMap.containsKey(s.split(" ")[i])){
				
				patternMap.put(ch[i], s.split(" ")[i]);
				dataMap.put(s.split(" ")[i], ch[i]);
				
			}else if(patternMap.get(ch[i])==null){
				
				return false;
			}else				
				if(!(patternMap.get(ch[i]).equals((s.split(" ")[i])))){
					
					return false;
				}
				
			}
			
			
		
		
		return true;*/
		
		
		boolean isMatched = true; int i =0;
	    Map<String,Character> stringMap = new HashMap<String,Character>();
	    Map<Character,String> characterMap = new HashMap<Character,String>();
	    if(pattern.length()==s.split(" ").length)
	    {
	    while(i<pattern.length()) {
	        if ((!characterMap.containsKey(pattern.charAt(i)) && !stringMap.containsKey(s.split(" ")[i]))) {
	            characterMap.put(pattern.charAt(i),s.split(" ")[i]);
	            stringMap.put(s.split(" ")[i],pattern.charAt(i));
	        }
	        else if(characterMap.get(pattern.charAt(i))==null)
	                isMatched = false;
	        else if(!characterMap.get(pattern.charAt(i)).equals(s.split(" ")[i]))
	            
	                    isMatched = false;
	        i++;
	     }
	   }else {
		   isMatched = false;
	   }
	    return isMatched;
		
		
	}

	
	
}
	
	
	
	





