package seconday.second;


import java.util.Arrays;

import org.junit.Test;

public class Mergetwoarrays {


	/*Problem Statement:
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void squarePos() {

		int nums1[]  = {7,8,9};
		int nums2[]  = {2,3,4};
		merge(nums1,nums2);

	}

	//@Test
	public void squareEdge() {

		int nums[]  = {-4,-1,0,3,10};


	}

	//@Test
	public void squareNeg() {


	}

	/*
	 * 2,3,4
	 * 4,5,6
	 * 
	 * 
	 */


	public void merge(int nums1[],int nums2[]) {


		int left =0, right = 0 ;

		int[] nums3 = new int[nums1.length+nums2.length];

		int index=0;

		//for(int i=0;i<nums1.length;i++) {


		while (left < nums1.length || right < nums2.length) {

			if(left==nums1.length) {
				nums3[index++]=nums2[right++];
			}else if(right==nums2.length) {
				nums3[index++]=nums1[left++];
			}else if (nums1[left] <= nums2[right]) {
				nums3[index++] = nums1[left++];
			} else if (nums1[left] >= nums2[right]) {
				nums3[index++] = nums2[right++];
			}

		}


		System.out.println(Arrays.toString(nums3));

	}





}



