package Leetcode_Easy.Week_7;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-06-09 19:43
 * @description:this is the class for
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 *
 *  
 *
 * 示例：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,2,4]
 * 注：[3,1,2,4] 也是正确的答案之一。
 *
 **/

public class exchange {
    public int[] exchange(int[] nums) {
        if(nums.length<=1){
            return nums;
        }
        int i=0;
        int j=nums.length-1;
        while (i<j){
            while (i<j&&nums[i]%2==1){
                i++;
            }
            while (i<j&&nums[j]%2==0){
                j--;
            }
            int tem=nums[i];
            nums[i]=nums[j];
            nums[j]=tem;
        }
        return nums;
    }
}
