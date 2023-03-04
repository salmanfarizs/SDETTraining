import java.util.Arrays;

import org.junit.Test;

public class InsertionSort {
	
	
	
	
	
	//Insertion sort --> sort the left side of current index before moving
	
	@Test
	public void sort() {
		
		int nums[] = {7,6,5,4,3,2,21,1,-2};
		System.out.println(Arrays.toString(sortOuput(nums)));
	}

	private int[] sortOuput(int[] nums) {
		
		int temp=0,i=0;
		

			for (int j = 1; j < nums.length; j++) {
				
				if (nums[j - 1] > nums[j]) {

				    temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
					i=j;
				}
				
			while (i > 0) {

				if (nums[i - 1] > nums[i]) {
					temp = nums[i - 1];
					nums[i - 1] = nums[i];
					nums[i] = temp;

				}
				i--;

			}

			}
		
		
		
		
		return nums;
	}

	
	

}
