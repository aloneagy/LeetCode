package Leetcode_Easy.Week_9;

import java.util.ArrayList;

/**
 * @author ynz
 * create at 2020-06-25 23:46
 * @description:this is the class for
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
