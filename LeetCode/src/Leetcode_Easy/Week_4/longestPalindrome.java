package Leetcode_Easy.Week_4;

/**
 * @author ynz
 * create at 2020-05-20 23:04
 * @description:this is the class for
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 **/

public class longestPalindrome {
    public String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        int start=0,end=0;
        for (int i = 0; i <s.length(); i++) {
            int len1=expand(s,i,i);
            int len2=expand(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);

    }
    public int expand(String s,int left,int right){
        while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
