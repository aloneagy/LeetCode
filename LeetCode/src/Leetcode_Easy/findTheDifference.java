package Leetcode_Easy;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-04-30 19:38
 * @description:this is the class for
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 *
 *  
 *
 * 示例:
 *
 * 输入：
 * s = "abcd"
 * t = "abcde"
 *
 * 输出：
 * e
 *
 * 解释：
 * 'e' 是那个被添加的字母。
 **/

public class findTheDifference {
    public char findTheDifference(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]!=chart[i]){
                return chart[i];
            }
        }
        return chart[chart.length-1];
    }
}
