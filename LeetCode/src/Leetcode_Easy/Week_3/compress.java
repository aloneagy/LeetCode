package Leetcode_Easy.Week_3;

/**
 * @author ynz
 * create at 2020-05-15 23:25
 * @description:this is the class for
 * 给定一组字符，使用原地算法将其压缩。
 *
 * 压缩后的长度必须始终小于或等于原数组长度。
 *
 * 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
 *
 * 在完成原地修改输入数组后，返回数组的新长度。
 *
 *  
 *
 * 进阶：
 * 你能否仅使用O(1) 空间解决问题？
 *
 *  
 *
 * 示例 1：
 *
 * 输入：
 * ["a","a","b","b","c","c","c"]
 *
 * 输出：
 * 返回6，输入数组的前6个字符应该是：["a","2","b","2","c","3"]
 *
 * 说明：
 * "aa"被"a2"替代。"bb"被"b2"替代。"ccc"被"c3"替代。
 **/

public class compress {
    public int compress(char[] chars) {
        if(chars.length==0) return 0;
        if(chars.length==1) return 1;
        int j=0;
        int count=0;
        for (int k = 1; k <=chars.length ; k++) {
            count++;
            if(k==chars.length||chars[k]!=chars[j]){
                j++;
                if(count!=1){
                    for(char c:(new String(""+count).toCharArray())){
                        chars[j++]=c;
                    }
                }
                if(k==chars.length) break;
                chars[j]=chars[k];
                count=0;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        compress a=new compress();
        char[] aa=new char[]{'a','b','b','b','c','c','c'};
        a.compress(aa);
    }
}
