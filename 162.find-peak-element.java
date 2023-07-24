/*
 * @lc app=leetcode id=162 lang=java
 *
 * [162] Find Peak Element
 */

// @lc code=start
class Solution {
    public int recursion(int[] nums, int low, int high, int index) {
        if (low > high) {
            return index;
        }

        int mid = low + (high - low) / 2;
        if (nums[index] < nums[mid]) {
            index = mid;
        }

        index = recursion(nums, low, mid - 1, index);
        index = recursion(nums, mid + 1, high, index);

        return index;
    }

    public int findPeakElement(int[] nums) {
        int mid = (nums.length - 1) / 2;
        return recursion(nums, 0, nums.length - 1, mid);
    }
}
// @lc code=end
