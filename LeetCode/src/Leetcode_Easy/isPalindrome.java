package Leetcode_Easy;

/**
 * @author ynz
 * create at 2020-05-02 17:37
 * @description:this is the class for
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 **/

public class isPalindrome {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        if(s.length()==1){
            return true;
        }
        int left=0;
        int right=s.length()-1;
        while (left<=right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome a=new isPalindrome();
        a.isPalindrome(121);
    }
}
