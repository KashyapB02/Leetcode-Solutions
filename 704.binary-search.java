/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int binarySearch(int[] arr, int target, int l, int h) {
        if (l > h) {
            return -1;
        }

        int mid = l + (h - l) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return binarySearch(arr, target, (mid + 1), h);
        }

        return binarySearch(arr, target, l, (mid - 1));
    }

    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }
}
// @lc code=end
