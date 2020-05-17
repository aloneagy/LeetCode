package Leetcode_Easy.Week_3;

/**
 * @author ynz
 * create at 2020-05-11 23:59
 * @description:this is the class for
 **/

public class isPalindrome {
    public boolean isPalindrome(ListNode head) {
        if(head==null ||head.next==null){
            return true;
        }
        ListNode first=head;
        ListNode second=head;
        while (first.next!=null&&first.next.next!=null){
            first=first.next.next;
            second=second.next;
        }
        second=reverse(second.next);
        while (second!=null){
            if(head.val!=second.val) return false;
            second=second.next;
            head=head.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode pre=null;
        ListNode cur=head;
        ListNode nex;
        while (cur!=null){
            nex=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nex;
        }
        return pre;
    }
}
