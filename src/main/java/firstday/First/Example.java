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
public class Example 
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
	//@Test
    public void example1()
    {
		int a[] = {1,2,4,5,6,7,8};
		int target = 6;
		System.out.println(Arrays.toString(removeTarget(a,target)));
        
    }
	
	//@Test
    public void example2()
    {
		
    	int a[] = {1,2,4,5,6,7,6,8};
		int target = 6;
		System.out.println(Arrays.toString(removeTarget(a,target)));
        
    }
	
	@Test
    public void example3()
    {
    	int a[] = {};
		int target = 6;
		System.out.println(Arrays.toString(removeTarget(a,target)));
    }
    
    /* Check if array is empty Return empty array
     * Create a output array
     * Traverse through the input array (for loop)
     * Check if the target number matches
     * If target number does not matches add to output array
     * Return output array
     *  
     */
    
    
	
	public int[] removeTarget(int a[],int target) {
		
		ArrayList<Integer> set = new ArrayList<Integer>();
	
		for(int i=0;i<a.length;i++) 			
		if(a[i]!=target) set.add(a[i]);		

		int b[] =new int[set.size()];
		for(int i=0;i<set.size();i++)
			b[i]=set.get(i);
			
		
		
		
		return b;
	}
	
}
