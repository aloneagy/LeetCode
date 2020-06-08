package Leetcode_Easy.Week_6;

/**
 * @author ynz
 * create at 2020-06-07 01:34
 * @description:this is the class for
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须原地修改，只允许使用额外常数空间。
 *
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 **/

public class nextPermutation {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while (i>=0&&nums[i+1]<=nums[i]){
            i--;
        }
        if(i>=0){
            int j = nums.length-1;
            while ( j >=0) {
                if(nums[i]<nums[j]){
                    break;
                }
                j--;
            }
            int tem=nums[i];
            nums[i]=nums[j];
            nums[j]=tem;
        }
        reverse(i+1,nums);
    }
    public int[] reverse(int start,int[] nums){
        int end=nums.length-1;
        while (end>start){
            int tem=nums[end];
            nums[end]=nums[start];
            nums[start]=tem;
            end--;
            start++;
        }
        return nums;
    }
}
