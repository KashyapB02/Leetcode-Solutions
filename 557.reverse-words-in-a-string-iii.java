/*
 * @lc app=leetcode id=557 lang=java
 *
 * [557] Reverse Words in a String III
 */

// @lc code=start

class Solution {
    void reverse(char[] arr, int start, int end) {
        while (start <= end) {
            char tempHold = arr[start];
            arr[start] = arr[end];
            arr[end] = tempHold;

            start++;
            end--;
        }
    }

    public String reverseWords(String s) {
        // Approach 1...

        /**
         * String[] words = s.split(" ");
         * 
         * StringBuilder builderWords = new StringBuilder();
         * StringBuilder ans = new StringBuilder();
         * 
         * for (int i = 0; i < words.length; i++) {
         * builderWords.append(words[i]);
         * String reversedWord = (builderWords.reverse().toString() + " ");
         * 
         * ans.append(reversedWord);
         * builderWords.setLength(0);
         * }
         * 
         * return ans.toString().trim();
         */

        // Approach 2...

        char[] arr = s.toCharArray();

        int arrLen = arr.length;
        int start = 0;

        for (int end = 0; end <= arrLen; end++) {
            if (end == arrLen || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }

        return new String(arr);
    }
}
// @lc code=end
