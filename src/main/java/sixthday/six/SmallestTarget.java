package sixthday.six;

import org.junit.Test;

public class SmallestTarget {

	
	/*
	 * 
	 * Given a characters array letters that is sorted in non-decreasing order and a character target,
	 *  return the smallest character in the array that is larger than target.

      Note that the letters wrap around.

      For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
	 * 
	 * 
	 * 
	 * 
	 */
	
	




	
	
	
	@Test
	public void search() {
		
		char[] letters = {'c','f','j' }; int target = 'g';
		System.out.println(binarySearch(letters,target));
		
	}

	private char binarySearch(char[] letters, int target) {

		int low = 0;
		int high = letters.length - 1;
		int mid = 0;
		
		
		if(ascii(letters[high])==target)
			return letters[low];
		
		while (low <= high) {

			mid = (low + high) / 2;

			if (ascii(letters[mid]) > target) {
				high = mid - 1;
			} else if (ascii(letters[mid]) == target)
				return letters[mid + 1];
			else{
				low = mid + 1;
			}
			
			
			
			}
		
		
	
		return letters[low];
			

		
	}
	
	
	
	private int ascii(char c) {
		int ascii = c;
		
		return ascii;
		
	}
	
	


}
