package fifthday.fifth;

import org.junit.Test;

public class RingsRods {

	
	//13:25
	//13:42
	
	@Test
	public void rings() {
		
		
		String rings="G4";
		System.out.println(numberOfRings(rings));
	}
	
	
	private int numberOfRings(String rings) {
		
		int numberOfRings=0;
		
		String allRings= "BRG";
		int rods =10;
		
		
		for(int i=0;i<rods;i++) {
			
			if(rings.contains(allRings.charAt(0)+""+i) && rings.contains(allRings.charAt(1)+""+i) &&rings.contains(allRings.charAt(2)+""+i))
				numberOfRings++;
		}
		
		
		
		
		return numberOfRings;
	}
}
