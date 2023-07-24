/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;

        if (nums[low] <= nums[high]) {
            return nums[low];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            if (nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }

            if (nums[low] <= nums[mid]) {
                low = mid + 1;
            } else if (nums[mid] <= nums[high]) {
                high = mid - 1;
            }
        }

        return -1;
    }
}
// @lc code=end
