/*
 * @lc app=leetcode id=2487 lang=java
 *
 * [2487] Remove Nodes From Linked List
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
    public ListNode removeNodes(ListNode head) {
        ListNode reversedNode = reverseList(head);

        int maxVal = reversedNode.val;
        ListNode previousHeadNode = null, previousTailNode = null;

        while (reversedNode != null) {
            if (reversedNode.val < maxVal) {
                previousTailNode.next = reversedNode.next;
                reversedNode = reversedNode.next;
            } else {
                maxVal = reversedNode.val;

                if (previousHeadNode == null) {
                    previousHeadNode = previousTailNode = reversedNode;
                } else {
                    previousTailNode.next = reversedNode;
                    previousTailNode = reversedNode;
                }

                reversedNode = reversedNode.next;
            }
        }

        if (previousTailNode != null) {
            previousTailNode.next = null;
        }

        return reverseList(previousHeadNode);
    }

    private ListNode reverseList(ListNode head) {
        ListNode previous = null, current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
// @lc code=end
