package Leetcode_Easy;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-05-01 17:00
 * @description:this is the class for
 * 给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。
 *
 * 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。
 *
 *  
 *
 * 示例 1：
 *
 *
 *
 * 输入：text = "nlaebolko"
 * 输出：1
 * 示例 2：
 *
 *
 *
 * 输入：text = "loonbalxballpoon"
 * 输出：2
 * 示例 3：
 *
 * 输入：text = "leetcode"
 * 输出：0
 **/

public class maxNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int a=0,b=0,l=0,o=0,n=0;
        for (int i = 0; i <text.length() ; i++) {
            if(text.charAt(i)=='a'){
                a++;
            }else if(text.charAt(i)=='b'){
                b++;
            }else if(text.charAt(i)=='l'){
                l++;
            }else if(text.charAt(i)=='o'){
                o++;
            }else if(text.charAt(i)=='n'){
                n++;
            }
        }
        l/=2;
        o/=2;
        int[] chars=new int[]{a,b,l,o,n};
        Arrays.sort(chars);
        return chars[0];
    }

    public static void main(String[] args) {
        maxNumberOfBalloons a=new maxNumberOfBalloons();
        int nlaebolko = a.maxNumberOfBalloons("nlaebolko");
        System.out.println(nlaebolko);
    }
}
