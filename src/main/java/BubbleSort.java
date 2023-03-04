import java.util.Arrays;

import org.junit.Test;

public class BubbleSort {
	

	//Bubble sort O[n^2]
	
	
	@Test
	public void sort() {
		
		int nums[] = {7,6,5,4,3,2,21,1,-2};
		System.out.println(Arrays.toString(sortOuput(nums)));
	}

	private int[] sortOuput(int[] nums) {
		
		
		for (int i = 0; i < nums.length; i++) {

			for (int j = 1; j < nums.length - i; j++) {

				if (nums[j - 1] > nums[j]) {

					int temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;

				}

			}
		}
		
		
		
		return nums;
	}

}
