package Leetcode_Easy.Week_7;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-06-14 00:10
 * @description:this is the class for给你一个整数数组 arr 和一个目标值 target ，请你返回一个整数 value ，使得将数组中所有大于 value 的值变成 value 后，数组的和最接近  target （最接近表示两者之差的绝对值最小）。
 *
 * 如果有多种使得和最接近 target 的方案，请你返回这些整数中的最小值。
 *
 * 请注意，答案不一定是 arr 中的数字。
 *
 *
 **/

public class findBestValue {
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        int sum=0;
        int count=arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(sum+count*arr[i]>target){
                int value=(target-sum)/count;
                if(Math.abs(sum+value*count-target)<=Math.abs(sum+(value+1)*count-target)){
                    return value;
                }else {
                    return value+1;
                }

            }
            count--;
            sum+=arr[i];
        }
        return arr[arr.length-1];
    }
}
