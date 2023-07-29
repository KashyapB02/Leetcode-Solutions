/*
 * @lc app=leetcode id=2220 lang=java
 *
 * [2220] Minimum Bit Flips to Convert Number
 */

// @lc code=start
class Solution {
    public int minBitFlips(int start, int goal) {
        int maximum = Math.max(start, goal);
        int count = 0;

        while (maximum != 0) {
            int startBit = start & 1;
            int goalBit = goal & 1;

            count += startBit ^ goalBit;

            start = start >> 1;
            goal = goal >> 1;
            maximum = maximum >> 1;
        }

        return count;
    }
}
// @lc code=end
