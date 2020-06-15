package Leetcode_Easy.Week_7;

/**
 * @author ynz
 * create at 2020-06-08 23:49
 * @description:this is the class for
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"

 **/

public class translateNum {
    public static int translateNum(int num) {
        String nums=String.valueOf(num);
        if(nums.length()==0){
            return 0;
        }
        int[] dp=new int[nums.length()+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 1; i < nums.length(); i++) {
            if(nums.charAt(i-1)=='1'||nums.charAt(i-1)=='2'&&(nums.charAt(i)>='0'&&nums.charAt(i)<='5')){
                dp[i+1]=dp[i]+dp[i-1];
            }else {
                dp[i+1]=dp[i];
            }
        }
        return dp[nums.length()];
    }

    public static void main(String[] args) {
        int a=25;
        int i = translateNum(a);
        System.out.println(i);
    }
}
