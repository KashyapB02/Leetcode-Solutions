/*
 * @lc app=leetcode id=876 lang=java
 *
 * [876] Middle of the Linked List
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
    public ListNode middleNode(ListNode head) {
        // Approach 1...
        /**
         * int size = 0;
         * ListNode tempHead = head;
         * 
         * while (tempHead != null) {
         * size++;
         * tempHead = tempHead.next;
         * }
         * 
         * size += 2;
         * int middleNode = (size >>= 1) - 1;
         * while (head != null && middleNode > 0) {
         * head = head.next;
         * middleNode--;
         * }
         * 
         * return head;
         */

        // Approach 2...
        ListNode fasterNode = head, slowerNode = head;
        while (fasterNode != null && fasterNode.next != null) {
            fasterNode = fasterNode.next.next;
            slowerNode = slowerNode.next;
        }

        return slowerNode;
    }
}
// @lc code=end
