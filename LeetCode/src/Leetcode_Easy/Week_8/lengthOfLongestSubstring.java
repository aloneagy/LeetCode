package Leetcode_Easy.Week_8;

import java.util.HashSet;

/**
 * @author ynz
 * create at 2020-06-15 16:33
 * @description:this is the class for
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 *
 *  
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
        if(s.length() == 0){
            return 0;
        }
        int i=0;
        int max=0;
        while (i<s.length()){
            int j=i+1;
            HashSet<Character> tem=new HashSet();
            tem.add(s.charAt(i));
            while (j<s.length()){
                if(!tem.contains(s.charAt(j))){
                    tem.add(s.charAt(j));
                    j++;
                }else{
                    break;
                }
            }
            if(max<tem.size()){
                max=tem.size();
            }
            i++;
        }
        return max;
    }
}
