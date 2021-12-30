package seconday.second;
import java.util.Arrays;
import java.util.HashSet;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;
public class Insertion {
	

	//Move zeros

	


	

	/**
	 * Hello world!
	 *
	 */
	
		
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
	    	int a[] = {1,2,3,4,5};
	    	int b[]= {3,4,5};
	    	insertion(a,b);
	        
	    }
		
	    //Edge cases
		@Test
	    public void example2()
	    {
			
	    	int a[] = {1,4,12,0,0};
	    	//moveZeros(a);
	    }
		
	    // Negative cases
		//@Test
	    public void example3()
	    {
			int a[] = {1,3,12};
			//moveZeros(a);
	    }
	    
	    /* Check if aay is empty Return empty aay
	     * Create a output aay
	     * Traverse through the input aay (for loop)
	     * Check if the target number matches
	     * If target number does not matches add to output aay
	     * Return output aay
	     *  
	     */
	    
	    
		
		public void insertion(int a[],int b[]) {
	
			//solution 3 2 pointer alogorithm
			
			int left=0;
			int right=0;
			
		while (left < a.length && right < b.length) {
			if (a[left] == b[right]) {
				System.out.print(a[left]);
				left++;
				right++;
			} else if (a[left] > b[right]) {
				right++;
			} else if (a[left] < b[right]) {
				left++;
			}

		}
		
		//System.out.println(Arrays.toString(a));
			
			
			
		}
		
	}



