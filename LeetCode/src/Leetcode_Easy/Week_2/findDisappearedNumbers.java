package Leetcode_Easy.Week_2;

import java.util.*;

/**
 * @author ynz
 * create at 2020-05-03 19:47
 * @description:this is the class for
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 *
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 *
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 *
 * 示例:
 *
 * 输入:
 * [4,3,2,7,8,2,3,1]
 *
 * 输出:
 * [5,6]
 **/

public class findDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> a=new HashSet<>();
        for (int i = 1; i <=nums.length ; i++) {
            a.add(i);
        }
        for (int i = 0; i <nums.length ; i++) {
            if(a.contains(nums[i])){
                a.remove(nums[i]);
            }
        }
        ArrayList<Integer> aa=new ArrayList<>();
        Object[] objects = a.toArray();
        for (int i = 0; i <objects.length ; i++) {
            aa.add((int) objects[i]);
        }
        return aa;
    }

    public static void main(String[] args) {
        findDisappearedNumbers a=new findDisappearedNumbers();
        int[] b=new int[]{4,3,2,7,8,2,3,1};
        a.findDisappearedNumbers(b);
    }
}
