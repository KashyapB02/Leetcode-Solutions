/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode faster = head;
        ListNode slower = head;

        while (faster.next != null && faster.next.next != null) {
            slower = slower.next;
            faster = faster.next.next;
        }

        slower.next = reverseLinkedList(slower.next);
        slower = slower.next;

        while (slower != null) {
            if (head.val != slower.val) {
                return false;
            }

            head = head.next;
            slower = slower.next;
        }

        return true;
    }

    private ListNode reverseLinkedList(ListNode current) {
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
// @lc code=end
