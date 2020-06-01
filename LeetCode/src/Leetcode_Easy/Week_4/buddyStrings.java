package Leetcode_Easy.Week_4;

import java.util.ArrayList;

/**
 * @author ynz
 * create at 2020-05-18 22:48
 * @description:this is the class for
 * 给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入： A = "ab", B = "ba"
 * 输出： true
 * 示例 2：
 *
 * 输入： A = "ab", B = "ab"
 * 输出： false
 * 示例 3:
 *
 * 输入： A = "aa", B = "aa"
 * 输出： true
 * 示例 4：
 *
 * 输入： A = "aaaaaaabc", B = "aaaaaaacb"
 * 输出： true
 * 示例 5：
 *
 * 输入： A = "", B = "aa"
 * 输出： false
 **/

public class buddyStrings {
    public boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length()) return false;
        if(A.equals(B)){
            for (int i = 0; i <A.length() ; i++) {
                for (int j = i+1; j < A.length(); j++) {
                    if(A.charAt(i)==B.charAt(j)){
                        return true;
                    }
                }
            }
            return false;
        }
        ArrayList<Integer> dif=new ArrayList<>();
        for (int i = 0; i <A.length() ; i++) {
            if(A.charAt(i)!=B.charAt(i)){
                dif.add(i);
            }
        }
        if(dif.size()!=2){
            return false;
        }
        if(A.charAt(dif.get(0))==B.charAt(dif.get(1)) &&A.charAt(dif.get(1))==B.charAt(dif.get(0))){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        buddyStrings a=new buddyStrings();
        boolean b = a.buddyStrings("ad", "ad");
        System.out.println(b);
    }
}
