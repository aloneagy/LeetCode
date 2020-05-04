package Leetcode_Easy.Week_1;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-04-26 18:01
 * @description:this is the class for给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 **/

public class CheckPermutatio {
    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(int i=0;i<a1.length;i++){
            if(a1[i]==a2[i]){
                return true;
            }
        }
        return false;
    }
}

