/*
 * @lc app=leetcode id=1614 lang=java
 *
 * [1614] Maximum Nesting Depth of the Parentheses
 */

// @lc code=start

class Solution {
    public int maxDepth(String s) {
        int length = s.length();
        int maximumDepth = 0, depth = 0;

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                depth++;
            } else if (ch == ')') {
                maximumDepth = Math.max(maximumDepth, depth);
                depth--;
            }
        }

        return maximumDepth;
    }
}
// @lc code=end
