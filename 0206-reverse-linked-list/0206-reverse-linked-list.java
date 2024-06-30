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
        
        // Base case: if the list is empty or has only one node, return the head
        if (head == null || head.next == null) return head;
        
        // Recursively reverse the rest of the list starting from the second node
        ListNode newHead = reverseList(head.next);
        
        // Set the next node's next pointer to the current node
        head.next.next = head;
        
        // Set the current node's next pointer to null
        head.next = null;
        
        // Return the new head of the reversed list
        return newHead;
    }
}