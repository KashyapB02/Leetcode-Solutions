/*
 * @lc app=leetcode id=1720 lang=java
 *
 * [1720] Decode XORed Array
 */

// @lc code=start
class Solution {
    public int[] decode(int[] encoded, int first) {
        int encodedLength = encoded.length;
        int[] decoded = new int[encodedLength + 1];

        decoded[0] = first;

        for (int i = 0; i < encodedLength; i++) {
            int decodedElement = encoded[i] ^ decoded[i];
            decoded[i + 1] = decodedElement;
        }

        return decoded;
    }
}
// @lc code=end
