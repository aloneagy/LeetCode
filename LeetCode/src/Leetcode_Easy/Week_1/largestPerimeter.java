package Leetcode_Easy.Week_1;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-04-30 18:59
 * @description:this is the class for
 * 给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、面积不为零的三角形的最大周长。
 *
 * 如果不能形成任何面积不为零的三角形，返回 0。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[2,1,2]
 * 输出：5
 * 示例 2：
 *
 * 输入：[1,2,1]
 * 输出：0
 * 示例 3：
 *
 * 输入：[3,2,3,4]
 * 输出：10
 * 示例 4：
 *
 * 输入：[3,6,2,3]
 * 输出：8
 **/

public class largestPerimeter {
    public int largestPerimeter(int[] A) {
        if(A.length<2){
            return 0;
        }
        Arrays.sort(A);
        int i=A.length-1;
        while (i>=2){
            if(A[i-2]+A[i-1]>A[i]){
                return A[i]+A[i-1]+A[i-2];
            }else {
                i--;
            }
        }
        return 0;
    }
}
