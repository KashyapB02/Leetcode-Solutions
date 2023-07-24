/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int i = 0, j = cols - 1;
        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            }

            if (matrix[i][cols - 1] < target) {
                i++;
            } else {
                j--;
            }
        }

        return false;
    }
}
// @lc code=end
