package firstday.First;

import org.junit.*;

import junit.framework.Assert;

public class Homework5 {

	/*
	 *Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some
 (can be none) of the characters without disturbing the relative positions of the remaining characters. 
 (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void subPos() {
		
		String s = "abcde";
		String t = "acd";
		
		Assert.assertTrue(subsequence(s,t));
	}

	//@Test
	public void subEdge() {
		
		String s = "abcde";
		String t = "acdf";
		
		Assert.assertTrue(subsequence(s,t));
		
	}

	//@Test
	public void subNeg() {
		
		String s = "abcde";
		String t = "aed";
		
		Assert.assertTrue(subsequence(s,t));
	}

	
	public boolean subsequence(String s,String t) {
		
	//solution 1	
	char[] sarray = s.toCharArray();
	char[]tarray = t.toCharArray();
	String result="";
	int k=0;
	
		for (int i = 0; i < tarray.length; i++) {

			for (int j = k; j < sarray.length; j++) {

				if (tarray[i] == sarray[j]) {
					result = result + tarray[i];
					k=j;
					break;
				} else {
					continue;
				}

			}

		}
	
	if(result.equalsIgnoreCase(t)) {
		return true;
	}
	
	
	//solution 2 replace all	
		
	return false;	
	}
	
}
