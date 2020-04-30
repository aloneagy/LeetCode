package Leetcode_Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author ynz
 * create at 2020-04-27 20:02
 * @description:this is the class for
 * 在整数数组中，如果一个整数的出现频次和它的数值大小相等，我们就称这个整数为「幸运数」。
 *
 * 给你一个整数数组 arr，请你从中找出并返回一个幸运数。
 *
 * 如果数组中存在多个幸运数，只需返回 最大 的那个。
 * 如果数组中不含幸运数，则返回 -1 。
 *  
 *
 * 示例 1：
 *
 * 输入：arr = [2,2,3,4]
 * 输出：2
 * 解释：数组中唯一的幸运数是 2 ，因为数值 2 的出现频次也是 2
 **/

public class findLucky {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> a=new HashMap<>();
        ArrayList<Integer> num=new ArrayList<>();
        for(int i:arr){
            if(a.containsKey(i)){
                a.put(i,a.get(i)+1);
            }else {
                a.put(i,1);
            }
        }
        for(int k:a.keySet()){
            if(k==a.get(k)){
                num.add(k);
            }
        }
        if(num.size()>0){
            return Collections.max(num);
        }
        return -1;

    }


}
