package seventhday.seven;

import java.util.Stack;

import org.junit.Test;

public class StackBracket {

	
	
	@Test
	public void balancedBracket() {
		
		String s = "{[()]}}}";
		System.out.println(isBalanced(s));
		
	}

	private boolean isBalanced(String s) {
		
		
		
		Stack<Character> stack = new Stack<Character>();
		
		boolean isBalanced=true;
		
		if(s.length()%2!=0) isBalanced =false;
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));

			}else if(s.charAt(i)=='}') {
					ch='{';
			}else if(s.charAt(i)==']') {
					ch='[';
			}else if(s.charAt(i)==')') {
					ch='(';
			}
				
				if(stack.isEmpty()) {
					isBalanced =false;
					break;
				}
				
				if(ch==stack.peek()) {
					stack.pop();
					}else {isBalanced =false;
		              break;
			             }
		}
		

	
		return isBalanced;
	}
	
	
}
