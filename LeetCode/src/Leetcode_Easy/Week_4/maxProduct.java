package Leetcode_Easy.Week_4;

/**
 * @author ynz
 * create at 2020-05-17 22:54
 * @description:this is the class for
 * 给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [2,3,-2,4]
 * 输出: 6
 * 解释: 子数组 [2,3] 有最大乘积 6。
 * 示例 2:
 *
 * 输入: [-2,0,-1]
 * 输出: 0
 * 解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
 **/

public class maxProduct {
    public int maxProduct(int[] nums) {
        if(nums.length==0) return 0;
        int max=nums[0];
        int[] dpMax=new int[nums.length+1];
        int[] dpMin=new int[nums.length+1];
        dpMax[0]=nums[0];
        dpMin[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            dpMax[i]=Math.max(Math.max(nums[i],nums[i]*dpMax[i-1]),nums[i]*dpMin[i-1]);
            dpMin[i]=Math.min(Math.min(nums[i],nums[i]*dpMin[i-1]),nums[i]*dpMax[i-1]);
            if(max<Math.max(dpMax[i],dpMin[i])){
                max=Math.max(dpMax[i],dpMin[i]);
            }
        }
        return max;
    }
}
