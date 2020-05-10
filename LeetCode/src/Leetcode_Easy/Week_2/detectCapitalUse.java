package Leetcode_Easy.Week_2;

/**
 * @author ynz
 * create at 2020-05-04 18:45
 * @description:this is the class for
 * 给定一个单词，你需要判断单词的大写使用是否正确。
 *
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 *
 * 全部字母都是大写，比如"USA"。
 * 单词中所有字母都不是大写，比如"leetcode"。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 *
 * 示例 1:
 *
 * 输入: "USA"
 * 输出: True
 * 示例 2:
 *
 * 输入: "FlaG"
 * 输出: False
 **/

public class detectCapitalUse {
    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        int low=0;
        int up=0;
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]>='A'&&chars[i]<='Z') up++;
            if(chars[i]>='a'&&chars[i]<='z') low++;
        }
        if(up==word.length()) return true;
        if(up==1&&chars[0]>='A'&&chars[0]<='Z') return true;
        if(up==0) return true;
        return false;
    }

    public static void main(String[] args) {
        detectCapitalUse a=new detectCapitalUse();
        boolean a1 = a.detectCapitalUse("a");
        System.out.println(a1);
    }
}
