package eigthday.eight;

import java.util.Stack;

import org.junit.Test;

public class BracketNumber {

	
	
	
	
	@Test
	public void runner() {
		
		String s="3[ab]";
		System.out.println(print(s));
	}
	
	/*
	 * b
	 * a
	 * [
	 * 3
	 */

	private String print(String s) {
		// TODO Auto-generated method stub
		
		Stack<Character> stack = new Stack<Character>();
		
		char[] ch = s.toCharArray();
		
		 String output = "";
		StringBuffer str = new StringBuffer();
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]!=']') {
				
				stack.push(ch[i]);
				
			}else {
				
				
			}
			
			
}
		
		return output;
		
	
	}}
