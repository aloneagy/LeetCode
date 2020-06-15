package Leetcode_Easy.Week_7;

/**
 * @author ynz
 * create at 2020-06-13 00:41
 * @description:this is the class for
 **/

public class reverseBits {
    public int reverseBits(int num) {
        String string = Integer.toBinaryString(num);
        String[] split = string.split("0");
        int res=split.length>0 ? split[0].length()+1:1;
        for (int i = 1; i < split.length; i++) {
            res=Math.max(res,split[i].length()+split[i-1].length()+1);
        }
        return res;
    }
}
