package fifthday.fifth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class PairsOfArray {
	
	@Test
	public void pairs() {
		
		/*[1, 1, 1, 2, 2]

				3*/
		
		
		int nums[] = {1, 1, 1, 2, 2}, k = 0;
		System.out.println(findPairs(nums, k));
		
	}

	
	private int findPairs(int[] nums, int k) {
		
		List<Integer> list = new ArrayList<Integer>();
		HashSet<String> set = new HashSet<String>();
		for(int i=0;i<nums.length;i++)
			list.add(nums[i]);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		int count=0;
		int left=0;
		int right =left+1;
		
		while (right<nums.length) {

			if (Math.abs(list.get(left) - list.get(right)) == k) {

				int max = Math.max(list.get(left), list.get(right));
				int min = Math.min(list.get(left), list.get(right));
				if (set.add(max + "," + min)) {
					count++;
				}

				left++;
                right=left;
			}else if (Math.abs(list.get(left) - list.get(right)) > k){
				left++;
				right=left;
			}
			
			
			right++;

		}
		
		
		
		
		/*for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				
				System.out.println(Math.abs(list.get(i)) - Math.abs(list.get(j)));
				if(Math.abs(list.get(i) - list.get(j)) == k ) {
					
					int max =Math.max(list.get(i), list.get(j));
					int min =Math.min(list.get(i), list.get(j));
					if(set.add(max + "," + min)){
					count++;
			}
			
			
			
		}
		
		
	}
}
*/		System.out.println(set);
		return count;
		
}
	
}