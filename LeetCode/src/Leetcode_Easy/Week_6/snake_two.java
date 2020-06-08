package Leetcode_Easy.Week_6;

/**
 * @author ynz
 * create at 2020-06-08 00:34
 * @description:this is the class for
 * 奇数行从右往作递增，
 * 偶数行从左往右递增
 * 1 2 3
 * 6 5 4
 * 7 8 9
 **/

public class snake_two {
    public static boolean snake(int[][] arr, int target) {
        int start = 0;
        int end = arr.length * arr[0].length - 1;
        int col = arr[0].length;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (mid / col % 2 == 1) {
                if (arr[mid / col][col - mid % col - 1] == target) {
                    return true;
                } else if (arr[mid / col][col - mid % col - 1] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid / col][mid % col] == target) {
                    return true;
                } else if (arr[mid / col][mid % col] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2, 3}, {6, 5, 4}, {7, 8, 9}};
        System.out.println(snake(a, 2));
    }
}
