package eigthday.eight;

import java.util.HashMap;
import java.util.Stack;

import org.junit.Test;

public class Paranthesis {

	
	@Test
	public void runner() {
		
		String s="(()())(())(()(()))";
		System.out.println(print(s));
	}

	/*
	 * Algorithm
	 * create a empty stack
	 * create a map if both bracket value equals pop all the value and remove outer brackets
	 * 
	 * 
	 * 
	 */
	
	
	
	private String print(String s) {

		Stack<Character> stack = new Stack<Character>();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		char[] ch = s.toCharArray();

		String output = "";

		for (int i = 0; i < ch.length; i++) {

			map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
			stack.push(ch[i]);

			if (map.get('(').equals(map.get(')'))) {

				StringBuffer str = new StringBuffer();
				

				while (!stack.isEmpty()) {
					str.append(stack.pop());
				}
				str.reverse();
				
				output += str.substring(1, str.length() - 1);
				
				map.clear();
			}

		}

		return output;
	}
	
	
	
	
}
