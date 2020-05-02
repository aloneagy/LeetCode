package Leetcode_Easy;

import java.util.HashMap;

/**
 * @author ynz
 * create at 2020-05-01 14:57
 * @description:this is the class for
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 **/

public class majorityElement {
    public int majorityElement(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        HashMap<Integer,Integer> num=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if(num.containsKey(nums[i])){
                num.put(nums[i],num.get(nums[i])+1);
            }else {
                num.put(nums[i],1);
            }
        }
        for(int i:num.keySet()){
            if(num.get(i)>=(nums.length+1)/2){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        majorityElement a=new majorityElement();
        int i = a.majorityElement(new int[]{2,2,1,1,1,2,2});
        System.out.println(i);
    }
}
