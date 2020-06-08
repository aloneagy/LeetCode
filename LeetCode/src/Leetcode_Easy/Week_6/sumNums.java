package Leetcode_Easy.Week_6;

/**
 * @author ynz
 * create at 2020-06-02 23:47
 * @description:this is the class for
 **/

public class sumNums {
    public int sumNums(int n) {
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
