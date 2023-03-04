import java.util.Arrays;

import org.junit.Test;

public class SelectionSort {
	
	
	//Selection sort - take the lowest to rigand
	
	@Test
	public void sort() {
		
		int nums[] = {7,6,5,4,3,2,21,1,-2};
		System.out.println(Arrays.toString(sortOuput(nums)));
	}

	private int[] sortOuput(int[] data) {
		
		for (int i = 0; i < data.length; i++) {
			int min = i;
			for (int j = i+1; j < data.length; j++) {
				if(data[min] > data[j]) min = j;
			}
			int temp = data[min];
			data[min] = data[i];
			data[i] = temp;
		}
		return data;
			}

			}
		
		
		
		
	