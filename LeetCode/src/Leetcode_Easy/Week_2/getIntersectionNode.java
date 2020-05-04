package Leetcode_Easy.Week_2;

/**
 * @author ynz
 * create at 2020-05-03 19:25
 * @description:this is the class for
 **/

public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode first=headA;
        ListNode second=headB;
        while (first!=second){
            first=first==null ? headB :first.next;
            second=second==null ?headA :second.next;
        }
        return first;
    }
}
