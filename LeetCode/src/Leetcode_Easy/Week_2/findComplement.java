package Leetcode_Easy.Week_2;

/**
 * @author ynz
 * create at 2020-05-04 18:25
 * @description:this is the class for
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: 5
 * 输出: 2
 * 解释: 5 的二进制表示为 101（没有前导零位），其补数为 010。所以你需要输出 2 。
 * 示例 2:
 *
 * 输入: 1
 * 输出: 0
 * 解释: 1 的二进制表示为 1（没有前导零位），其补数为 0。所以你需要输出 0 。
 **/

public class findComplement {
    public int findComplement(long num) {
        long a = num;
        if(a == 0) return 1;
        int count = 0;
        while (a != 0){
            a = a >> 1;
            count++;
        }
        return (int)(Math.pow(2,count)-1-num);
    }
}
