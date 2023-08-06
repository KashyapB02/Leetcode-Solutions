/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        Set<ListNode> refSet = new HashSet<>();

        while (head != null) {
            ListNode next = head.next;
            if (refSet.contains(next)) {
                return true;
            }

            refSet.add(next);
            head = head.next;
        }

        return false;
    }
}
// @lc code=end
