/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        // Approach 1...(Iterative)
        /**
         * if (head == null || head.next == null) {
         * return head;
         * }
         * 
         * ListNode previous = null, current = head;
         * 
         * while (current != null) {
         * ListNode nextNode = current.next;
         * 
         * current.next = previous;
         * previous = current;
         * current = nextNode;
         * }
         * 
         * return previous;
         */

        // Approach 2... (Recursion)
        ListNode previous = null, current = head;
        return reverseLinkedList(previous, current);
    }

    private ListNode reverseLinkedList(ListNode previous, ListNode current) {
        if (current == null) {
            return previous;
        }

        ListNode nextNode = current.next;

        current.next = previous;
        previous = current;

        return reverseLinkedList(previous, nextNode);
    }
}
// @lc code=end
