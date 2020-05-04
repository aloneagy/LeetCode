package Leetcode_Easy.Week_1;

import java.util.HashMap;

/**
 * @author ynz
 * create at 2020-04-27 13:52
 * @description:this is the class for
 * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
 *
 * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 *
 * 注意：每次拼写（指拼写词汇表中的一个单词）时，chars 中的每个字母都只能用一次。
 *
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：words = ["cat","bt","hat","tree"], chars = "atach"
 * 输出：6
 * 解释：
 * 可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
 **/

public class countCharacters {
    public static int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> a = new HashMap<>();
        ;
        char[] chars1 = chars.toCharArray();
        int sum=0;
        int i=0;
        while (i<chars1.length){
            if(a.containsKey(chars1[i])){
                a.put(chars1[i],a.get(chars1[i]) + 1);
            }else {
                a.put(chars1[i],1);
            }
            i++;
        }
        for(int j=0;j<words.length;j++){
            boolean flag = true; // Set a flag to judge the word could spell.

            HashMap<Character,Integer> b = new HashMap<>();
            char[] chars2 = words[j].toCharArray();
            for(int k=0;k<chars2.length;k++){
                if(b.containsKey(chars2[k])){
                    b.put(chars2[k],b.get(chars2[k]) + 1);
                }else {
                    b.put(chars2[k], 1);
                }

                if(a.containsKey(chars2[k])) {
                    if(a.get(chars2[k]) < b.get(chars2[k])) {
                        flag = false;
                        break;
                    }
                }
                else {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                sum+=words[j].length();
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        countCharacters a=new countCharacters();
        String[] aa=new String[]{"cat","bt","hat","tree"};
        a.countCharacters(aa,"atach");
    }
}
