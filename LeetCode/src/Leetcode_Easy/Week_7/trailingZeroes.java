package Leetcode_Easy.Week_7;

/**
 * @author ynz
 * create at 2020-06-13 01:03
 * @description:this is the class for
 * 设计一个算法，算出 n 阶乘有多少个尾随零。
 *
 * 示例 1:
 *
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 * 示例 2:
 *
 * 输入: 5
 * 输出: 1
 * 解释: 5! = 120, 尾数中有 1 个零.
 **/

public class trailingZeroes {
    public int trailingZeroes(int n) {
        int count=0;
        while (n>5){
            n/=5;
            count++;
        }
        return count;
    }
}
