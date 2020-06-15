package Leetcode_Easy.Week_7;

/**
 * @author ynz
 * create at 2020-06-08 15:49
 * @description:this is the class for
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B 中的元素 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 *
 *  
 *
 * 示例:
 *
 * 输入: [1,2,3,4,5]
 * 输出: [120,60,40,30,24]
 **/

public class constructArr {
    public static int[] constructArr(int[] a) {
        if(a.length==0) return new int[]{};
        int[] left=new int[a.length];
        int[] right=new int[a.length];
        int[] res=new int[a.length];
        left[0]=1;
        right[a.length-1]=1;
        for (int i = 1; i < a.length; i++) {
            left[i]=left[i-1]*a[i-1];
        }
        for(int i=a.length-2;i>=0;i--){
            right[i]=right[i+1]*a[i+1];
        }
        for (int i = 0; i <a.length ; i++) {
            res[i]=left[i]*right[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5};
        constructArr(a);
    }

}
