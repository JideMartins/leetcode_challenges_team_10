package com.bptn.leetcode.challenge2;

public class SquaresOfSortedArray {
	
	  public int[] sortedSquares(int[] nums) { //Method to return a sorted array of the squares of the original array

		    int[] sortedArray = new int[nums.length]; //Initialize an array to store the sorted squares
		    int i;
		    int currentPosition;

		    // Square all elements
		    for (i = 0; i < nums.length; i++) {
		      nums[i] = nums[i] * nums[i]; //Square the number
		    }
		    
		    //Assign pointers

		    int head = 0; //Pointer at the start of the array
		    int tail = nums.length - 1; //Pointer at the end of the array

		    // Set them at right place in the result array
		    for (currentPosition = nums.length - 1; currentPosition >= 0; currentPosition--) { //starts at the last position to the first position

		      if (nums[head] > nums[tail]) { //Compares the values of head and tail
		        sortedArray[currentPosition] = nums[head]; //Leaves it at the current position
		        // Move it forward
		        head++;
		      } else {
		        sortedArray[currentPosition] = nums[tail]; //Leave it at the current position
		        // Move it backward
		        tail--;
		      }
		    }

		    return sortedArray; //Returns the squares of the sorted array
		  }

}
