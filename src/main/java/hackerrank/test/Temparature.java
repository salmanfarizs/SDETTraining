package hackerrank.test;

import java.util.Arrays;
import java.util.Stack;

import org.junit.Test;

public class Temparature {

	//9:49
	/*
	 * Given an array of integers temperatures represents the daily temperatures, return an array answer 
	 * such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
	 *  If there is no future day for which this is possible, keep answer[i] == 0 instead.
	 * 
	 * 
	 * 
	 */
	@Test
	public void runner() {
		
		int temp[] = {73,74,75,71,69,72,76,73};
		
		System.out.println(Arrays.toString(dailyTemperatures(temp)));
		
	}
	
	
public int[] dailyTemperatures(int[] temp) {
        
	//bruteforce
        
       /*int answer[] = new int[temp.length];
	
		for (int i = 0; i < temp.length; i++) {

			for (int j = i + 1; j < temp.length; j++) {

				if (temp[j] > temp[i]) {
					answer[i] = j - i;
					break;
				}
			}

		}*/
        
	
	
	Stack<Integer> stack = new Stack<Integer>();
	
	int answer[] = new int[temp.length];
	
	
	for(int i = 0; i < temp.length; i++) {
		
		
		while(!stack.isEmpty() && temp[stack.peek()]<temp[i]) {
			
			int j=stack.pop();
			answer[j]=i-j;
			
		}
			
			stack.push(i);
			
			
			
		}
	
	
	      return answer;
    }
	
	
}
