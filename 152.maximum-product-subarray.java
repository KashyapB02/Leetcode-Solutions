/*
 * @lc app=leetcode id=152 lang=java
 *
 * [152] Maximum Product Subarray
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        int prefix = 1, suffix = 1, ans = Integer.MIN_VALUE;
        int totalNums = nums.length;

        for (int i = 0; i < totalNums; i++) {
            if (prefix == 0) {
                prefix = 1;
            }

            if (suffix == 0) {
                suffix = 1;
            }

            prefix *= nums[i];
            suffix *= nums[totalNums - i - 1];

            ans = Math.max(ans, Math.max(prefix, suffix));
        }

        return ans;
    }
}
// @lc code=end
