/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start

import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        // Approach 1...
        /*
         * Arrays.sort(nums);
         * 
         * int frequency = 1, candidate = nums[0];
         * int length = nums.length;
         * 
         * for (int i = 1; i < length; i++) {
         * int value = nums[i];
         * 
         * if (value == candidate) {
         * frequency++;
         * } else {
         * candidate = value;
         * frequency = 1;
         * }
         * 
         * if (frequency > length / 2) {
         * return candidate;
         * }
         * }
         * 
         * return candidate;
         */

        // Approach 2...
        /*
         * if (nums.length == 1) {
         * return nums[0];
         * }
         * 
         * int length = nums.length;
         * Map<Integer, Integer> hashMap = new HashMap<>();
         * 
         * for (int i = 0; i < length; i++) {
         * int value = nums[i];
         * 
         * if (hashMap.containsKey(value) && hashMap.get(value) == length / 2) {
         * return value;
         * } else {
         * hashMap.put(value, hashMap.getOrDefault(value, 0) + 1);
         * }
         * }
         * 
         * return -1;
         */

        // Approach 3...
        /*
         * Arrays.sort(nums);
         * return nums[nums.length / 2];
         */

        // Approach 4...
        int frequency = 0, candidate = -1;
        int length = nums.length;

        for (int value : nums) {
            if (frequency == 0) {
                candidate = value;
            }

            if (value == candidate) {
                frequency++;
            } else {
                frequency--;
            }
        }

        return candidate;
    }
}
// @lc code=end
