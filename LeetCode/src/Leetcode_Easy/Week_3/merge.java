package Leetcode_Easy.Week_3;

/**
 * @author ynz
 * create at 2020-05-11 23:31
 * @description:this is the class for
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 *  
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *  
 *
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 **/

public class merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tem=new int[nums1.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<m&&j<n){
            if(nums1[i]<nums2[j]){
                tem[k++]=nums1[i++];
            }else {
                tem[k++]=nums2[j++];
            }
        }
        while (i<m){
            tem[k++]=nums1[i++];
        }
        while (j<n){
            tem[k++]=nums2[j++];
        }
        for (int l = 0; l <tem.length ; l++) {
            nums1[l]=tem[l];
        }
    }
}
