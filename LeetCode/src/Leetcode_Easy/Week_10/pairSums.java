package Leetcode_Easy.Week_10;

import java.util.*;

/**
 * @author ynz
 * create at 2020-06-29 15:37
 * @description:this is the class for
 * 设计一个算法，找出数组中两数之和为指定值的所有整数对。一个数只能属于一个数对。
 *
 * 示例 1:
 *
 * 输入: nums = [5,6,5], target = 11
 * 输出: [[5,6]]
 * 示例 2:
 *
 * 输入: nums = [5,6,5,6], target = 11
 * 输出: [[5,6],[5,6]]
 **/

public class pairSums {
    public List<List<Integer>> pairSums(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(target-n)&&map.get(target-n)>0){
                res.add(Arrays.asList(n,target-n));
                map.put(target-n,map.get(target-n)-1);
            }else {
                map.put(n,map.getOrDefault(n,0)+1);
            }
        }
        return res;
    }
}
