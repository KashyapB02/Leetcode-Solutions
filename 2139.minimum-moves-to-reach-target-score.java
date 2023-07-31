/*
 * @lc app=leetcode id=2139 lang=java
 *
 * [2139] Minimum Moves to Reach Target Score
 */

// @lc code=start
class Solution {
    public int minMoves(int target, int maxDoubles) {
        int steps = -1;

        while (target > 1 && maxDoubles > 0) {
            int lsb = target & 1;

            if (lsb == 1) {
                target--;
            } else {
                target >>= 1;
                maxDoubles--;
            }

            steps++;
        }

        return steps + target;
    }
}
// @lc code=end
