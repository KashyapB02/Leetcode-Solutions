/*
 * @lc app=leetcode id=2595 lang=java
 *
 * [2595] Number of Even and Odd Bits
 */

// @lc code=start
class Solution {
    public int[] evenOddBit(int n) {
        int evenCount = 0, oddCount = 0;
        boolean evenItr = true;

        while (n > 0) {
            int lsb = n & 1;

            if (lsb == 1) {
                if (evenItr) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            evenItr = !evenItr;
            n >>= 1;
        }

        return new int[] { evenCount, oddCount };
    }
}
// @lc code=end
