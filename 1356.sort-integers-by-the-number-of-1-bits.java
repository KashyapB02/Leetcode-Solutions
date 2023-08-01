/*
 * @lc app=leetcode id=1356 lang=java
 *
 * [1356] Sort Integers by The Number of 1 Bits
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    // Approach 1...
    /**
     * public int[] sortByBits(int[] arr) {
     * insertionSort(arr);
     * return arr;
     * }
     * 
     * private void insertionSort(int[] arr) {
     * int length = arr.length;
     * 
     * for (int i = 1; i < length; i++) {
     * for (int j = i; j > 0; j-- ) {
     * int bitsOfA = bitsCount(arr[j]);
     * int bitsOfB = bitsCount(arr[j - 1]);
     * 
     * if (bitsOfA < bitsOfB) {
     * swap(arr, j, (j - 1));
     * } else if (bitsOfA == bitsOfB) {
     * if (arr[j] < arr[j - 1]) {
     * swap(arr, j, (j - 1));
     * }
     * } else {
     * break;
     * }
     * }
     * }
     * }
     * 
     * private int bitsCount(int n) {
     * int count = 0;
     * 
     * while (n > 0) {
     * count += n & 1;
     * n >>= 1;
     * }
     * 
     * return count;
     * }
     * 
     * private void swap(int[] arr, int i, int j) {
     * int tempHold = arr[i];
     * arr[i] = arr[j];
     * arr[j] = tempHold;
     * }
     */

    // Approach 2...
    public int[] sortByBits(int[] arr) {
        int[][] newArr = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            newArr[i][0] = arr[i];
            newArr[i][1] = Integer.bitCount(arr[i]);
        }

        Arrays.sort(newArr, (a, b) -> (a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr[i][0];
        }

        return arr;
    }
}
// @lc code=end
