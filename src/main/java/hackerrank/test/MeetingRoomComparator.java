package hackerrank.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Test;

public class MeetingRoomComparator {
	
	
	/**
	 * 
	 * 
	 * String[][] meetingTimes = {{"09 00", "09 45"},{"09 30", "10 30"},  {"10 40", "12 00"},{"11 00", "13 00"},  {"11 45", "14 00"},{"16 00", "17 00"}}
	 * 
	 */

	
	@Test
	public void runner() {
		
		String[][] meetingTimes = {{"09 00", "09 30"},{"12 00", "12 10"},{"13 30", "13 50"},{"10 40", "11 40"}};;
		System.out.println(meetingRoom(meetingTimes));
		
	}
	
	@Test
	public void runner2() {
		
		String[][] meetingTimes = {{"09 00", "09 45"},{"09 30", "10 30"},  {"10 40", "12 00"},{"11 00", "13 00"},  {"11 45", "14 00"},{"16 00", "17 00"}};
		System.out.println(meetingRoom(meetingTimes));
		
	}

	
	@Test
	public void runner3() {
		
		String[][] meetingTimes = {{"09 00", "09 30"},{"11 00", "11 10"},{"10 30", "11 00"},{"10 40", "11 40"}};
		System.out.println(meetingRoom(meetingTimes));
		
	}


	private int meetingRoom(String[][] meetingTimes) {
		
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		
		List<Integer> time = new ArrayList<Integer>();
		
		
		for(int i=0;i<meetingTimes.length;i++) {
			
			String[] meet = meetingTimes[i];
			
			for(int j=0;j<meet.length-1;j++) {
				
				
				time.add(Integer.parseInt(meet[j].replace(" ", "")));
				time.add(Integer.parseInt(meet[j+1].replace(" ", "")));
				
			}
		}
		
		System.out.println(time);
		
		int meetingRooms=1;
		
		
		for(int i=1;i<time.size()-1;i=i+2) {
			
			if(time.get(i)>time.get(i+1)) {
				meetingRooms++;
			}
			
		}
	
		if(meetingRooms>1)
			return meetingRooms-1;
		else
			return meetingRooms;
	}
}
