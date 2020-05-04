package Leetcode_Easy.Week_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author ynz
 * create at 2020-05-01 23:16
 * @description:this is the class for
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 **/

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet=new HashSet<>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i <chars.length; i++) {
            for (int j = i; j <chars.length ; j++) {
                if(hashSet.contains(chars[j])){
                    arrayList.add(hashSet.size());
                    hashSet.clear();
                    break;
                }else {
                    hashSet.add(chars[j]);
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i)>max) max=arrayList.get(i);
        }
        return max;
    }
}
