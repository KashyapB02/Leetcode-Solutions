/*
 * @lc app=leetcode id=2351 lang=java
 *
 * [2351] First Letter to Appear Twice
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> charSet = new HashSet<>();
        int strLen = s.length();

        for (int i = 0; i < strLen; i++) {
            char letter = s.charAt(i);

            if (charSet.contains(letter)) {
                return letter;
            } else {
                charSet.add(letter);
            }
        }

        return ' ';
    }
}
// @lc code=end
