package Leetcode_Easy.Week_1;

/**
 * @author ynz
 * create at 2020-05-03 01:26
 * @description:this is the class for
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 *
 * 说明：不要使用任何内置的库函数，如  sqrt。
 *
 * 示例 1：
 *
 * 输入：16
 * 输出：True
 * 示例 2：
 *
 * 输入：14
 * 输出：False
 **/

public class isPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int i=0;
        while (i*i<num){
            i++;
        }
        return i*i==num;
    }

    public static void main(String[] args) {
        isPalindrome a=new isPalindrome();
        boolean palindrome = a.isPalindrome(25);
        System.out.println(palindrome);
    }
}
