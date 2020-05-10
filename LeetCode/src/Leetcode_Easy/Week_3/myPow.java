package Leetcode_Easy.Week_3;

/**
 * @author ynz
 * create at 2020-05-10 23:13
 * @description:this is the class for
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 *
 * 示例 1:
 *
 * 输入: 2.00000, 10
 * 输出: 1024.00000
 * 示例 2:
 *
 * 输入: 2.10000, 3
 * 输出: 9.26100
 * 示例 3:
 *
 * 输入: 2.00000, -2
 * 输出: 0.25000
 * 解释: 2-2 = 1/22 = 1/4 = 0.25
 **/

public class myPow {
    public double myPow(double x, int n) {
        double res=1.0;
        for(int i=n;i!=0;i=i/2){
            if(i%2!=0){
                res*=x;
            }
            x*=x;
        }
        return n<0 ?1/res:res;
    }

    public static void main(String[] args) {
        myPow a=new myPow();
        a.myPow(2,10);
    }
}
