package Leetcode_Easy.Week_7;

/**
 * @author ynz
 * create at 2020-06-11 00:18
 * @description:this is the class for
 **/

public class dailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        if(T.length<=1){
            return T;
        }
        int[] res=new int[T.length];
        for (int i = 0; i < T.length; i++) {
            int j=i+1;
            while (j<T.length) {
                if (T[i] < T[j]) {
                    res[i]=j-i;
                    break;
                }else {
                    j++;
                }
            }
            if(j>=T.length){
                res[i]=0;
            }
        }
        return res;
    }
}
