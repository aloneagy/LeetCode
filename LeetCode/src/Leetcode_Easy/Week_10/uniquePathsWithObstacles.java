package Leetcode_Easy.Week_10;

/**
 * @author ynz
 * create at 2020-07-06 02:08
 * @description:this is the class for
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 *
 *
 *
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 *
 * 说明：m 和 n 的值均不超过 100。
 *
 * 示例 1:
 *
 * 输入:
 * [
 *   [0,0,0],
 *   [0,1,0],
 *   [0,0,0]
 * ]
 * 输出: 2
 * 解释:
 * 3x3 网格的正中间有一个障碍物。
 * 从左上角到右下角一共有 2 条不同的路径：
 * 1. 向右 -> 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右 -> 向右
 **/

public class uniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1){
            return 0;
        }
        int h=obstacleGrid.length;
        int l=obstacleGrid[0].length;
        int[][] dp=new int[h][l];
        dp[0][0]=1;
        for (int i = 0; i <h ; i++) {
            for (int j = 0; j < l; j++) {
                if(i==0&&j==0){
                    continue;
                }
                if(i-1>=0&&obstacleGrid[i-1][j]==0){
                    dp[i][j]+=dp[i-1][j];
                }
                if(j-1>=0&&obstacleGrid[i][j-1]==0){
                    dp[i][j]+=dp[i][j-1];
                }
            }
        }
        return dp[h-1][l-1];
    }
}
