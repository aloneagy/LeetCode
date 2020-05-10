package Leetcode_Easy.Week_2;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-05-04 18:33
 * @description:this is the class for
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 * 示例 2：
 *
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 **/

public class getLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] a=new int[k];
        for (int i = 0; i <=k-1 ; i++) {
            a[i]=arr[i];
        }
        return a;
    }

    public static void main(String[] args) {
        getLeastNumbers a=new getLeastNumbers();
        int[] b=new int[]{3,2,1};
        int[] leastNumbers = a.getLeastNumbers(b, 2);
        System.out.println(Arrays.toString(leastNumbers));
    }
}
