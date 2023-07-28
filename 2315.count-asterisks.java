/*
 * @lc app=leetcode id=2315 lang=java
 *
 * [2315] Count Asterisks
 */

// @lc code=start
class Solution {
    public int countAsterisks(String s) {
        boolean foundPair = true;
        int countAsterisks = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '*' && foundPair == true) {
                countAsterisks++;
            } else if (ch == '|') {
                foundPair = !foundPair;
            }
        }

        return countAsterisks;
    }
}
// @lc code=end
