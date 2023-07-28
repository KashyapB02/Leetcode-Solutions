/*
 * @lc app=leetcode id=1903 lang=java
 *
 * [1903] Largest Odd Number in String
 */

// @lc code=start
class Solution {
    public String largestOddNumber(String num) {
        // Approach 1...

        /*
         * int numLength = num.length();
         * StringBuilder maxNumber = new StringBuilder("");
         * StringBuilder currentNumber = new StringBuilder();
         * 
         * for (int i = 0; i < numLength; i++) {
         * int n = Integer.parseInt(String.valueOf(num.charAt(i)));
         * currentNumber.append(String.valueOf(n));
         * 
         * if (n % 2 != 0) {
         * maxNumber.append(currentNumber);
         * currentNumber.setLength(0);
         * }
         * }
         * 
         * return maxNumber.toString();
         */

        // Approach 2...

        /*
         * int j = num.length() - 1;
         * while (j >= 0) {
         * int n = Integer.parseInt(String.valueOf(num.charAt(j)));
         * 
         * if (n % 2 != 0) {
         * break;
         * }
         * 
         * j--;
         * }
         * 
         * StringBuilder answer = new StringBuilder("");
         * int i = 0;
         * 
         * while (i <= j) {
         * answer.append(num.charAt(i++));
         * }
         * 
         * return answer.toString();
         */

        // Approach 3...

        int j = num.length() - 1;
        while (j >= 0) {
            if (num.charAt(j) % 2 != 0) {
                return num.substring(0, j + 1);
            }

            j--;
        }

        return "";
    }
}
// @lc code=end
