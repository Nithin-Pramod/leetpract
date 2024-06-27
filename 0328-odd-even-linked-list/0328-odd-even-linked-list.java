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
    public ListNode oddEvenList(ListNode head) {
    // If the list is empty, return the head (null)
    if (head == null)
      return head;

    // Initialize pointers for the odd and even lists
    ListNode odd = head;       // Starting from the first node (odd index)
    ListNode even = head.next; // Starting from the second node (even index)

    // Maintain a reference to the head of the even list
    ListNode evenHead = even;

    // Traverse the list, re-linking nodes to form separate odd and even lists
    while (even != null && even.next != null) {
        // Link the current odd node to the next odd node (skipping the even node)
        odd.next = odd.next.next;
        // Move the odd pointer to the next odd node
        odd = odd.next;

        // Link the current even node to the next even node (skipping the odd node)
        even.next = even.next.next;
        // Move the even pointer to the next even node
        even = even.next;
    }

    // After the loop, link the end of the odd list to the head of the even list
    odd.next = evenHead;

    // Return the modified list, starting from the original head
    return head;
}

}