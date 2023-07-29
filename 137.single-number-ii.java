/*
 * @lc app=leetcode id=137 lang=java
 *
 * [137] Single Number II
 */

// @lc code=start

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class Solution {
    public int singleNumber(int[] nums) {
        // Approach 1...

        /*
         * Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
         * 
         * int numsLength = nums.length;
         * 
         * for (int i = 0; i < numsLength; i++) {
         * int number = nums[i];
         * 
         * if (!hashMap.containsKey(number)) {
         * hashMap.put(number, 1);
         * } else {
         * int currentFrequency = hashMap.get(number);
         * hashMap.remove(number);
         * 
         * hashMap.put(number, currentFrequency + 1);
         * }
         * }
         * 
         * Iterator<Integer> iterator = hashMap.keySet().iterator();
         * 
         * while (iterator.hasNext()) {
         * int key = iterator.next();
         * if (hashMap.get(key) == 1) {
         * return key;
         * }
         * }
         * 
         * return -1;
         */

        // Approach 2...

        int length = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < length - 1; i += 3) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[length - 1];
    }
}
// @lc code=end
