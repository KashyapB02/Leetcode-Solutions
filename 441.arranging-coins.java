/*
 * @lc app=leetcode id=441 lang=java
 *
 * [441] Arranging Coins
 */

// @lc code=start
class Solution {
    public long naturalSum(long n) {
        return ((n * (n + 1)) / 2);
    }

    public int arrangeCoins(int n) {
        long low = 1, high = n;
        long result = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long sum = naturalSum(mid);

            if (sum == n) {
                return (int) mid;
            }

            if (sum > n) {
                high = mid - 1;
            } else {
                result = Math.max(mid, result);
                low = mid + 1;
            }
        }

        return (int) result;
    }
}
// @lc code=end
