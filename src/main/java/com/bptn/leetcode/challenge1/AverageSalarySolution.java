package com.bptn.leetcode.challenge1;

public class AverageSalarySolution {
	
	public double average(int[] salary) {
		int max = salary[0];
		int min = salary[0];
		int sum = salary[0];
		
		for(int i=1; i<salary.length; i++) { // filters through the array to add 
			
			if (max<salary[i]) { //checks for max salary by filtering through each element in the array, replacing current max when finding an element of higher value 
				max = salary[i];
			}
			
			if (min>salary[i]) { //checks for minimum salary by filtering through each element in the array, replacing current minimum when finding an element of lower value 
				min = salary[i]; 
			}
			
			sum = sum + salary[i]; // adds up all salaries when filtering through array
		}
	
		sum = sum - min - max; // removes maximum and minimum salary from overall sum of all salaries added 
	
		double avg = sum / (salary.length-2); // shrinks the list by 2 to remove max and minimum salary when calculating average
		return avg;
	}
 }
