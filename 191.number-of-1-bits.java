/*
 * @lc app=leetcode id=191 lang=java
 *
 * [191] Number of 1 Bits
 */

// @lc code=start
class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // Approach 1...
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >>> 1;
        }

        return count;

        // Approach 2...
        /**
         * int count = 0, comparator = 1;
         * 
         * for (int i = 0; i < 32; i++) {
         * if ((comparator & n) != 0) {
         * count++;
         * }
         * 
         * comparator = comparator << 1;
         * }
         * 
         * return count;
         */
    }
}
// @lc code=end
