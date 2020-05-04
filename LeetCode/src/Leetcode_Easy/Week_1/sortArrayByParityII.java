package Leetcode_Easy.Week_1;

import java.util.ArrayList;

/**
 * @author ynz
 * create at 2020-05-02 17:01
 * @description:this is the class for
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 *
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 *
 * 你可以返回任何满足上述条件的数组作为答案。
 *
 *  
 *
 * 示例：
 *
 * 输入：[4,2,5,7]
 * 输出：[4,5,2,7]
 * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 **/

public class sortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        ArrayList<Integer> one=new ArrayList<>();
        ArrayList<Integer> two=new ArrayList<>();
        for (int i = 0; i <A.length ; i++) {
            if(A[i]%2==0){
                two.add(A[i]);
            }else {
                one.add(A[i]);
            }
        }
        int[] a=new int[A.length];
        for(int i=0;i<a.length;i+=2){
            a[i]=two.get(i/2);
        }
        for(int i=1;i<a.length;i+=2){
            a[i]=one.get(i/2);
        }
        return a;
    }
}
