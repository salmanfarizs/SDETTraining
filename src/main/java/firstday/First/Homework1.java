
//Move zeros

package firstday.First;

import java.util.ArrayList;
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
	 * Given the integer array and the target, 
       remove the matching target from the array
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
		int a[] = {0,1,0,3,12};
		
		System.out.println(Arrays.toString(moveZeros(a)));
        
    }
	
    //Edge cases
	//@Test
    public void example2()
    {
		
    	int a[] = {1,4,12,0,0};
    	System.out.println(Arrays.toString(moveZeros(a)));
    }
	
    // Negative cases
	//@Test
    public void example3()
    {
		int a[] = {1,3,12};
		System.out.println(Arrays.toString(moveZeros(a)));
    }
    
    /* Check if array is empty Return empty array
     * Create a output array
     * Traverse through the input array (for loop)
     * Check if the target number matches
     * If target number does not matches add to output array
     * Return output array
     *  
     */
    
    
	
	public int[] moveZeros(int a[]) {
		
	//solution 1	
	/*	ArrayList<Integer> list1 = new ArrayList();
		ArrayList<Integer> list2 = new ArrayList();
		
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
		
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0)
				a[count++]=a[i];
		}
		
		while(count<a.length) {
			a[count++]=0;
		}
		
		return a;
	}
	
}
