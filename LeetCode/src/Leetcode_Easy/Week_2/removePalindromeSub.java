package Leetcode_Easy.Week_2;

/**
 * @author ynz
 * create at 2020-05-05 00:36
 * @description:this is the class for
 * 给你一个字符串 s，它仅由字母 'a' 和 'b' 组成。每一次删除操作都可以从 s 中删除一个回文 子序列。
 *
 * 返回删除给定字符串中所有字符（字符串为空）的最小删除次数。
 *
 * 「子序列」定义：如果一个字符串可以通过删除原字符串某些字符而不改变原字符顺序得到，那么这个字符串就是原字符串的一个子序列。
 *
 * 「回文」定义：如果一个字符串向后和向前读是一致的，那么这个字符串就是一个回文。
 **/

public class removePalindromeSub {
    public int removePalindromeSub(String s) {
        if(s.equals("")){
            return 0;
        }
        char[] chars = s.toCharArray();
        for (int i = 0,j=chars.length-1;i <j;i++,j--) {
            if(chars[i]!=chars[j]){
                return 2;
            }
        }
        return 1;
    }
}
