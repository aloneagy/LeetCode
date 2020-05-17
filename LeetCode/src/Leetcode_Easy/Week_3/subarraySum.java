package Leetcode_Easy.Week_3;

import java.util.HashMap;

/**
 * @author ynz
 * create at 2020-05-14 23:52
 * @description:this is the class for
 *给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。
 *
 * 示例 1 :
 *
 * 输入:nums = [1,1,1], k = 2
 * 输出: 2 , [1,1] 与 [1,1] 为两种不同的情况。
 **/

public class subarraySum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> res=new HashMap<>();
        int sum=0;
        int count=0;
        res.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            sum=sum+nums[i];
            if(res.containsKey(sum-k)){
                count+=res.get(sum-k);
            }
            res.put(sum,res.getOrDefault(sum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        subarraySum a=new subarraySum();
        int[] b=new int[]{1,1,1};
        int i = a.subarraySum(b, 2);
        System.out.println(i);
    }
}
