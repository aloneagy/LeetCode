package Leetcode_Easy.Week_2;

/**
 * @author ynz
 * create at 2020-05-06 01:26
 * @description:this is the class for
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [7,5,6,4]
 * 输出: 5
 **/

public class reversePairs {
    int count=0;
    public int reversePairs(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return count;
    }
    public void merge(int[] arr,int left,int right){
        int[] tem=new int[right-left+1];
        int i=left;
        int j=(left+right)/2+1;
        int mid=(left+right)/2;
        int k=0;
        while (i<=mid&&j<=right){
            if(arr[i]<arr[j]){
                count+=mid-i+1;
                tem[k++]=arr[i++];
            }else {
                tem[k++]=arr[j++];
            }
        }
        while (i<=mid){
            tem[k++]=arr[i++];
        }
        while (j<=right){
            tem[k++]=arr[j++];
        }
        for (int l = 0; l <tem.length ; l++) {
            arr[left+l]=tem[l];
        }
    }
    public void mergeSort(int[] arr,int left,int right){
        int mid=(left+right)/2;
        if(left<right){
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,right);
        }
    }
}
