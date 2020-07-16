package Leetcode_Easy.Week_9;

/**
 * @author ynz
 * create at 2020-06-28 00:28
 * @description:this is the class for
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组，并返回其长度。如果不存在符合条件的连续子数组，返回 0。
 *
 * 示例: 
 *
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。

 **/

public class minSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            if(nums[0]==s){
                return 1;
            }else {
                return 0;
            }
        }
        int i=0;
        int j=0;
        int len=Integer.MAX_VALUE;
        int sum=0;
        while (j<nums.length){
            sum+=nums[j++];
            while (sum>=s){
                len=Math.min(len,j-i);
                sum-=nums[i++];
            }
        }
        return len==Integer.MAX_VALUE ? 0 : len;
    }

    public static void main(String[] args) {
        minSubArrayLen a=new minSubArrayLen();
        int[] aa=new int[]{2,3,1,2,4,3};
        a.minSubArrayLen(7,aa);
    }
}
