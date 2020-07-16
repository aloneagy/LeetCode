package Leetcode_Easy.Week_9;

/**
 * @author ynz
 * create at 2020-06-25 01:29
 * @description:this is the class for
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m] 。请问 k[0]*k[1]*...*k[m] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 **/

public class cuttingRope {
    public int cuttingRope(int n) {
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        long res=1;
        while (n>4){
            res*=3;
            res=res%1000000007;
            n-=3;
        }
        return (int)(res*n%1000000007);
    }
}
