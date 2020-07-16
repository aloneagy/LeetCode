package Leetcode_Easy.Week_9;

/**
 * @author ynz
 * create at 2020-06-23 15:30
 * @description:this is the class for
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 **/

public class addBinary {
    public String addBinary(String a, String b) {
        StringBuffer res=new StringBuffer();
        int carry=0;
        for (int i = 0; i < Math.max(a.length(),b.length()) ; i++) {
            carry+=i<a.length()?a.charAt(a.length()-i-1)-'0':0;
            carry+=i<b.length()?b.charAt(b.length()-i-1)-'0':0;
            res.append((char)(carry%2+'0'));
            carry/=2;
        }
        if(carry>0){
            res.append('1');
        }
        return res.reverse().toString();
    }
}
