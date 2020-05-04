package Leetcode_Easy.Week_1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ynz
 * create at 2020-04-27 20:10
 * @description:this is the class for
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 *
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：arr = [1,2,2,1,1,3]
 * 输出：true
 * 解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同。
 * 示例 2：
 *
 * 输入：arr = [1,2]
 * 输出：false
 **/

public class uniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> numbers=new HashMap<>();
        ArrayList<Integer> count=new ArrayList<>();
        if(arr.length==0||arr.length==1){
            return true;
        }
        for(int i=0;i<arr.length;i++){
            if(numbers.containsKey(arr[i])){
                numbers.put(arr[i],numbers.get(arr[i])+1);
            }else {
                numbers.put(arr[i],1);
            }
        }
        for(int i:numbers.keySet()){
            count.add(numbers.get(i));
        }
        for(int i=0;i<count.size();i++){
            for(int j=i+1;j<count.size();j++){
                if(count.get(i)==count.get(j)){
                    return false;
                }
            }
        }return true;
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,2,2,1,1,3};
        uniqueOccurrences aa=new uniqueOccurrences();
        aa.uniqueOccurrences(a);
    }

}
