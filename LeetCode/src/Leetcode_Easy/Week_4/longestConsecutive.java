package Leetcode_Easy.Week_4;

import java.util.HashSet;

/**
 * @author ynz
 * create at 2020-05-19 23:30
 * @description:this is the class for
 * 给定一个未排序的整数数组，找出最长连续序列的长度。
 *
 * 要求算法的时间复杂度为 O(n)。
 *
 * 示例:
 *
 * 输入: [100, 4, 200, 1, 3, 2]
 * 输出: 4
 * 解释: 最长连续序列是 [1, 2, 3, 4]。它的长度为 4。
 **/

public class longestConsecutive {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1) return nums.length;
        HashSet<Integer> hashSet=new HashSet<>();
        int max=1;
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        for(int i:nums) {
            if(hashSet.contains(i)){
                hashSet.remove(i);
                int tem = i;
                int count = 1;
                while (hashSet.contains(i + 1)) {
                    hashSet.remove(i + 1);
                    count++;
                    i += 1;
                }
                while (hashSet.contains(tem - 1)) {
                    hashSet.remove(tem - 1);
                    count++;
                    tem -= 1;
                }
                if (count > max) {
                    max = count;
                }
            }
        }
        return max;
    }
}
