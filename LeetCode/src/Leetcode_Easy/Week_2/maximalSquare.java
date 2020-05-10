package Leetcode_Easy.Week_2;

/**
 * @author ynz
 * create at 2020-05-08 00:04
 * @description:this is the class for
 * 在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
 *
 * 示例:
 *
 * 输入:
 *
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 *
 * 输出: 4
 **/

public class maximalSquare {
    public int maximalSquare(char[][] matrix) {
        int len=0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return len;
        }
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] dp=new int[n][m];
        if(m==0||n==0){
            return 0;
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m ; j++) {
                if(matrix[i][j]=='1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i - 1][j - 1]), dp[i][j - 1]) + 1;
                    }
                    len = Math.max(len, dp[i][j]);
                }
            }

        }
        return len*len;
    }
}
