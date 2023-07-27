/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        // Approach 1...

        /**
         * String[] strArr = s.split(" +");
         * int j = strArr.length - 1;
         * 
         * StringBuilder answer = new StringBuilder();
         * for (; j >= 0; j--) {
         * answer.append(strArr[j] + " ");
         * }
         * 
         * return answer.toString().trim();
         */

        // Approach 2...

        int strLen = s.length();
        int i = 0, j;

        String answer = "", word = "";

        while (i < strLen) {
            while (i < strLen && s.charAt(i) == ' ') {
                i++;
            }

            j = i;
            while (j < strLen && s.charAt(j) != ' ') {
                word = word + s.charAt(j);
                j++;
            }

            if (answer.length() == 0) {
                answer = word;
            } else if (word.length() != 0) {
                answer = word + " " + answer;
            }

            word = "";
            i = j + 1;
        }

        return answer;
    }
}
// @lc code=end
