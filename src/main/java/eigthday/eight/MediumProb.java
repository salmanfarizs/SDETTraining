package eigthday.eight;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class MediumProb {

	
	
	/*
	 * 
	 * In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any other format of periods such as '...' are treated as file/directory names.

The canonical path should have the following format:

The path starts with a single slash '/'.
Any two directories are separated by a single slash '/'.
The path does not end with a trailing '/'.
The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
Return the simplified canonical path.
	 * 
	 */
	
	@Test
	public void runner() {
		
		String s="/home/../salman//fariz";
		//String s= "/a/./b/../../c/";
		System.out.println(print(s));
	}

	private String print(String s) {
		
		String[] split = s.split("/");
		Stack<String> stack = new Stack<String>();
		for (String eachString : split) {
			if(eachString.isEmpty() || eachString.equals(".")) continue;
			else if(eachString.equals("..")) {
				if(!stack.isEmpty()) 
					stack.pop();
			}
			else stack.push(eachString);
		}
		
		StringBuilder sb = new StringBuilder();
		if(stack.isEmpty()) sb.insert(0, "/");
		
		while(!stack.isEmpty()) {
			sb.insert(0, stack.pop());
			sb.insert(0, "/");
		}
				
		return sb.toString();
	
	
	
	}
	}
