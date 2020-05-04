package Leetcode_Easy.Week_1;

/**
 * @author ynz
 * create at 2020-04-27 23:59
 * @description:this is the class for
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 *
 * 返回重复了 N 次的那个元素。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,2,3,3]
 * 输出：3
 **/

public class repeatedNTimes {
    public int repeatedNTimes(int[] A) {
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]==A[j]){
                    return A[i];
                }
            }
        }
        return 0;

    }
}
