/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int olderVersion = 1, newerVersion = n;

        while (olderVersion <= newerVersion) {
            int midVersion = olderVersion + (newerVersion - olderVersion) / 2;

            boolean checkBadVersion = isBadVersion(midVersion);

            if (!checkBadVersion) {
                olderVersion = midVersion + 1;
            } else {
                newerVersion = midVersion - 1;
            }
        }

        return olderVersion;
    }

}
// @lc code=end
