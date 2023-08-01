/*
 * @lc app=leetcode id=476 lang=java
 *
 * [476] Number Complement
 */

// @lc code=start
class Solution {
    public int findComplement(int num) {
        int xorNumber = 0, copyOfNum = num;

        while (copyOfNum > 0) {
            xorNumber <<= 1;
            xorNumber |= 1;

            copyOfNum >>= 1;
        }

        return num ^ xorNumber;
    }
}
// @lc code=end
