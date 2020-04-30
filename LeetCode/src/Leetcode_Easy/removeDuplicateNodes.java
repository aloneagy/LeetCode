package Leetcode_Easy;

import java.util.ArrayList;

/**
 * @author ynz
 * create at 2020-04-26 19:55
 * @description:this is the class for
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 *
 * 示例1:
 *
 *  输入：[1, 2, 3, 3, 2, 1]
 *  输出：[1, 2, 3]
 **/

public class removeDuplicateNodes {
    public ListNode removeDuplicateNodes(ListNode head) {
        ArrayList<Integer> a=new ArrayList<>();
        if(head==null){
            return head;
        }else{
            a.add(head.val);
        }
        ListNode tem=head;
        while (tem.next!=null){
            if(a.contains(tem.next.val)){
                tem.next=tem.next.next;
            }else {
                a.add(tem.next.val);
                tem=tem.next;
            }
        }

        return head;
    }
}
