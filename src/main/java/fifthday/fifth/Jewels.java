package fifthday.fifth;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

public class Jewels {

	


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
		
		String stones = "aAAbbbb";
		String jewel = "aA";
		
		System.out.println(noOfJewel(stones,jewel));
	}
	
	private int noOfJewel(String stones,String jewel) {
		
		
		char[] ch = stones.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		HashSet<Character> set = new HashSet<Character>();
		
		char[] charArray = jewel.toCharArray();
		
		for(char a :charArray) set.add(a);
		
		int i=0 ,numbers=0;
		
		while (i<stones.length()) {
			
			if(set.contains(ch[i])) {
				
				numbers++;
				
			}else {
				
				System.out.println("not needed");
			}
			i++;
			
		}
			
			
		
		
		
		
		
		return numbers;
	}

	
	
	
	
	
	


}
