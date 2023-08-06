/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        Set<ListNode> refSet = new HashSet<>();

        while (head != null) {
            if (refSet.contains(head)) {
                return head;
            }

            refSet.add(head);
            head = head.next;
        }

        return null;
    }
}
// @lc code=end
