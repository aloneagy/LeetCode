package Leetcode_Easy;

/**
 * @author ynz
 * create at 2020-04-30 16:36
 * @description:this is the class for
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 *
 * 你可以返回满足此条件的任何数组作为答案。
 *
 *  
 *
 * 示例：
 *
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 **/

public class sortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] a=new int[A.length];
        int start=0;
        int end=A.length-1;
        if(A.length==0){
            return A;
        }
        for (int i = 0; i <A.length ; i++) {
            if(A[i]%2==0){
              a[start]=A[i];
              start++;
            }else {
                a[end]=A[i];
                end--;
            }
        }
        return a;
    }

    public static void main(String[] args) {

    }
}
