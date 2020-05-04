package Leetcode_Easy.Week_2;

/**
 * @author ynz
 * create at 2020-05-03 23:29
 * @description:this is the class for
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 *
 * 示例:
 *
 * 输入: [2,3,1,1,4]
 * 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 *      从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
 **/

public class jump {
    public int jump(int[] nums) {
        int res=0;
        int end=0;
        int max=0;
        for (int i = 0; i <nums.length-1 ; i++) {
            max=Math.max(nums[i]+i,max);
            if(end==i){
                end=max;
                res++;
            }
        }
        return res;
    }
}
