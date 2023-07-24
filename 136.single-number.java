/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start

import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new LinkedHashSet<Integer>();
        int setSum = 0, arraySum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                setSum += nums[i];
                set.add(nums[i]);
            }

            arraySum += nums[i];
        }

        return (2 * setSum) - arraySum;
    }
}
// @lc code=end
