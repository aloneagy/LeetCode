package Leetcode_Easy.Week_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ynz
 * create at 2020-05-03 19:57
 * @description:this is the class for
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 *
 * 示例 1:
 *
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 * 注意：
 *
 * 输入的数组只包含 0 和1。
 * 输入数组的长度是正整数，且不超过 10,000。
 *
 **/

public class findMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0]==1 ? 1:0;
        int count=0;
        List<Integer> a=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                count++;
            }
            if(nums[i]==0||i==nums.length-1){
                a.add(count);
                count=0;
            }
        }
        return Collections.max(a);
    }
}
