package Leetcode_Easy.Week_4;

/**
 * @author ynz
 * create at 2020-05-18 23:55
 * @description:this is the class for
 * 给定一个包含非负数的数组和一个目标整数 k，编写一个函数来判断该数组是否含有连续的子数组，其大小至少为 2，总和为 k 的倍数，即总和为 n*k，其中 n 也是一个整数。
 *
 * 示例 1:
 *
 * 输入: [23,2,4,6,7], k = 6
 * 输出: True
 * 解释: [2,4] 是一个大小为 2 的子数组，并且和为 6。
 * 示例 2:
 *
 * 输入: [23,2,6,4,7], k = 6
 * 输出: True
 * 解释: [23,2,6,4,7]是大小为 5 的子数组，并且和为 42。
 **/

public class checkSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        for (int start = 0; start < nums.length - 1; start++) {
            for (int end = start + 1; end < nums.length; end++) {
                int sum = 0;
                for (int i = start; i <= end; i++)
                    sum += nums[i];
                if (sum == k || (k != 0 && sum % k == 0))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        checkSubarraySum a=new checkSubarraySum();
        int[] aa=new int[]{1,2,12};
        boolean b = a.checkSubarraySum(aa, 6);
        System.out.println(b);
    }
}
