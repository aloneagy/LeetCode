package Leetcode_Easy.Week_1;

/**
 * @author ynz
 * create at 2020-04-27 13:39
 * @description:this is the class for
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 给定 N，计算 F(N)。
 *
 **/

public class fib {
    public int fib(int N) {
        int[] a=new int[N+1];
        if(N==0){
            return 0;
        }
        if(N==1){
            return 1;
        }
        a[0]=0;
        a[1]=1;
        for(int i=2;i<N+1;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[N];
    }

    public static void main(String[] args) {
        fib a=new fib();
        System.out.println(a.fib(3));
    }
}
