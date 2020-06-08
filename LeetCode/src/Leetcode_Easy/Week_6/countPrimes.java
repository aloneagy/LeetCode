package Leetcode_Easy.Week_6;

/**
 * @author ynz
 * create at 2020-06-07 00:51
 * @description:this is the class for
 **/

public class countPrimes {
    public int countPrimes(int n) {
        boolean[] res=new boolean[n];
        int count=0;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(!res[i]){
                int k=2;
                while (i*k<n){
                    res[i*k]=true;
                    k++;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if(!res[i]){
                count++;
            }
        }
        return count;
    }
}
