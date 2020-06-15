package Leetcode_Easy.Week_7;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ynz
 * create at 2020-06-09 19:55
 * @description:this is the class for
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 *
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：target = 9
 * 输出：[[2,3,4],[4,5]]
 * 示例 2：
 *
 * 输入：target = 15
 * 输出：[[1,2,3,4,5],[4,5,6],[7,8]]
 **/

public class findContinuousSequence {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res=new ArrayList<>();
        for (int l = 1,r=1,sum=0; r < target; r++) {
            sum+=r;
            while (sum>target){
                sum-=l++;
            }
            if(sum==target){
                int[] tem=new int[r-l+1];
                for (int i = 0; i < tem.length; i++) {
                    tem[i]=l+i;
                }
                res.add(tem);
            }
        }
        int[][] resu=new int[res.size()][];
        for (int i = 0; i < resu.length; i++) {
            resu[i]=res.get(i);
        }
        return resu;
    }
}
