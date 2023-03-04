package hackerrank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

import org.junit.Test;

public class Problem1 {
	
	

    @Test
    public void test1() {
        String brackets = "))()((";
        System.out.println(balanceParantheses(brackets));
    }
    
    /*
     * 
     *  * 1. Crate Stack. 
	 * 2. Convert input string into charArray
	 * --Loop Begins--
	 * 3. Traverse till end of charArray
	 * 4. If stack is empty, push the value
	 * 5. If stack is not empty,
	 * 		5a. If current character is '(', push it
	 * 		5b. else if current character is ')' pop the value from stack
	 * --Loop Exit--
	 * 6. Get the count of swaps as size of stack/2
	 * 7. If the count of swaps is <1, return -1. Else return swaps
     * 
     * 
     * 
     * 
     * 
     * 
     */

    private int balanceParantheses(String brackets) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();
		char[] ch = brackets.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(stack.isEmpty()) stack.push(ch[i]);
			else {
				if(ch[i]=='(') stack.push(ch[i]);
				else stack.pop();
			}
		}
		
		System.out.println(stack);
		int swaps = (stack.size()/2);
		if(swaps<1) return -1;
		else return swaps;
	}
    
   

}
