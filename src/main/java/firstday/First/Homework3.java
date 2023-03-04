
//Majority elements

package firstday.First;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class Homework3 {
	
	
	
	//@Test
	public void majorityPos() {
		
		int nums[]  = {3,2,3};
		majority(nums);
		
	}

	@Test
	public void majorityEdge() {
		
		int nums[]  = {4,4,4,4,4,1,1,1,1,3,2,3};
		majority(nums);
		
	}

	//@Test
	public void majorityNeg() {
		
		
	}

	public void majority(int a[]) {
		
		
		int number=0;
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i],1);
			}
			
			number=Math.max(map.get(a[i]), number);
					}

		
		for (Entry<Integer, Integer> entry : map.entrySet()) {

			if (map.get(entry.getKey()) == number)
				System.out.println(entry.getKey() + " is max occurence");

		}
		

		
	}
	
	
	
	
}
