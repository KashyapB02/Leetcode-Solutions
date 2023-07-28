/*
 * @lc app=leetcode id=2103 lang=java
 *
 * [2103] Rings and Rods
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int countPoints(String rings) {
        // Approach 1...
        /**
         * Map<Character, Set<Character>> hashMap = new HashMap<>();
         * Set<Character> blacklistedRods = new HashSet<>();
         * 
         * int ringsLength = rings.length(), count = 0;
         * for (int i = 0; i < ringsLength; i += 2) {
         * char ring = rings.charAt(i);
         * char rod = rings.charAt(i + 1);
         * 
         * if (!hashMap.containsKey(rod)) {
         * Set<Character> ringsSet = new HashSet<>();
         * 
         * ringsSet.add(ring);
         * hashMap.put(rod, ringsSet);
         * 
         * } else {
         * Set<Character> ringsSet = new HashSet<>();
         * ringsSet = hashMap.get(rod);
         * ringsSet.add(ring);
         * 
         * hashMap.remove(rod);
         * hashMap.put(rod, ringsSet);
         * 
         * if (hashMap.get(rod).size() == 3 && !blacklistedRods.contains(rod)) {
         * count++;
         * blacklistedRods.add(rod);
         * }
         * }
         * }
         * 
         * return count;
         */

        int[][] arr = new int[10][3];

        for (int i = 0; i < rings.length(); i += 2) {
            char ring = rings.charAt(i);
            int rod = (int) rings.charAt(i + 1) - 48;

            if (ring == 'R') {
                arr[rod][0] = 1;
                continue;
            }

            if (ring == 'G') {
                arr[rod][1] = 1;
                continue;
            }

            if (ring == 'B') {
                arr[rod][2] = 1;
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 1 && arr[i][1] == 1 && arr[i][2] == 1) {
                count++;
            }
        }

        return count;
    }
}
// @lc code=end
