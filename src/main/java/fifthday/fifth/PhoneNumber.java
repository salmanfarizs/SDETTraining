package fifthday.fifth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class PhoneNumber {
	
	

	

	
	
	//8:37
	//
	@Test
	public void group() {
		
		String digits ="";
		
		System.out.println(phoneNo(digits));
	}

	private List<String> phoneNo(String digits) {
		
		
		List<String> outputList = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		
		char[] ch = digits.toCharArray();
		list = combination(ch);
				
				
		
			
			
			if(list.size()==1) {
				
				for( char cha : list.get(0).toCharArray()) outputList.add(cha+""); 
			}
			
			if(list.size()==2) {
				
				
				for( char cha : list.get(0).toCharArray()) {
					
					for( char char2 : list.get(1).toCharArray()) {
						
						outputList.add(cha +""+char2);
						
					}
				}
			}
			
          if(list.size()==3) {
				
				
				for( char cha : list.get(0).toCharArray()) {
					
					for( char char2 : list.get(1).toCharArray()) {
						
						for( char char3 : list.get(1).toCharArray()) {
						
						outputList.add(cha +""+char2+""+char3);
					}
				}
			}
          }
			
          if(list.size()==4) {
        	  
        	  
        	  for( char cha : list.get(0).toCharArray()) {
					
					for( char char2 : list.get(1).toCharArray()) {
						
						for( char char3 : list.get(1).toCharArray()) {
							
							for( char char4 : list.get(1).toCharArray()) {
						
						outputList.add(cha +""+char2+""+char3+""+char4);
					}
				}
			}
        	  }  
          }
          
			
		return outputList;
		
		
		
		
		
	}

	private List<String> combination(char[] input) {
		
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("2", "abc");
		map.put("3", "def");
		map.put("4", "ghi");
		map.put("5", "jkl");
		map.put("6", "mno");
		map.put("7", "pqrs");
		map.put("8", "tuv");
		map.put("9", "wxyz");
		
		List<String> list = new ArrayList<String>();
		
		for(int i=0;i<input.length;i++) {
			String text = map.get(input[i]+"");
			list.add(text);
		}
		
		
		return list;
		
		
		
	}
	
	
}