package Leetcode_Easy.Week_7;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author ynz
 * create at 2020-06-11 01:17
 * @description:this is the class for
 **/

public class isStraight {
    public boolean isStraight(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        for (int i = 0; i < 4; i++) {
            if(nums[i]==0) {
                count++;
            }else if(nums[i]==nums[i+1]) return false;
        }
        return nums[4]-nums[count]<5;
    }

    public static void main(String[] args) {
        isStraight a=new isStraight();
        boolean straight = a.isStraight(new int[]{0, 0, 1, 2, 5});
        System.out.println(straight);
    }
}
