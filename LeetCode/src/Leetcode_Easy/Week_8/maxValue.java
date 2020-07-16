package Leetcode_Easy.Week_8;

/**
 * @author ynz
 * create at 2020-06-16 15:46
 * @description:this is the class for
 **/

public class maxValue {
    public int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[j] = Math.max(dp[j], dp[j - 1]) + grid[i - 1][j - 1];
            }
        }

        return dp[n];
    }
}
