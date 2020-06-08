package Leetcode_Easy.Week_6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ynz
 * create at 2020-06-05 23:34
 * @description:this is the class for
 **/

public class addToArrayForm {
    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res=new ArrayList<>();
        int i=A.length-1, carry=0;
        while (i>=0 || K!=0 || carry != 0){
            if(i>=0) carry+=A[i--];
            if(K!=0) carry+=K%10;
            if(carry>=10){
                res.add(0,carry-10);
                carry=1;
            }else {
                res.add(0,carry);
                carry=0;
            }
            K/=10;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4};
        int b=1;
        List<Integer> integers = addToArrayForm(a, b);
        System.out.println(integers);
    }
}
