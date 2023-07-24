/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int low = 1, high = Integer.MAX_VALUE;

        while (true) {
            int mid = low + (high - low) / 2;

            if (mid > (x / mid)) {
                high = mid - 1;
            } else {
                if ((mid + 1) > (x / (mid + 1))) {
                    return mid;
                }

                low = mid + 1;
            }
        }
    }
}
// @lc code=end
