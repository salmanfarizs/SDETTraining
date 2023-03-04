package sixthday.six;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Balloon {
	


	
	/*
	 * 
	 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

       You can use each character in text at most once. Return the maximum number of instances that can be formed.
	 * 
	 * 
	 * 
	 * 
	 */
	
	




	
	
	
	@Test
	public void search() {
		
		
		String text = "krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw";
		System.out.println(binarySearch(text));
	}

	private int binarySearch(String text) {
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		if(text.length()<7)
			return 0;
		
		int value=Integer.MAX_VALUE;
		char ch[]=text.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			if (map.containsKey(ch[i])) {

				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}

		}
		
		String target="balloon";
		
		
		char[] tar = target.toCharArray();
		for(int i=0;i<tar.length;i++) {
			
		if(map.get(tar[i])==null)	
			return 0;
		
		System.out.println(tar[i]);
		
		if(tar[i] == 'l' || tar[i]=='o')
		value=Math.min((map.get(tar[i]))/2,value);
		else
		value=Math.min(map.get(tar[i]),value);	
		}
		
		return value;
	}
	
	
	
	



}
