/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
public ListNode reverseList(ListNode head) {
        
        // Base case: if the list is empty or has only one node, return the head as it is
        if (head == null || head.next == null) return head;
        
        // Initialize two pointers, previous (prev) and current (curr)
        ListNode prev = null; // Initially, prev is set to null
        ListNode curr = head; // curr is set to the head of the list
        
        // Iterate through the list until curr becomes null
        while (curr != null) {
            // Temporarily store the next node
            ListNode nextTemp = curr.next;
            
            // Reverse the current node's pointer to point to the previous node
            curr.next = prev;
            
            // Move the previous pointer one step forward to the current node
            prev = curr;
            
            // Move the current pointer one step forward to the next node
            curr = nextTemp;
        }
        
        // At the end of the loop, prev will be pointing to the new head of the reversed list
        return prev;
    }
}