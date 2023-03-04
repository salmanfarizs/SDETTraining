package hackerrank.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Clock {
	
	 @Test
	    public void test1() {
	        String s = "ZAC";
	        //          1+1=2 
	        System.out.println(clock(s));
	    }

	private int clock(String s) {
		
		
		int totalDistance=0;
		List<Character> list = new ArrayList<Character>();
		
		list.add('A');
		
		char[] ch = s.toCharArray();
		for(char c:ch) list.add(c);
		
		System.out.println(list);
		
		for(int i=0;i<list.size()-1;i++) {
			
			
			int value =Math.abs(list.get(i)-list.get(i+1));
			
			if(value > 13) {
				
				value =Math.abs(26 -value);
				totalDistance+=value;
				
			}else {
				
				totalDistance+=value;
				
			}
			
		}
		return Math.abs(totalDistance);
		
		
		
		
	}

	

	 
	 
	 
	 
}
