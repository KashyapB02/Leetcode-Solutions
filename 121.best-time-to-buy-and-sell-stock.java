/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {

        // Brute force... (Time: O(n^2), Space: O(1))

        /**
         * nt profit = 0;
         * 
         * for (int i = 0; i < prices.length; i++) {
         * int currentPrice = prices[i];
         * 
         * for (int j = (i + 1); j < prices.length; j++) {
         * profit = Math.max(profit, prices[j] - currentPrice);
         * }
         * }
         * 
         * return profit;
         */

        /* -------------------------------------------- */

        // Optimization 1... (Time: O(n), Space: O(n))

        /**
         * int j = prices.length - 1, profit = 0;
         * int[] maxPrice = new int[prices.length];
         * 
         * maxPrice[j] = prices[j];
         * j--;
         * 
         * while (j >= 0) {
         * maxPrice[j] = Math.max(maxPrice[j + 1], prices[j]);
         * int currentProfit = maxPrice[j] - prices[j];
         * 
         * profit = Math.max(profit, currentProfit);
         * j--;
         * }
         * 
         * return profit;
         */

        /* -------------------------------------------- */

        // Optimization 2... (Time: O(n), Space: O(1))

        int i = 0, profit = 0;
        int minimumPrice = prices[0];

        i++;

        while (i < prices.length) {
            minimumPrice = Math.min(minimumPrice, prices[i]);
            int currentProfit = prices[i] - minimumPrice;

            profit = Math.max(profit, currentProfit);
            i++;
        }

        return profit;
    }
}
// @lc code=end
