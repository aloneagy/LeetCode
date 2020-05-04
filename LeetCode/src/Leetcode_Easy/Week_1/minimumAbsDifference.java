package Leetcode_Easy.Week_1;

import java.util.*;

/**
 * @author ynz
 * create at 2020-04-28 00:01
 * @description:this is the class for
 * 给你个整数数组 arr，其中每个元素都 不相同。
 *
 * 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：arr = [4,2,1,3]
 * 输出：[[1,2],[2,3],[3,4]]
 * 示例 2：
 *
 * 输入：arr = [1,3,6,10,15]
 * 输出：[[1,3]]
 * 示例 3：
 *
 * 输入：arr = [3,8,-10,23,19,-4,-14,27]
 * 输出：[[-14,-10],[19,23],[23,27]]
 *
 **/

public class minimumAbsDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        ArrayList<List<Integer>> b=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for (int i = 1; i <arr.length ; i++) {
            if((arr[i]-arr[i-1])<min){
                min=arr[i]-arr[i-1];
            }
        }
        for (int i = 1; i <arr.length ; i++) {
            List<Integer> subRes=new ArrayList<>();
            if((arr[i]-arr[i-1])==min){
                subRes.add(arr[i-1]);
                subRes.add(arr[i]);
                b.add(subRes);
            }
        }
        return b;

    }
}
