package Leetcode_Easy.Week_5;

/**
 * @author ynz
 * create at 2020-05-29 00:12
 * @description:this is the class for
 **/

public class rob {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int[] dp=new int[nums.length+1];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        int i;
        for ( i=2;i < nums.length; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[i-1];
    }
}
