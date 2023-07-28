/*
 * @lc app=leetcode id=1880 lang=java
 *
 * [1880] Check if Word Equals Summation of Two Words
 */

// @lc code=start
class Solution {
    long getNumberFromString(String s) {
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char value = (char) (s.charAt(i) - '1');
            number.append(value);
        }

        return Long.parseLong(number.toString());
    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        long firstNumber = getNumberFromString(firstWord);
        long secondNumber = getNumberFromString(secondWord);
        long targetNumber = getNumberFromString(targetWord);

        return firstNumber + secondNumber == targetNumber;
    }
}
// @lc code=end
