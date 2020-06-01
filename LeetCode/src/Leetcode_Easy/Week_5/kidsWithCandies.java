package Leetcode_Easy.Week_5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ynz
 * create at 2020-05-31 23:25
 * @description:this is the class for
 **/

public class kidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        if(candies.length==0) return new ArrayList<Boolean>();
        ArrayList<Boolean> arrayList=new ArrayList<>();
        int max=candies[0];
        for (int i = 1; i <candies.length ; i++) {
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for (int i = 0; i <candies.length ; i++) {
            if(candies[i]+extraCandies>=max){
                arrayList.add(true);
            }else {
                arrayList.add(false);
            }
        }
        return arrayList;
    }
}
