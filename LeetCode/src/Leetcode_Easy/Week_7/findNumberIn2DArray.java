package Leetcode_Easy.Week_7;

/**
 * @author ynz
 * create at 2020-06-09 15:37
 * @description:this is the class for
 **/

public class findNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0 ||matrix[0].length==0){
            return false;
        }
        int right=matrix[0].length;
        int left=0;
        int j=matrix.length-1;
        while (left<right && j>=0){
            if(matrix[j][left]>target){
                j--;
            }else if(matrix[j][left]==target) {
                return true;
            }else {
                left++;
            }
        }
        return false;
    }
}
