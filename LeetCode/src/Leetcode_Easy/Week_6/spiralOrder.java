package Leetcode_Easy.Week_6;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-06-05 01:07
 * @description:this is the class for
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 * 示例 2：
 *
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 **/

public class spiralOrder {
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int[] res=new int[(matrix[0].length)*(matrix.length)];
        int top=0;
        int bot=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        int j=0;
        while (j<res.length){
            for (int i = left; i <=right ; i++) {
                res[j]=matrix[top][i];
                j++;
            }
            top++;
            if(top > bot) break;
            for (int i = top; i <= bot; i++) {
                res[j]=matrix[i][right];
                j++;
            }
            right--;
            if(right <left) break;
            for (int i = right; i >=left ; i--) {
                res[j]=matrix[bot][i];
                j++;
            }
            bot--;
            if(bot < top ) break;
            for (int i = bot; i >=top ; i--) {
                res[j++]=matrix[i][left];
            }

            left++;
            if(left > right) break;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] a=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[] ints = spiralOrder(a);
        System.out.println(Arrays.toString(ints));

    }
}
