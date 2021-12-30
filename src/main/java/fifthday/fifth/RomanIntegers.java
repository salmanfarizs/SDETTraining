package fifthday.fifth;

import java.util.HashMap;

import org.junit.Test;

public class RomanIntegers {
	
	//2:43
	@Test
	public void roman() {
	
		String s ="LVIII";
		System.out.println(returnInteger(s));
		
		
	}
	
	/**
	 * 
	 Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
	 */

	private int returnInteger(String s) {
		
		int number=0;
		
		HashMap<Character,Integer> chMap = new HashMap<Character,Integer>();
		
		chMap.put('I', 1);
		chMap.put('V', 5);
		chMap.put('X', 10);
		chMap.put('L', 50);
		chMap.put('C', 100);
		chMap.put('D', 500);
		chMap.put('M', 1000);
		
		HashMap<String,Integer> stringMap = new HashMap<String,Integer>();
		
		stringMap.put("IV", 4);
		stringMap.put("IX", 9);
		stringMap.put("XL", 40);
		stringMap.put("XC", 90);
		stringMap.put("CD", 400);
		stringMap.put("CM", 900);
		
		
		//"MCMXCIV";
		int right=1;
		for (int left = 0; left < s.length(); left++) {

			if (left == s.length() - 1)
				right--;

			if (stringMap.containsKey(s.charAt(left) + "" + s.charAt(right))) {

				number += stringMap.get(s.charAt(left++) + "" + s.charAt(right++));

			} else if (chMap.containsKey((s.charAt(left)))) {

				number += chMap.get(s.charAt(left));

			}

			right++;

		}
		
		return number;
	}
	
}
