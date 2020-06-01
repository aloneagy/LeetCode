package Leetcode_Easy.Week_4;

/**
 * @author ynz
 * create at 2020-05-18 22:34
 * @description:this is the class for
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 *
 * 示例 1:
 *
 * 输入: "aba"
 * 输出: True
 * 示例 2:
 *
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 **/

public class validPalindrome {
    public boolean validPalindrome(String s) {
        if(s.length()<=2) return true;
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return isVaild(s,i+1,j)||isVaild(s,i,j-1);
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isVaild(String s,int i,int j){
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
