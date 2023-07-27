/*
 * @lc app=leetcode id=1108 lang=java
 *
 * [1108] Defanging an IP Address
 */

// @lc code=start
class Solution {
    public String defangIPaddr(String address) {
        // Approach 1... (Using String)

        /**
         * String defangedAddress = "";
         * 
         * for (int i = 0; i < address.length(); i++) {
         * if (address.charAt(i) == '.') {
         * defangedAddress += "[.]";
         * } else {
         * defangedAddress += address.charAt(i);
         * }
         * }
         * 
         * return defangedAddress;
         */

        // Approach 2... (Using StringBuilder)
        StringBuilder defangedAddress = new StringBuilder();
        int strLen = address.length();

        for (int i = 0; i < strLen; i++) {
            char ch = address.charAt(i);

            if (ch == '.') {
                defangedAddress.append("[.]");
            } else {
                defangedAddress.append(ch);
            }
        }

        return defangedAddress.toString();

    }
}
// @lc code=end
