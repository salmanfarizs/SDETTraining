package sixthday.six;

import org.junit.Test;

public class InsertPosition {



	
	
	
	@Test
	public void search() {
		
		/*
		 * [2,3,4,7,8,9]
            11
		 * 
		 * 
		 * 
		 */
		int[] arr = {2,3,4,7,8,9}; int k = 11;
		System.out.println(binarySearch(arr,k));
		
	}

	private int binarySearch(int[] arr, int k) {
		
		
		int low=0;
		int high = arr.length -1;
		int mid=0;
		
		while(low<=high) {
			
			mid = (low+high)/2;
			if (arr[mid]==k)
				return mid;
			if(arr[mid]<k)
			low =mid+1;
			else high = mid-1;
				
		}
		
		if(k>arr[mid]) {
			
			mid ++; 
		}
		
		
		
		
		return mid;
	}
	
	
	
	
	
	

}
