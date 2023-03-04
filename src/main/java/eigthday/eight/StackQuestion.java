package eigthday.eight;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class StackQuestion {

	
	//remove adjacent duplicates
		
	@Test
	public void runner() {
		
		String s="abbaca";
		System.out.println(removeAdj(s));
	}

	private String removeAdj(String s) {
		
		
		String output ="";
		
		
		//Stack solution
		
		char[] ch = s.toCharArray();		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<ch.length;i++) {
			
			if(stack.isEmpty()) 
			{
				stack.push(ch[i]);
			continue;
			}
			
			if(stack.peek().equals(ch[i])) {
				stack.pop();
			}else {
				stack.push(ch[i]);
			}
			
			
		}
		
		for(char character:stack) output+=character;
		
		//List solution
		
		/*List<Character> list = new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			
			
			if(list.contains(s.charAt(i))) {
				if(list.get(list.size()-1).equals(s.charAt(i))) list.remove(list.size()-1);
				else
					list.add(s.charAt(i));
			}else {
				list.add(s.charAt(i));
			}
		}
		
		
		for(char character:list) output+=character;*/
		return output;
	}
	
}
