package com.bptn.leetcode.challenge3;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		
		//Calculate the expected sum of numbers from 0 to n
		//n is the length of the array, so the range is 0 to n
		int n = nums.length; //The length of the array gives is n
		int total  =   (n * (n+1))/2; // Formula for the sum of numbers from 0 to n
		int sum  =0; //Variable to hold the sum of the numbers in the array
		int i;
		
		//Calculate sum of the numbers present in the array
		for(i=0;i< n;i++){ //For each element i in nums
			sum += nums[i]; //Add each element of the array to the sum
		}
		//The missing number is the difference between the total sum and sum
     return total-sum; //Return the missing number
	}
}
