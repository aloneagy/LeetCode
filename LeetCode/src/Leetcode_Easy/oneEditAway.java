package Leetcode_Easy;

import java.util.HashSet;

/**
 * @author ynz
 * create at 2020-04-26 18:48
 * @description:this is the class for字符串有三种编辑操作:插入一个字符、
 * 删除一个字符或者替换一个字符。 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。
 **/

public class oneEditAway {
    public boolean oneEditAway(String first, String second) {
        if(first.length()==0&&second.length()==0){
            return true;
        }
        if(Math.abs(first.length()-second.length())>1){
            return false;
        }else {
            int i;
            for(i=0;i<Math.min(first.length(),second.length());i++){
                if(first.charAt(i)!=second.charAt(i)){
                    break;
                }
            }
            if(i==Math.min(first.length(),second.length()))return true;
            String newFirst=new StringBuffer(first.substring(i)).reverse().toString();
            String newSecond=new StringBuffer(second.substring(i)).reverse().toString();
            int minLength=Math.min(newFirst.length(),newSecond.length());
            if(newFirst.length()==newSecond.length()){
                return newFirst.substring(0,minLength-1).equals(newSecond.substring(0,minLength-1));
            }else {
                return newFirst.substring(0,minLength).equals(newSecond.substring(0,minLength));
            }
        }
    }

    public static void main(String[] args) {
        oneEditAway a=new oneEditAway();
        boolean b = a.oneEditAway("intention","execution");
        System.out.println(b);
    }
}
