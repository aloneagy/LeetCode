package Leetcode_Easy;

/**
 * @author ynz
 * create at 2020-05-01 00:13
 * @description:this is the class for
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。
 *
 * 示例:
 *
 * s = "abaccdeff"
 * 返回 "b"
 *
 * s = ""
 * 返回 " "
 *
 **/

public class firstUniqChar {
    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        if(chars.length==0){
            return ' ';
        }
        if(chars.length==1) return chars[0];
        for(int i=0;i<chars.length;i++){
            if(s.indexOf(chars[i])==s.lastIndexOf(chars[i])){
                return chars[i];
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        firstUniqChar a=new firstUniqChar();
        a.firstUniqChar("aa");
    }
}
