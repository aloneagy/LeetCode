package Leetcode_Easy.Week_6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ynz
 * create at 2020-06-06 00:21
 * @description:this is the class for
 **/

public class buildArray {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int i = 0;
        for (int j = 1; j <= n; j++) {
            if(i==target.length){
                break;
            }
            if(target[i]==j){
                res.add("Push");
                i++;
            }else {
                res.add("Push");
                res.add("Pop");
            }
        }
        return res;
    }
}
