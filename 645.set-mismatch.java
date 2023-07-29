/*
 * @lc app=leetcode id=645 lang=java
 *
 * [645] Set Mismatch
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] findErrorNums(int[] nums) {
        // Approach 1...

        /**
         * Set<Integer> set = new HashSet<>();
         * int length = nums.length, duplicate = -1, missing = -1;
         * for (int i = 0; i < length; i++) {
         * int integer = nums[i];
         * 
         * if (set.contains(integer)) {
         * duplicate = integer;
         * }
         * 
         * set.add(integer);
         * }
         * 
         * for (int i = 1; i <= length; i++) {
         * if (!set.contains(i)) {
         * missing = i;
         * break;
         * }
         * }
         * 
         * return new int[] { duplicate, missing };
         */

        // Approach 2...

        int length = nums.length, duplicate = -1, missing = -1;

        for (int i = 0; i < length; i++) {
            int integer = nums[i];
            int index = Math.abs(integer) - 1;

            if (nums[index] < 0) {
                duplicate = Math.abs(integer);
            } else {
                nums[index] = nums[index] * -1;
            }
        }

        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        return new int[] { duplicate, missing };
    }
}
// @lc code=end
