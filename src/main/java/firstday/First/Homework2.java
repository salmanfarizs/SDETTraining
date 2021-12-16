
// Maximum consecutive elements
package firstday.First;

import org.junit.Test;

public class Homework2 {
	
	
	//positive
	//@Test
	public void posConsecutive() {
		
		int a[]= {1,1,0,1,1,1};
		getNumberCount(a);
		
	} 

	//edge
		//@Test
	public void edgeConsecutive() {
			
			int a[]= {1,2,0,1,0,1};
			getNumberCount(a);
			
		} 

		//positive
		@Test
	public void negConsecutive() {
			int a[]= {0,2,3,4,5};
			getNumberCount(a);
			
		} 
		
		
		
		public void getNumberCount(int a[]) {
			
			int count =0;
			for(int i=0; i<a.length;i++) {
				
				if(a[i]!=1) {
					count = 0;
					continue;
				}else {
					count++;
				}
				
				
			}
			
			
			
			System.out.println("no of consecutive ones " + count);
			
			
		}

}
