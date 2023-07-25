/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();

        if (intervals.length == 0 || intervals == null) {
            return result.toArray(new int[0][]);
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int[] i : intervals) {
            if (end >= i[0]) {
                end = Math.max(end, i[1]);
            } else {
                result.add(new int[] { start, end });
                start = i[0];
                end = i[1];
            }
        }

        result.add(new int[] { start, end });
        return result.toArray(new int[0][]);
    }
}
// @lc code=end
