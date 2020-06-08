package Leetcode_Easy.Week_6;

/**
 * @author ynz
 * create at 2020-06-07 13:53
 * @description:this is the class for
 * 1   2   3   5
 * 9   8    7   6
 * 11 13   15   17
 * x行
 * y列
 **/

public class snake {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0){
            return false;
        }
        int len = matrix[0].length;
        int end = matrix.length * matrix[0].length-1;
        int start = 0;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            int midvalue = mid / len %2==0 ? matrix[mid / len][mid % len] : matrix[mid/len][len - (mid%len) -1];
            if (midvalue == target) {
                return true;
            } else if (midvalue > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2, 3}, {6, 5, 4}, {7, 8, 9}};
        System.out.println(searchMatrix(a, 9));
    }
}
