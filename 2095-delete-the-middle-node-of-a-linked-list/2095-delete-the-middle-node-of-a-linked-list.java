class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // Create a new dummy node that points to the head of the list.
        // This dummy node helps in handling edge cases more easily, especially when the list has only one element.
        ListNode newNode = new ListNode(0, head);
        
        // Initialize two pointers, slow and fast, both starting from the dummy node.
        ListNode slow = newNode;
        ListNode fast = newNode;
        
        // Use the two-pointer technique to find the middle of the list.
        // The fast pointer moves twice as fast as the slow pointer.
        // When the fast pointer reaches the end, the slow pointer will be at the node just before the middle node.
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // At this point, slow is pointing to the node just before the middle node.
        // Delete the middle node by skipping it.
        slow.next = slow.next.next;
        
        // Return the modified list, starting from the original head.
        // The dummy node's next pointer points to the modified list's head.
        return newNode.next;
    }
}
