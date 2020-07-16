package Leetcode_Easy.Week_12;

/**
 * @author ynz
 * create at 2020-07-15 00:37
 * @description:this is the class for
 * 有个内含单词的超大文本文件，给定任意两个单词，找出在这个文件中这两个单词的最短距离(相隔单词数)。如果寻找过程在这个文件中会重复多次，而每次寻找的单词不同，你能对此优化吗?
 *
 * 示例：
 *
 * 输入：words = ["I","am","a","student","from","a","university","in","a","city"], word1 = "a", word2 = "student"
 * 输出：1
 **/

public class findClosest {
    public int findClosest(String[] words, String word1, String word2) {
        int l1=-1;
        int l2=-1;
        int res=words.length-1;
        for (int i = 0; i <words.length ; i++) {
            if(words[i].equals(word1)){
                l1=i;
            }
            if(words[i].equals(word2)){
                l2=i;
            }
            if(l1!=-1&&l2!=-1){
                res=Math.min(res,Math.abs(l2-l1));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        findClosest a=new findClosest();
        String[] aa=new String[]{"I","am","a","student","from","a","university","in","a","city"};
        String word1="a";
        String word2="student";
        a.findClosest(aa,word1,word2);
    }
}
