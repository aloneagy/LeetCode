package Leetcode_Easy.Week_2;

import java.util.ArrayList;

/**
 * @author ynz
 * create at 2020-05-06 23:59
 * @description:this is the class for
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 *
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 *
 * 说明:
 *
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 示例:
 *
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 **/

public class twoSum {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int[] a=new int[2];
        while (i<j){
            if(numbers[i]+numbers[j]==target){
                a[0]=i+1;
                a[1]=j+1;
                break;
            }else if(numbers[i]+numbers[j]<target){
                i++;
            }else {
                j--;
            }
        }
        return a;
    }
}