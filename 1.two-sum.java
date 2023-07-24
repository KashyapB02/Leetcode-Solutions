/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];

            if (hashMap.containsKey(x)) {
                return new int[] { hashMap.get(x), i };
            }

            hashMap.put(nums[i], i);
        }

        return null;
    }
}
// @lc code=end
