package Leetcode_Easy.Week_1;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author ynz
 * create at 2020-05-03 00:57
 * @description:this is the class for
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 *
 **/

public class intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> one=new HashSet<>();
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i:nums1){
            hashSet.add(i);
        }
        for(int i:nums2){
            if(hashSet.contains(i)){
                one.add(i);
            }
        }
        Integer[] integers = one.toArray(new Integer[]{});
        int[] a=new int[integers.length];
        for (int i = 0; i <integers.length ; i++) {
            a[i]=integers[i];
        }
        return a;
    }

}
