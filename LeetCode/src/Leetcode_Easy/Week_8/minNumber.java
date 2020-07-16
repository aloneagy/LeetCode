package Leetcode_Easy.Week_8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ynz
 * create at 2020-06-17 00:37
 * @description:this is the class for
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [10,2]
 * 输出: "102"
 * 示例 2:
 *
 * 输入: [3,30,34,5,9]
 * 输出: "3033459"
 **/

public class minNumber {
    public String minNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int num : nums) {
            list.add(String.valueOf(num));
        }
        list.sort((o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        return String.join("", list);
    }

    public static void main(String[] args) {
        minNumber a=new minNumber();
        int[] aa=new int[]{10,2};
        a.minNumber(aa);
    }
}
