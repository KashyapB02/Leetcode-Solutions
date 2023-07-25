/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Approach 1...

        /**
         * Arrays.sort(nums);
         * 
         * for (int i = 1; i < nums.length; i++) {
         * if (nums[i] == nums[i - 1]) {
         * return true;
         * }
         * }
         * 
         * return false;
         */

        // Approach 2...

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }
}
// @lc code=end
