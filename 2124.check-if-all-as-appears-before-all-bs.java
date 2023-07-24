/*
 * @lc app=leetcode id=2124 lang=java
 *
 * [2124] Check if All A's Appears Before All B's
 */

// @lc code=start
class Solution {
    public boolean checkString(String s) {
        boolean foundB = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' && foundB == true) {
                return false;
            }

            if (s.charAt(i) == 'b') {
                foundB = true;
            }
        }

        return true;
    }
}
// @lc code=end
