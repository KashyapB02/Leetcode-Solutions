/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int area = 0;

        while (left < right) {
            int x = right - left;
            int y = Math.min(height[left], height[right]);

            area = Math.max(area, (x * y));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return area;
    }
}
// @lc code=end
