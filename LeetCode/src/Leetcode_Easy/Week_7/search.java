package Leetcode_Easy.Week_7;

/**
 * @author ynz
 * create at 2020-06-08 17:36
 * @description:this is the class for
 * 统计一个数字在排序数组中出现的次数。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 * 示例 2:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0

 **/

public class search {
    public int search(int[] nums, int target) {
        if(nums.length==0){
            return 0;
        }
        int count=0;
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                count++;
                int left=mid;
                int right=mid;
                while ((left-1)>=0){
                    if(nums[left-1]==target) {
                        count++;
                        left--;
                    }else {
                        break;
                    }
                }
                while ((right+1)<nums.length){
                    if(nums[right+1]==target) {
                        count++;
                        right++;
                    }else {
                        break;
                    }
                }
                break;
            }else if(nums[mid]>target){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return count;
    }
}
