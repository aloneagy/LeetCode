package Leetcode_Easy.Week_2;

/**
 * @author ynz
 * create at 2020-05-05 16:19
 * @description:this is the class for
 * 给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
 *
 * 示例 1:
 *
 * 输入: S = "loveleetcode", C = 'e'
 * 输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 **/

public class shortestToChar {
    public int[] shortestToChar(String S, char C) {

        char[] chars = S.toCharArray();
        int[] arr=new int[chars.length];
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]==C){
                arr[i]=0;
            }
            int j=i;
            int k=i;
            while (j>=0){
                if(chars[j]==C){
                    break;
                }
                j--;
            }
            while (k<=chars.length-1){
                if(chars[k]==C){
                    break;
                }
                k++;
            }
            if(k>chars.length-1){
                arr[i]=i-j;
            }else if(j<0){
                arr[i]=k-i;
            }else {
                arr[i]=Math.min(i-j,k-i);
            }
        }
        return arr;
    }
}
