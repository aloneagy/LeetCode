package Leetcode_Easy.Week_11;

/**
 * @author ynz
 * create at 2020-07-09 17:02
 * @description:this is the class for
 * 哦，不！你不小心把一个长篇文章中的空格、标点都删掉了，并且大写也弄成了小写。像句子"I reset the computer. It still didn’t boot!"已经变成了"iresetthecomputeritstilldidntboot"。在处理标点符号和大小写之前，你得先把它断成词语。当然了，你有一本厚厚的词典dictionary，不过，有些词没在词典里。假设文章用sentence表示，设计一个算法，把文章断开，要求未识别的字符最少，返回未识别的字符数。
 *
 * 注意：本题相对原题稍作改动，只需返回未识别的字符数
 *
 *  
 *
 * 示例：
 *
 * 输入：
 * dictionary = ["looked","just","like","her","brother"]
 * sentence = "jesslookedjustliketimherbrother"
 * 输出： 7
 * 解释： 断句后为"jess looked just like tim her brother"，共7个未识别字符。
 **/

public class respace {
    public int respace(String[] dictionary, String sentence) {
        if(sentence==null||sentence.length()==0)
            return 0;
        int n=sentence.length();
        if(dictionary==null||dictionary.length==0)
            return n;
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1]+1;
            for(String word:dictionary){
                int wlen=word.length();
                if(i-wlen>=0&&sentence.substring(i-wlen,i).equals(word)){
                    dp[i]=Math.min(dp[i-wlen],dp[i]);
                }
            }
        }
        return dp[n];
    }
}
