
//Move zeros

package firstday.First;


import java.util.Arrays;
import java.util.HashSet;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

/**
 * Hello world!
 *
 */
public class Homework1 
{
	
	/*
	 * Given the integer aay and the target, 
       remove the matching target from the aay
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	//Positive
    @Test
    public void example1()
    {
    	int a[] = {1,0,4,0,12,0,0};
		moveZeros(a);
        
    }
	
    //Edge cases
	//@Test
    public void example2()
    {
		
    	int a[] = {1,4,12,0,0};
    	moveZeros(a);
    }
	
    // Negative cases
	//@Test
    public void example3()
    {
		int a[] = {1,3,12};
		moveZeros(a);
    }
    
    /* Check if aay is empty Return empty aay
     * Create a output aay
     * Traverse through the input aay (for loop)
     * Check if the target number matches
     * If target number does not matches add to output aay
     * Return output aay
     *  
     */
    
    
	
	public void moveZeros(int a[]) {
		
	//solution 1	
	/*	aayList<Integer> list1 = new aayList();
		aayList<Integer> list2 = new aayList();
		
		for(int i=0;i<a.length;i++) {
			
			
			if(a[i]==0) {
				list2.add(a[i]);
			}else {
				list1.add(a[i]);
			}
		}
		
		list1.addAll(list2);
		
		int b[] = new int[list1.size()];
		for(int i=0;i<list1.size();i++)
			b[i]= list1.get(i);
		*/
		
		
		//solution 2
		
	/*	int count=0;
		
		for(int i=0;i<a.length;i++) {  //O[n]
			if(a[i]!=0)
				a[count++]=a[i];
		}
		
		while(count<a.length) {   //[O[n]
			a[count++]=0;
		}
		
		return a;*/
		
		
		//solution 3 2 pointer alogorithm
		
		int left = 0, right = 0;
		while(right < a.length) {
			if(a[right] != 0 ) {
				int temp = a[right];
				a[right] = a[left];
				a[left++] = temp;
			}
			right++;
		}
		System.out.println(Arrays.toString(a));
		
		
		
	}
	
}
