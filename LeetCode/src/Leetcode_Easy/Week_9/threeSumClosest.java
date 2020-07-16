package Leetcode_Easy.Week_9;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-06-24 01:17
 * @description:this is the class for
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 *  
 *
 * 示例：
 *
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 **/

public class threeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length; i++) {
            int left=i+1;
            int right=nums.length-1;
            while (left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(sum-target)<Math.abs(target-res)){
                    res=sum;
                }
                if(sum<target){
                    left++;
                }else if(sum>target) {
                    right--;
                }else {
                    break;
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        threeSumClosest a=new threeSumClosest();
        int[] aa=new int[]{0,2,1,-3};
        a.threeSumClosest(aa,1);
    }
}
