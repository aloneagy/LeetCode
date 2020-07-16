package Leetcode_Easy.Week_10;

/**
 * @author ynz
 * create at 2020-07-01 01:39
 * @description:this is the class for
 * 给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 *
 * 示例 1:
 *
 * 输入:
 * A: [1,2,3,2,1]
 * B: [3,2,1,4,7]
 * 输出: 3
 * 解释:
 * 长度最长的公共子数组是 [3, 2, 1]。
 **/

public class findLength {
    public int findLength(int[] A, int[] B) {
        if(A.length==0 || B.length==0){
            return 0;
        }
        int count=0;
        int[][] dp=new int[A.length+1][B.length+1];
        for (int i = 1; i < A.length+1; i++) {
            for (int j = 1; j < B.length+1; j++) {
                if(A[i-1]==B[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                    count=Math.max(count,dp[i][j]);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        findLength a=new findLength();
        int[] aa=new int[]{0,1,1,1,1};
        int[] aa1=new int[]{1,0,1,0,1};
        a.findLength(aa,aa1);
    }
}
