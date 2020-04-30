package Leetcode_Easy;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-04-28 00:21
 * @description:this is the class for
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [4,1,4,6]
 * 输出：[1,6] 或 [6,1]
 * 示例 2：
 *
 * 输入：nums = [1,2,10,4,1,4,3,3]
 * 输出：[2,10] 或 [10,2]
 **/

public class singleNumbers {
    public int[] singleNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] number=new int[2];
        if(nums.length==2) return nums;
        int left=0;
        int right=nums.length-1;
        int mid;
        while (left+1<right){
            mid=(left+right)/2;
            if(nums[mid]==nums[mid+1]) mid=mid-1;

            if(Function(nums,left,mid)==0) {
                left = mid + 1;
            }else if(Function(nums,mid+1,right)==0){
                right=mid;
            }else {
                number[0]=Function(nums,left,mid);
                number[1]=Function(nums,mid+1,right);
                return number;
            }
            if((Function(nums,left,mid)!=0)&&(mid-left)==1){
                number[0]=nums[left];
                number[1]=nums[mid];
                return number;
            }
            if((Function(nums,mid+1,right)!=0)&&(right-mid-1)==1){
                number[0]=nums[mid+1];
                number[1]=nums[right];
                return number;
            }
        }
        return number;

    }
    public int Function(int[] nums,int begin,int end){
        int res=0;
        for(int i=begin;i<=end;i++){
            res^=nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        singleNumbers a=new singleNumbers();
        int[] num=new int[]{4,1,4,6};
        a.singleNumbers(num);
    }

}
