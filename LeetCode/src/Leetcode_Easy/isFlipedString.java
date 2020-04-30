package Leetcode_Easy;

/**
 * @author ynz
 * create at 2020-04-26 19:45
 * @description:this is the class for
 * 字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。
 **/

public class isFlipedString {
    public boolean isFlipedString(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        String a=s2+s2;
        return a.contains(s1);
    }
}
