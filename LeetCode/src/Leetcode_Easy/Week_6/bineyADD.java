package Leetcode_Easy.Week_6;

/**
 * @author ynz
 * create at 2020-06-02 00:14
 * @description:this is the class for
 **/
//二进制加法
public class bineyADD {
    public static int binaryAd(int a,int b){
        return (a^b)+((a&b)<<1);
    }

    public static void main(String[] args) {
        int i = binaryAd(1, 1);
        System.out.println(i);
    }
}
