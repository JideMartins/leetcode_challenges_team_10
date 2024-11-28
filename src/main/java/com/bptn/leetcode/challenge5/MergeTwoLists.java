package com.bptn.leetcode.challenge5;

/**
 * Main class for testing
 */
public class MergeTwoLists {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Create ListNode objects for list1
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Create ListNode objects for list2
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // Merge the lists
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Print the merged list
        System.out.print("Merged List: ");
        while (mergedList != null) {
            System.out.print(mergedList.val + " -> ");
            mergedList = mergedList.next;
        }
        System.out.println("NULL");

        // Other test cases
        // Test case 2: Both lists are empty
        // ListNode list1 = null;
        // ListNode list2 = null;
        // ListNode mergedList = solution.mergeTwoLists(list1, list2);
        // System.out.println("Merged List (Case 1): " + mergedList); // Should print "null"

        // Test case 3: One list is empty, the other has one element
        // list1 = null;
        // list2 = new ListNode(0);
        // mergedList = solution.mergeTwoLists(list1, list2);
        // System.out.println("Merged List (Case 2): ");
        // while (mergedList != null) {
        //     System.out.print(mergedList.val + " -> ");
        //     mergedList = mergedList.next;
        // }
        // System.out.println("NULL"); // Should print "0 -> NULL"

    }
}
