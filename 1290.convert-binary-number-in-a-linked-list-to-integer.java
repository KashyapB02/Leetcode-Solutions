/*
 * @lc app=leetcode id=1290 lang=java
 *
 * [1290] Convert Binary Number in a Linked List to Integer
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
    public int getDecimalValue(ListNode head) {

        // Approach 1...
        /*
         * // Base case: If there is only one value in LL...
         * if (head.next == null) {
         * return head.val;
         * }
         * 
         * ListNode previous = null, current = head;
         * 
         * // Reverse the LL...
         * while (current != null) {
         * ListNode nextNode = current.next;
         * 
         * current.next = previous;
         * previous = current;
         * current = nextNode;
         * }
         * 
         * int powerOfTwo = 1, answer = 0;
         * 
         * // Add the place-value of binary digits to answer...
         * while (previous != null) {
         * answer += previous.val * powerOfTwo;
         * 
         * // Multiply current powerOfTwo by 2 to get next powerOfTwo...
         * powerOfTwo <<= 1;
         * 
         * previous = previous.next;
         * }
         * 
         * return answer;
         */

        // Approach 2...
        int answer = 0;
        while (head != null) {
            answer = (answer <<= 1) + head.val;
            head = head.next;
        }

        return answer;
    }
}
// @lc code=end
