package Leetcode_Easy.Week_1;

/**
 * @author ynz
 * create at 2020-04-28 16:26
 * @description:this is the class for
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 示例 1:
 *
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc" 
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 **/

public class reverseWords {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuffer stringBuffer=new StringBuffer();
        for (int i = 0; i <s1.length ; i++) {
            if(i==s1.length-1){
                stringBuffer.append(new StringBuffer(s1[i]).reverse().toString());
            }else {
                stringBuffer.append(new StringBuffer(s1[i]).reverse().toString()).append(" ");
            }
        }

        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        reverseWords a=new reverseWords();
        System.out.println(a.reverseWords("ac bd"));

    }
}
