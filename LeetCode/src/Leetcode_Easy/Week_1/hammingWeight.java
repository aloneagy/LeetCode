package Leetcode_Easy.Week_1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-04-28 17:15
 * @description:this is the class for
 * 请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
 *
 * 示例 1：
 *
 * 输入：00000000000000000000000000001011
 * 输出：3
 * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
 *
 **/

public class hammingWeight {
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }

}
