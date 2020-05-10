package Leetcode_Easy.Week_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ynz
 * create at 2020-05-05 16:17
 * @description:this is the class for
 * 给你一个 m * n 的矩阵，矩阵中的数字 各不相同 。请你按 任意 顺序返回矩阵中的所有幸运数。
 *
 * 幸运数是指矩阵中满足同时下列两个条件的元素：
 *
 * 在同一行的所有元素中最小
 * 在同一列的所有元素中最大
 *  
 *
 * 示例 1：
 *
 * 输入：matrix = [[3,7,8],[9,11,13],[15,16,17]]
 * 输出：[15]
 * 解释：15 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
 * 示例 2：
 *
 * 输入：matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
 * 输出：[12]
 * 解释：12 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
 * 示例 3：
 *
 * 输入：matrix = [[7,8],[1,2]]
 * 输出：[7]
 **/

public class luckyNumbers {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> a=new ArrayList<>();
        for (int i = 0; i <matrix.length ; i++) {
            int min=Integer.MAX_VALUE;
            int index=0;
            int max= Integer.MIN_VALUE;
            for (int j = 0; j <matrix[0].length ; j++) {
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    index=j;
                }
            }
            for (int j = 0; j <matrix.length ; j++) {
                max = Math.max(max, matrix[j][index]);
            }
            if(min==max){
                a.add(max);
            }
        }
        return a;
    }
}
