
//Majority elements

package firstday.First;

import java.util.Arrays;

import org.junit.Test;

public class Homework3 {
	
	
	
	//@Test
	public void majorityPos() {
		
		int nums[]  = {3,2,3};
		majority(nums);
		
	}

	@Test
	public void majorityEdge() {
		
		int nums[]  = {4,4,4,1,1,1,1,3,2,3};
		majority(nums);
		
	}

	//@Test
	public void majorityNeg() {
		
		
	}

	public void majority(int a[]) {
		
		Arrays.sort(a);
		int count =1;
		int temp1=0,temp2 =0;
		int majorinumber = 0;
		for (int i = 0; i < a.length -1; i++) {

			if (a[i] == a[i + 1]) {
				count++;
				if(count>temp1) {
				temp1 = count;
				majorinumber = a[i];
				}
				continue;

			} else {
				temp2 = count;
				count = 0;
				continue;
			}

		}
		
		System.out.println("majority number is " + majorinumber);
		
		
	}
	
	
	
	
}
