package Leetcode_Easy.Week_7;

/**
 * @author ynz
 * create at 2020-06-11 14:26
 * @description:this is the class for
 **/

public class isPalindrome {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode first=head,second=head;
        while (second.next!=null&&second.next.next!=null){
            first=first.next;
            second=second.next.next;
        }
        if(second.next!=null){
            second=second.next;
        }
        ListNode resver=resverse(first.next);
        while (resver!=null){
            if(resver.val==head.val){
                resver=resver.next;
                head=head.next;
            }else {
                return false;
            }
        }
        return true;

    }
    public ListNode resverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode cur=head,pre=null,next;
        while (cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
