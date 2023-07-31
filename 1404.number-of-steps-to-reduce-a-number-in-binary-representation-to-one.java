/*
 * @lc app=leetcode id=1404 lang=java
 *
 * [1404] Number of Steps to Reduce a Number in Binary Representation to One
 */

// @lc code=start
class Solution {
    public int numSteps(String s) {
        int strLen = s.length() - 1;
        int carry = 0, steps = 0;

        while (strLen > 0) {
            char lsb = s.charAt(strLen);

            if (lsb == '1' && carry == 0) {
                steps += 2;
                carry = 1;
            } else if (lsb == '0' && carry == 1) {
                steps += 2;
            } else {
                steps++;
            }

            strLen--;
        }

        return steps + carry;
    }
}
// @lc code=end
