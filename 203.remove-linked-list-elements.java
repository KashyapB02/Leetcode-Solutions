/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
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
    public ListNode removeElements(ListNode head, int val) {
        while (head != null) {
            if (head.val == val) {
                head = head.next;
            } else {
                break;
            }
        }

        if (head == null) {
            return null;
        }

        ListNode currentHead = head;
        ListNode resultNode = head;

        while (currentHead.next != null) {
            if (currentHead.next.val == val) {
                currentHead.next = currentHead.next.next;
            } else {
                currentHead = currentHead.next;
            }
        }

        return resultNode;
    }
}
// @lc code=end
