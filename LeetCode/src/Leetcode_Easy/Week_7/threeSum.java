package Leetcode_Easy.Week_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ynz
 * create at 2020-06-12 00:18
 * @description:this is the class for
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 *  
 *
 * 示例：
 *
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 **/

public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3) return new ArrayList<>();
        Arrays.sort(nums);
        int zero=0;
        List<List<Integer>> res=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=0){
                zero=i;
            }
        }
        for (int i = 0; i <zero; i++) {
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while (left<right){
                ArrayList<Integer> n=new ArrayList<>();
                if(nums[left]+nums[right]<-nums[i]){
                    left++;
                }else if(nums[left]+nums[right]>-nums[i]){
                    right--;
                }else {
                    n.add(nums[i]);
                    n.add(nums[left]);
                    n.add(nums[right]);
                    res.add(n);
                    left++;
                    right--;
                    while (left<right&&nums[left]==nums[left-1]){
                        left++;
                    }
                    while (left<right&&nums[right]==nums[right+1]){
                        right--;
                    }
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        threeSum a=new threeSum();
        List<List<Integer>> lists = a.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(lists);
    }
}