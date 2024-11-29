package com.bptn.leetcode.challenge5;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // temporary dummy node to act as the head of the merged list
        ListNode tempNode = new ListNode(0);

        //pointer for tracking the current position of the merged list
        ListNode currentNode = tempNode;

        //traverse through both list while they aren't exhausted
        while (list1 != null && list2 != null) {
            
            /*
             * Compare values of the current nodes of both lists
             * if list1's value is smaller, append list1's node to the merged list
             * then move to the next node in list1
             */
            if (list1.val < list2.val){
                currentNode.next = list1;
                list1 = list1.next;


                /*
                 * Else statement for if list2's value is smaller or equal
                 * append list2's node to the merged list
                 * Move to the next node in list2
                 */
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }

            // Move the pointer in the merged list forward
            currentNode = currentNode.next;
        }

        // if list1 isn't exhasuted, append remaining nodes to the merged list
        if (list1 != null){
            currentNode.next =  list1;
            list1 = list1.next;
        }

        // If list2 is not yet exhausted, append the remaining nodes to the merged list
        if (list2 != null){
            currentNode.next =  list2;
            list2 = list2.next;
        }

        // Return the merged list, starting from the node after the temporary dummy node
        return tempNode.next;
        
    }

}
