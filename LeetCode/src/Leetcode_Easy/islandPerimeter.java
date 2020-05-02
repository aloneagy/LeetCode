package Leetcode_Easy;

/**
 * @author ynz
 * create at 2020-05-02 00:31
 * @description:this is the class for
 * 给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。
 *
 * 网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。
 *
 * 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。
 *
 *  
 *
 * 示例 :
 *
 * 输入:
 * [[0,1,0,0],
 *  [1,1,1,0],
 *  [0,1,0,0],
 *  [1,1,0,0]]
 *
 * 输出: 16
 **/

public class islandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int count=0;
        int[][] number=new int[grid.length+2][grid[0].length+2];
        for (int i = 0; i <number[0].length ; i++) {
            number[0][i]=0;
            number[number.length-1][i]=0;
        }
        for (int i = 0; i <number.length ; i++) {
            number[i][number[0].length-1]=0;
            number[i][0]=0;
        }
        for (int i = 1; i <number.length-1 ; i++) {
            for (int j = 1; j <number[0].length-1 ; j++) {
                number[i][j]=grid[i-1][j-1];
            }
        }
        for (int i = 1; i <number.length-1 ; i++) {
            for (int j = 1; j <number[0].length-1 ; j++) {
                if(number[i][j]==1){
                    if(number[i-1][j]==0) count++;
                    if(number[i][j-1]==0) count++;
                    if(number[i+1][j]==0) count++;
                    if(number[i][j+1]==0) count++;
                }
            }
        }
        return count;
    }
}
