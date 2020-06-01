package Leetcode_Easy.Week_5;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-05-31 01:04
 * @description:this is the class for
 **/

public class candy {
    public int candy(int[] ratings) {
        if (ratings.length == 0) return 0;
        int[] left = new int[ratings.length];
        int[] right = new int[ratings.length];
        int sum = 0;
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        for (int i = 0; i < ratings.length - 1; i++) {
            if (ratings[i + 1] > ratings[i]) {
                left[i + 1] = left[i] + 1;
            }
        }
        for (int i = ratings.length - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i]) {
                right[i - 1] = right[i] + 1;
            }
        }
        for (int i = 0; i < left.length; i++) {
            if (right[i] > left[i]) {
                left[i] = right[i];
            }
            sum+=left[i];
        }
        return sum;
    }
}
