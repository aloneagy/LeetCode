package Leetcode_Easy.Week_2;

/**
 * @author ynz
 * create at 2020-05-05 15:57
 * @description:this is the class for
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 *  
 *
 * 示例 1：
 *
 * 输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"
 * 示例 2：
 *
 * 输入: s = "lrloseumgh", k = 6
 * 输出: "umghlrlose"
 **/

public class reverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        StringBuffer a=new StringBuffer();
        char[] chars = s.toCharArray();
        for (int i = n-1; i <chars.length ; i++) {
            a.append(chars[i]);
        }
        for (int i = 0; i <n ; i++) {
            a.append(chars[i]);
        }
        return a.toString();
    }
}
