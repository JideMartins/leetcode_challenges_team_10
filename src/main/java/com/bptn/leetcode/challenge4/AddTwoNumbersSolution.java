package com.bptn.leetcode.challenge4;

class AddTwoNumbersSolution {
    
	public ListNode addTwoNumbers(ListNode first, ListNode second) {
        // Create a node to store result 
        ListNode result = new ListNode(0);
        // Pointer to traverse and build the result linked list
        ListNode current = result;
        // Variable to store the carry-over during addition
        int carryOver = 0;
        
        while (first != null || second != null || carryOver != 0) {
            // Start with the current carry-over
            int totalSum = carryOver;
            
            // Add nodes value to the sum
            if (first != null) {
                totalSum += first.val;
                first = first.next; // Move to the next node 
            }
            
            // Add nodes value to the sum
            if (second != null) {
                totalSum += second.val;
                second = second.next; // Move to the next node
            }
            
            // Create a new node with the digit 
            current.next = new ListNode(totalSum % 10);
            
            // Update carryOver
            carryOver = totalSum / 10;
            
            // Move pointer to the next node 
            current = current.next;
        }
        
        // Return the result linked list starting from the first node 
        return result.next;
    }
}
