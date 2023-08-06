/*
 * @lc app=leetcode id=143 lang=java
 *
 * [143] Reorder List
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
    public void reorderList(ListNode head) {
        // Approach 1...
        /**
         * ListNode slowPointer = head;
         * ListNode fastPointer = head;
         * 
         * while (fastPointer.next != null && fastPointer.next.next != null) {
         * slowPointer = slowPointer.next;
         * fastPointer = fastPointer.next.next;
         * }
         * 
         * ListNode previousNode = null;
         * ListNode currentNode = slowPointer.next;
         * 
         * while (currentNode != null) {
         * ListNode nextNode = currentNode.next;
         * currentNode.next = previousNode;
         * previousNode = currentNode;
         * currentNode = nextNode;
         * }
         * 
         * slowPointer.next = null;
         * 
         * ListNode reverseHead = previousNode;
         * ListNode headNode = head;
         * 
         * while (headNode != null && reverseHead != null) {
         * ListNode nextHeadNode = headNode.next;
         * ListNode nextReverseNode = reverseHead.next;
         * 
         * headNode.next = reverseHead;
         * reverseHead.next = nextHeadNode;
         * 
         * headNode = nextHeadNode;
         * reverseHead = nextReverseNode;
         * }
         */

        // Approach 2... using stack
        Stack<ListNode> stack = new Stack<>();
        ListNode headNode = head;

        while (headNode != null) {
            stack.push(headNode);
            headNode = headNode.next;
        }

        headNode = head;
        int halfSize = stack.size() / 2;

        for (int i = 0; i < halfSize; i++) {
            ListNode nextNode = headNode.next;
            ListNode topNode = stack.pop();

            headNode.next = topNode;
            topNode.next = nextNode;
            headNode = nextNode;
        }

        headNode.next = null;
    }
}
// @lc code=end
