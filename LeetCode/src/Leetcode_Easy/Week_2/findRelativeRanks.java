package Leetcode_Easy.Week_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author ynz
 * create at 2020-05-05 01:28
 * @description:this is the class for
 * 给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”（"Gold Medal", "Silver Medal", "Bronze Medal"）。
 *
 * (注：分数越高的选手，排名越靠前。)
 *
 * 示例 1:
 *
 * 输入: [5, 4, 3, 2, 1]
 * 输出: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 * 解释: 前三名运动员的成绩为前三高的，因此将会分别被授予 “金牌”，“银牌”和“铜牌” ("Gold Medal", "Silver Medal" and "Bronze Medal").
 * 余下的两名运动员，我们只需要通过他们的成绩计算将其相对名次即可。
 **/

public class findRelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        TreeMap<Integer,Integer> hashMap=new TreeMap<>();
        String[] aa=new String[nums.length];
        for (int i = 0; i <nums.length; i++) {
            hashMap.put(nums[i],i);
        }
        Arrays.sort(nums);
        int j=nums.length-1;
        for (int i = 0; i < aa.length; i++) {
            if(j>=0){
                if(j==nums.length-1){
                    aa[hashMap.get(nums[j])]="Gold Medal";
                }else if(j==nums.length-2){
                    aa[hashMap.get(nums[j])]="Silver Medal";
                }else if(j==nums.length-3){
                    aa[hashMap.get(nums[j])]="Bronze Medal";
                }else {
                    aa[hashMap.get(nums[j])]=i+1+"";
                }
                j--;
            }
        }
        return aa;
    }
}
