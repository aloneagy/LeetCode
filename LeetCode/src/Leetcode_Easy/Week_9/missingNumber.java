package Leetcode_Easy.Week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ynz
 * create at 2020-06-26 14:39
 * @description:this is the class for
 * 数组nums包含从0到n的所有整数，但其中缺了一个。请编写代码找出那个缺失的整数。你有办法在O(n)时间内完成吗？
 *
 * 注意：本题相对书上原题稍作改动
 *
 * 示例 1：
 *
 * 输入：[3,0,1]
 * 输出：2
 *  
 *
 * 示例 2：
 *
 * 输入：[9,6,4,2,3,5,7,0,1]
 * 输出：8

 **/

public class missingNumber {
    public int missingNumber(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            arrayList.add(nums[i]);
        }
        for (int i = 0; i <= nums.length; i++) {
            if(!arrayList.contains(i)){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        missingNumber a=new missingNumber();
        int i = a.missingNumber(new int[]{0, 1, 3});
        System.out.println(i);
    }

}
