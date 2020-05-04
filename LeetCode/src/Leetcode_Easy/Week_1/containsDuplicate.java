package Leetcode_Easy.Week_1;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-05-02 17:58
 * @description:this is the class for
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 *
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 *
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 **/

public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        containsDuplicate a=new containsDuplicate();
        int[] aa=new int[]{1,2,3,1};
        boolean b = a.containsDuplicate(aa);
        System.out.println(b);
    }
}
