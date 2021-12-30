package thirdday.third;

import java.util.Arrays;

import org.junit.Test;

public class Nonsortedarray {
	

		@Test
		public void square() {
			
			//int nums[]= {4,3,2,1};
			int nums[]  = {-1,-44,1,0,4,7,6};
			System.out.println(Arrays.toString(square(nums)));
			
		}
		
		private int [] square(int nums[]) {			
				
			nums = returnSquare(nums);	
			
			Arrays.sort(nums);
			
			/*for(int k=0;k<nums.length-1;k++) {
				int left=0;
			for(int right=left+1;right<nums.length-1;right++) {
				
				while(nums[right]<nums[left]) {
					int temp = nums[left];
					nums[left++]=nums[right];
					nums[right++]=temp;
					if(right==nums.length)
						break;
				}
				left++;
				
			}
		
		}*/
		return nums;
		}
	
	private int[] returnSquare(int nums[]) {

		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}

		return nums;

	}

}
