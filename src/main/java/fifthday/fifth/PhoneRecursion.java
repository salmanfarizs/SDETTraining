package fifthday.fifth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class PhoneRecursion {

	
	

	

	
	
	//8:37
	//
	@Test
	public void group() {
		
		String digits ="23";
		
		System.out.println(phoneNo(digits));
	}

	/*private List<String> phoneNo(String digits) {
		
		List<String> result = new ArrayList<String>();
		if(digits == null || digits.length()==0)
			return result;
		
		String mapping[]= {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","xyz"};
		
		
		combination(result,digits,"",0,mapping);
		
		return result;
		
		
	}

	private void combination(List<String> result, String digits,String curr,int index,String[] mapping) {
		
		if(index==digits.length()) {
			result.add(curr);
			return;
		}
		
		int j = digits.charAt(0) -'0';
		System.out.println(j);
		System.out.println(digits.charAt(index) - '0');
		String letters = mapping[digits.charAt(index) - '0'];
		for(int i=0;i<letters.length();i++)
			combination(result,digits,curr+letters.charAt(i),index+1,mapping);
		
	}
	
	*/
	
	
  private List<String> phoneNo(String digits) {
		
		List<String> result = new ArrayList<String>();
		if(digits == null || digits.length()==0)
			return result;
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("2", "abc");
		map.put("3", "def");
		map.put("4", "ghi");
		map.put("5", "jkl");
		map.put("6", "mno");
		map.put("7", "pqrs");
		map.put("8", "tuv");
		map.put("9", "wxyz");
		
		
		combination(result,digits,"",0,map);
		
		return result;
		
		
	}

	private void combination(List<String> result, String digits,String curr,int index,Map<String,String> map) {
		
		if(curr.length()==digits.length()) {
			result.add(curr);
			return;
		}
		
		System.out.println(digits.charAt(index) - '0');
		String letters = map.get(digits.charAt(index) - '0'+"");
		for(int i=0;i<letters.length();i++)
			combination(result,digits,curr+letters.charAt(i),index+1,map);
		
	}


}
