package Leetcode_Easy.Week_8;

/**
 * @author ynz
 * create at 2020-06-17 00:25
 * @description:this is the class for
 **/

public class maxScoreSightseeingPair {
    public int maxScoreSightseeingPair(int[] A) {
        if(A.length==0){
            return 0;
        }
        if(A.length==1){
            return 2*A[0];
        }
        int tem=A[0];
        int res=A[1]-1+A[0];
        for (int i = 1; i < A.length; i++) {
            res=Math.max(res,tem+A[i]-i);
            tem=Math.max(tem,A[i]+i);
        }
        return res;
    }
}
