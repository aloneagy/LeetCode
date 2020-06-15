package Leetcode_Easy.Week_7;

import java.util.HashMap;

/**
 * @author ynz
 * create at 2020-06-12 21:18
 * @description:this is the class for
 **/

public class majorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
        }
        for(int i:hashMap.keySet()){
            if(hashMap.get(i)>nums.length/2){
                return i;
            }
        }
        return -1;
    }
}
