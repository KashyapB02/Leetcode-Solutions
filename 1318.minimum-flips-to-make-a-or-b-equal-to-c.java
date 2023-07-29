/*
 * @lc app=leetcode id=1318 lang=java
 *
 * [1318] Minimum Flips to Make a OR b Equal to c
 */

// @lc code=start
class Solution {
    public int minFlips(int a, int b, int c) {
        // Approach 1...

        /**
         * int maximum = Math.max(Math.max(a, b), c);
         * int count = 0;
         * 
         * while (maximum != 0) {
         * int value = (a & 1) | (b & 1);
         * int goal = c & 1;
         * int result = value ^ goal;
         * 
         * if (result != 0) {
         * if (goal == 1) {
         * count++;
         * } else {
         * int bitA = a & 1;
         * int bitB = b & 1;
         * 
         * if (bitA == 1 && bitB == 1) {
         * count += 2;
         * } else {
         * count++;
         * }
         * }
         * }
         * 
         * maximum = maximum >> 1;
         * a = a >> 1;
         * b = b >> 1;
         * c = c >> 1;
         * }
         * 
         * return count;
         */

        // Approach 2...

        int flips = 0;
        while (a > 0 || b > 0 || c > 0) {
            int bitA = a & 1;
            int bitB = b & 1;
            int bitC = c & 1;

            if (bitC == 0) {
                flips += (bitA + bitB);
            } else {
                if (bitA == 0 && bitB == 0) {
                    flips++;
                }
            }

            a >>= 1;
            b >>= 1;
            c >>= 1;
        }

        return flips;
    }
}
// @lc code=end
