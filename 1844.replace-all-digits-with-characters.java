/*
 * @lc app=leetcode id=1844 lang=java
 *
 * [1844] Replace All Digits with Characters
 */

// @lc code=start
class Solution {
    public String replaceDigits(String s) {
        // Approach 1...

        final int __ASCII__ = 48;
        int strLen = s.length(), offset = 0;

        char[] newStr = new char[strLen];
        for (int i = 0; i < strLen; i += 2) {
            char ch = s.charAt(i);
            newStr[i] = ch;

            if (i + 1 < strLen) {
                offset = ((int) (s.charAt(i + 1)) - __ASCII__);
                newStr[i + 1] = (char) (ch + offset);
            } else {
                offset = 0;
            }
        }

        return String.valueOf(newStr);
    }
}
// @lc code=end
