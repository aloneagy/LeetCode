package Leetcode_Easy.Week_7;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-06-15 00:11
 * @description:this is the class for
 **/

public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        Arrays.sort(strs);
        String res=strs[0];
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < Math.min(res.length(),strs[i].length()); j++) {
                if(res.charAt(j)!=strs[i].charAt(j)){
                    res=res.substring(0,j);
                }
            }
        }
        return res;
    }
}
