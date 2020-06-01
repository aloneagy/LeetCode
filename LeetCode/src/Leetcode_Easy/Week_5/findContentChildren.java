package Leetcode_Easy.Week_5;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-05-31 00:53
 * @description:this is the class for
 **/

public class findContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        if (g.length == 0 || s.length == 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int count=0;
        while (i<g.length &&j < s.length){
            if(g[i]>s[j]){
                j++;
            }else {
                i++;
                j++;
                count++;
            }
        }
        return count;
    }
}
