package Leetcode_Easy.Week_6;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ynz
 * create at 2020-06-08 01:54
 * @description:this is the class for
 **/

public class equationsPossible {
    public static boolean equationsPossible(String[] equations) {
        int[] index=new int[26];
        for (int i = 0; i < 26; i++) {
            index[i]=i;
        }
        for(String str : equations){
            if(str.charAt(1)=='='){
                int one=str.charAt(0)-'a';
                int two=str.charAt(3)-'a';
                int max=index[Math.max(one,two)];
                for (int i = 0; i <26 ; i++) {
                    if(index[i]==max){
                        index[i]=index[Math.min(one,two)];
                    }
                }
            }
        }
        boolean flag=true;
        for(String str :equations){
            if(str.charAt(1)=='!'){
                int one =str.charAt(0)-'a';
                int two =str.charAt(3)-'a';
                flag&=index[one]!=index[two];
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String[] s=new String[]{"a==b","e==c","b==c","a!=e"};
        boolean b = equationsPossible(s);
        System.out.println(b);
    }
}
