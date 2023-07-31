/*
 * @lc app=leetcode id=2433 lang=java
 *
 * [2433] Find The Original Array of Prefix Xor
 */

// @lc code=start
class Solution {
    public int[] findArray(int[] pref) {
        int prefLen = pref.length;
        int[] original = new int[prefLen];

        original[0] = pref[0];
        for (int i = 1; i < prefLen; i++) {
            original[i] = pref[i] ^ pref[i - 1];
        }

        return original;
    }
}
// @lc code=end
