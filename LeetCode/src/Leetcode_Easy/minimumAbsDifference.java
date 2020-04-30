package Leetcode_Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
        if(arr.length==0 ||arr.length==1) return null;
        HashMap<Integer, ArrayList<Integer>> array=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                Math.abs(arr[i]-arr[j]);
            }
        }
        return null;
    }
}
