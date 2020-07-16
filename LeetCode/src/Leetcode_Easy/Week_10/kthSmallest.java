package Leetcode_Easy.Week_10;

/**
 * @author ynz
 * create at 2020-07-02 00:38
 * @description:this is the class for
 * 给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
 * 请注意，它是排序后的第 k 小元素，而不是第 k 个不同的元素。
 *
 *  
 *
 * 示例：
 *
 * matrix = [
 *    [ 1,  5,  9],
 *    [10, 11, 13],
 *    [12, 13, 15]
 * ],
 * k = 8,
 *
 * 返回 13。
 **/

public class kthSmallest {
    public int kthSmallest(int[][] matrix, int k) {
        int left=matrix[0][0];
        int right=matrix[matrix.length-1][matrix[0].length-1];
        while (left<right){
            int mid=(left+right)/2;
            if(check(matrix,mid,k)){
                right=mid;
            }else {
                left=mid+1;
            }
        }
        return left;
    }
    public boolean check(int[][] maxtrix,int mid,int k){
        int n=maxtrix.length-1;
        int j=0;
        int num=0;
        while (n>=0&&j<maxtrix[0].length){
            if(maxtrix[n][j]<=mid){
                num+=n+1;
                j++;
            }else {
                n--;
            }
        }
        return num>=k;

    }
}
