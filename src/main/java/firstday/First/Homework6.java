package firstday.First;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class Homework6 {
	
	
	/*
	 * Given a string s, reverse only all the vowels in the string and return it.
	 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.
	 *  
	 */
	
	//@Test
	public void revPos() {
		
		String s = "leetcode";
		rev(s);
	}

	@Test
	public void revEdge() {
		
		String s = "aeiou";
		rev(s);
		
	}

	//@Test
	public void revNeg() {
		
		String s = "abcde";
		rev(s);
	}
	
	public void rev(String s) {
		
		
/*		 char[] arr= s.toCharArray();
	        Set<Character> vowels=new HashSet<Character>();
	        vowels.add('a');
	        vowels.add('e');
	        vowels.add('i');
	        vowels.add('o');
	        vowels.add('u');
	        vowels.add('A');
	        vowels.add('E');
	        vowels.add('I');
	        vowels.add('O');
	        vowels.add('U');
	        Stack<Character> stack=new Stack<Character>();
	        for(char c:arr)
	        {
	            if(vowels.contains(c)) stack.push(c);
	        }
	        for(int i=0;i<arr.length;i++)
	        {
	            if(vowels.contains(arr[i])) 
	            {
	                arr[i]=stack.pop();
	            }
	        }
	        System.out.println(Arrays.toString(arr));
	    
	    
*/
		
		/*char[] arr= s.toCharArray();
		Set<Character> vowels=new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        List<Character> rev = new ArrayList<Character>();
        for(char c :arr) {
        	
        	if(vowels.contains(c)) {
        		
        		rev.add(c);
        	}
        }
        
        System.out.println(rev);
		
        int k=1;
		
		for(int i=0;i<arr.length;i++) {
			
			if(vowels.contains(arr[i])) {
				
				for(int j=k;j<=rev.size();j++) {
				arr[i]=rev.get(rev.size()-j);
				break;
				}
				k++;
			}
		}
		
		System.out.println(Arrays.toString(arr));*/
		
		//hello
		
		char[] arr= s.toCharArray();
		Set<Character> vowels=new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        int left=0, right = arr.length -1;
        
        	
		while (left < right) {
			if (vowels.contains(arr[left]) && vowels.contains(arr[right])) {
				char temp = arr[left];
				arr[left++] = arr[right];
				arr[right--] = temp;
			}else if (vowels.contains(arr[left]) && !vowels.contains(arr[right]))
				right--;

			else if (!vowels.contains(arr[left]) && vowels.contains(arr[right]))
				left++;
			else if (!vowels.contains(arr[left]) && !vowels.contains(arr[right])) {
				left++;
				right--;
			}
			//System.out.println(Arrays.toString(arr));
		}	
			
					System.out.println(Arrays.toString(arr));
			
		}
		
	



}