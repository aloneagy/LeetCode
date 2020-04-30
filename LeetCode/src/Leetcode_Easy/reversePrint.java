package Leetcode_Easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-04-29 18:01
 * @description:this is the class for
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 *
 *
 * 示例 1：
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 **/

public class reversePrint {
    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> number=new ArrayList<>();
        while (head!=null){
            number.add(head.val);
            head=head.next;
        }
        int[] a=new int[number.size()];
        for(int i=number.size()-1;i>=0;i--){
            a[Math.abs(number.size()-i-1)]=number.get(i);
        }
        return a;
    }
}
