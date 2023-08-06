/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headNode = null, tailNode = null;
        int carry = 0;

        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;

            int value = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(value);
            if (headNode == null) {
                headNode = tailNode = newNode;
            } else {
                tailNode.next = newNode;
                tailNode = newNode;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int sum = l1.val + carry;

            int value = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(value);
            tailNode.next = newNode;
            tailNode = newNode;

            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = l2.val + carry;

            int value = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(value);
            tailNode.next = newNode;
            tailNode = newNode;

            l2 = l2.next;
        }

        if (carry == 1) {
            ListNode newNode = new ListNode(1);
            tailNode.next = newNode;
            tailNode = newNode;
        }

        return headNode;
    }
}
// @lc code=end
