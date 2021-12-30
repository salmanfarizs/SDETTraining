package fourthday.four;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class Mapproblem {

	
	

	

	@Test
	public void square() {
		
		String input="xaaabc";
		String anagram="abc";
		
		System.out.println(anagram(input,anagram));
		
	}
	
	private int anagram(String s, String a) {
		
		int slength=s.length(),alength=a.length();
		
		
		HashMap<Character,Integer> smap = new HashMap<Character, Integer>();
		HashMap<Character,Integer> amap = new HashMap<Character, Integer>();
		
		
		
		for(int i=0;i<a.length();i++) {
			amap.put(a.charAt(i),amap.getOrDefault(a.charAt(i), 0)+1);
		}
		
		int right=0; int count=0;
		
		for(right=0;right<s.length();right++) {
			
			smap.put(s.charAt(right), smap.getOrDefault(s.charAt(right), 0)+1);
			
			
			if(right>=a.length() ) {
				
				char ch=s.charAt(right-a.length());
				if(smap.get(ch)==1) {
					smap.remove(ch);
				}else {
					smap.put(ch, smap.get(ch)-1);
				}
			}
			
			if(amap.equals(smap)) {
				count++;
			}
			
		}
		
		
		
		return count;
		
	}

	
	
	
	

}
