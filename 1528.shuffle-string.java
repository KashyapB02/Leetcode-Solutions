/*
 * @lc app=leetcode id=1528 lang=java
 *
 * [1528] Shuffle String
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String restoreString(String s, int[] indices) {
        // Approach 1...

        char[] stringList = new char[s.length()];

        for (int i = 0; i < stringList.length; i++) {
            int idx = indices[i];
            stringList[idx] = s.charAt(i);
        }

        return String.valueOf(stringList);

        // Approach 2...(Using HashMaps)

        /**
         * Map<Integer, Character> hashMap = new HashMap<>();
         * 
         * for (int i = 0; i < s.length(); i++) {
         * hashMap.put(indices[i], s.charAt(i));
         * }
         * 
         * StringBuilder stringBuilder = new StringBuilder();
         * for (int i = 0; i < hashMap.size(); i++) {
         * stringBuilder.append(hashMap.get(i));
         * }
         * 
         * return stringBuilder.toString();
         */
    }
}
// @lc code=end
