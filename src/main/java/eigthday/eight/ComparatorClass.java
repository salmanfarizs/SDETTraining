package eigthday.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class ComparatorClass {
	
	
	//Comparator
	
	@Test
    public void test1() {
        int[] data = {3,4,6,2,4,2};
        frequencySort(data);
    }

	private void frequencySort(int[] data) {
		
		
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
	       
	       
		for (int i = 0; i < data.length; i++) {
			
            map.put(data[i], map.getOrDefault(data[i], 0)+1);

		}
       
      List<Integer> list = new ArrayList<Integer>();
      
      
      for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
    	  
    	  list.add(entry.getValue());
      }
      
      
      
      
      
		
	}

	
	}
	

