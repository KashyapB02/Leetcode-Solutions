/*
 * @lc app=leetcode id=2114 lang=java
 *
 * [2114] Maximum Number of Words Found in Sentences
 */

// @lc code=start
class Solution {
    public int mostWordsFound(String[] sentences) {
        int result = 0;
        for (String s : sentences) {
            String[] splitList = s.split(" ");
            result = Math.max(result, splitList.length);
        }

        return result;
    }
}
// @lc code=end
