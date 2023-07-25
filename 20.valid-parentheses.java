/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    return false;
                }

                char top = stack.peek();

                if (top == '(' && ch == ')') {
                    stack.pop();
                } else if (top == '{' && ch == '}') {
                    stack.pop();
                } else if (top == '[' && ch == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (stack.empty()) {
            return true;
        }

        return false;
    }
}
// @lc code=end
