package Leetcode_Easy.Week_1;

import java.util.HashSet;

/**
 * @author ynz
 * create at 2020-04-26 19:17
 * @description:this is the class for
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 *
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 *
 * 回文串不一定是字典当中的单词。
 *
 **/

public class canPermutePalindrome {
    public boolean canPermutePalindrome(String s) {
    char[] a=s.toCharArray();
    HashSet<Character> b=new HashSet<>();
    for(char i:a){
        if(b.contains(i)){
            b.remove(i);
        }else {
            b.add(i);
        }
    }
    return b.size()<2? true:false;

    }
}
