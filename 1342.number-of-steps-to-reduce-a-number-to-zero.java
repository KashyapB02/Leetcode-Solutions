/*
 * @lc app=leetcode id=1342 lang=java
 *
 * [1342] Number of Steps to Reduce a Number to Zero
 */

// @lc code=start
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;

        while (num != 0) {
            int lsb = num & 1;

            if (lsb == 1) {
                num--;
            } else {
                num >>= 1;
            }

            count++;
        }

        return count;
    }
}
// @lc code=end
