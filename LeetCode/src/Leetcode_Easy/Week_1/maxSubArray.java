package Leetcode_Easy.Week_1;

/**
 * @author ynz
 * create at 2020-05-02 23:38
 * @description:this is the class for
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 *
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 **/

public class maxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],nums[0]+nums[1]);
        for (int i = 1; i <nums.length ; i++) {
            dp[i]=Math.max(nums[i],dp[i-1]+nums[i]);
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <dp.length ; i++) {
            if(dp[i]>max){
                max=dp[i];
            }
        }
        return max;
    }
}
