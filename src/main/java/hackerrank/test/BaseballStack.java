package hackerrank.test;

import java.util.Stack;

import org.junit.Test;

public class BaseballStack {

	
	/*
	 * 
	 * You are keeping score for a baseball game with strange rules. The game consists of several rounds, where the scores of past rounds may affect future rounds' scores.

At the beginning of the game, you start with an empty record. You are given a list of strings ops, where ops[i] is the ith operation you must apply to the record and is one of the following:

An integer x - Record a new score of x.
"+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
"D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
"C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.
Return the sum of all the scores on the record.

 
	 * 
	 * 
	 * 
	 */
	
	
	 @Test
	    public void test1() {
	        String s[] = {"5","2","C","D","+"};
	        //          1+1=2 
	        System.out.println(score(s));
	    }

	private int score(String[] s) {
		
		
		int sum=0;
		Stack<String> stack = new Stack<String>();
		for(int i=0;i<s.length;i++) {
			
			if(stack.isEmpty()) {
				stack.push(s[i]);
			}else {
				
				if(s[i].equals("C")) {
					
					stack.pop();
					
					
				}else if(s[i].equals("D")) {
					
					stack.push(String.valueOf(Integer.parseInt(stack.peek())*2));
					
					
				}else if(s[i].equals("+")){
					
					int first= Integer.parseInt(stack.pop());
					int second=Integer.parseInt(stack.pop());
					int add = first+second;
					stack.push(String.valueOf(second));
					stack.push(String.valueOf(first));
					stack.push(String.valueOf(add));
					
				}else {
					
					stack.push(s[i]);
				}				
				
			}
			
		}
		
		
		
		while(!stack.isEmpty()) {
			sum+= Integer.parseInt(stack.pop());
		}
		
		
		
		return sum;
	}
}
