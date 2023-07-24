/*
 * @lc app=leetcode id=832 lang=java
 *
 * [832] Flipping an Image
 */

// @lc code=start
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int outerLoopLength = image.length;

        for (int i = 0; i < outerLoopLength; i++) {
            int matrixLength = image[i].length;
            int innerLoopLength = matrixLength / 2;

            for (int j = 0; j < innerLoopLength; j++) {
                int tempHold = image[i][j];
                image[i][j] = 1 - image[i][matrixLength - 1 - j];
                image[i][matrixLength - 1 - j] = 1 - tempHold;
            }

            if (matrixLength % 2 == 1) {
                image[i][innerLoopLength] = 1 - image[i][innerLoopLength];
            }
        }

        return image;
    }
}
// @lc code=end
