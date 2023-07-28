/*
 * @lc app=leetcode id=1859 lang=java
 *
 * [1859] Sorting the Sentence
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String sortSentence(String s) {
        // Approach 1... (Using Arrays)

        /*
         * String[] wordsList = s.split(" ");
         * String[] arrangedWords = new String[wordsList.length];
         * 
         * for (String word : wordsList) {
         * int wordLen = word.length() - 1;
         * int index = (int) word.charAt(wordLen) - 49;
         * 
         * arrangedWords[index] = word.substring(0, wordLen);
         * }
         * 
         * StringBuilder answer = new StringBuilder();
         * for (String word : arrangedWords) {
         * answer.append(word + " ");
         * }
         * 
         * return answer.toString().trim();
         */

        // Approach 2... (Using Map...)

        Map<Integer, String> hashMap = new HashMap<>();

        int stringLength = s.length();
        int start = 0;

        for (int i = 0; i <= stringLength; i++) {
            if (i == stringLength || s.charAt(i) == ' ') {
                int index = (int) s.charAt(i - 1) - 49;
                String word = s.substring(start, (i - 1));

                hashMap.put(index, word);
                start = i + 1;
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int i : hashMap.keySet()) {
            answer.append(hashMap.get(i) + " ");
        }

        return answer.toString().trim();
    }
}
// @lc code=end
