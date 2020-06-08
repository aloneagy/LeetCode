package Leetcode_Easy.Week_6;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-06-03 23:43
 * @description:this is the class for
 *
 **/

public class productExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        if(nums.length==0) return new int[]{};
        if(nums.length==1) return new int[]{nums[0]*nums[0]};
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int[] result=new int[nums.length];
        left[0]=1;
        right[nums.length-1]=1;
        for (int i = 1; i <nums.length ; i++) {
            left[i]=left[i-1]*nums[i-1];
        }
        for (int i = nums.length-2; i >=0 ; i--) {
            right[i]=nums[i+1]*right[i+1];
        }
        for (int i = 0; i <nums.length ; i++) {
            result[i]=left[i]*right[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = productExceptSelf(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(ints));
    }
}
