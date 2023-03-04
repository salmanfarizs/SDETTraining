package sixthday.six;

import org.junit.Test;

public class BinarySearch {

	
	//missing numbers
	
	@Test
	public void search() {
		
		
		int[] arr = {1,2,3,4}; int k = 2;
		System.out.println(binarySearch(arr,k));
		
	}

	private int binarySearch(int[] arr, int k) {

		
		
		int left=0,right=0;
		
		int b[]= new int[100];
		
		
		//System.out.println(right++);
		
		while(right<Integer.MAX_VALUE) {
			
			
			if(arr[left]==++right) {
				
				if(left < arr.length-1)
				left++;
			}else {
				
				k--;
				if(k==0)
					return right++;
			}
			
		}
		
		
		return 0;
	}
	
	
	
	
	
}

