package Leetcode_Easy.Week_1;

import java.util.ArrayList;

/**
 * @author ynz
 * create at 2020-04-26 19:33
 * @description:this is the class for
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
 *
 * 示例1:
 *
 *  输入："aabcccccaaa"
 *  输出："a2b1c5a3"
 * 示例2:
 *
 *  输入："abbccd"
 *  输出："abbccd"
 *  解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
 **/

public class compressString {
    public String compressString(String S) {
        StringBuffer a =new StringBuffer();
        char[] chars = S.toCharArray();
        int i=0;
        int count=1;
        while (i<chars.length){
            if(i==chars.length-1){
                a.append(chars[i]).append(count);
                break;
            }
            if(chars[i]==chars[i+1]){
                count++;
            }else {
                a.append(chars[i]).append(count);
                count=1;

            }
            i++;
        }
        char[] chars1 = a.toString().toCharArray();
        if(chars.length>chars1.length){
            return a.toString();
        }
        return S;
    }
}
