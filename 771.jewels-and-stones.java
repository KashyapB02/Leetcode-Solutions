/*
 * @lc app=leetcode id=771 lang=java
 *
 * [771] Jewels and Stones
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // Approach 1... (Brute force)

        /*
         * int stonesLength = stones.length();
         * 
         * int count = 0;
         * 
         * for (int i = 0; i < stonesLength; i++) {
         * String str = String.valueOf(stones.charAt(i));
         * 
         * if (jewels.contains(str)) {
         * count++;
         * }
         * }
         * 
         * return count;
         */

        // Approach 2... (Using Sets)
        Set<Character> jewelSet = new HashSet<>();
        int jewelsCount = jewels.length(), stonesCount = stones.length();

        for (int i = 0; i < jewelsCount; i++) {
            jewelSet.add(jewels.charAt(i));
        }

        int totalJewels = 0;
        for (int i = 0; i < stonesCount; i++) {
            char stone = stones.charAt(i);

            if (jewelSet.contains(stone)) {
                totalJewels++;
            }
        }

        return totalJewels;
    }
}
// @lc code=end
