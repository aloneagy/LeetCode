package Leetcode_Easy.Week_10;

/**
 * @author ynz
 * create at 2020-07-02 01:57
 * @description:this is the class for
 * 给定M×N矩阵，每一行、每一列都按升序排列，请编写代码找出某元素。
 *
 * 示例:
 *
 * 现有矩阵 matrix 如下：
 *
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 **/

public class searchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0){
            return false;
        }
        int i=matrix.length-1;
        int j=0;
        while (i>=0&&j<matrix[0].length){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]<target){
                j++;
            }else {
                i--;
            }
        }
        return false;
    }

}
