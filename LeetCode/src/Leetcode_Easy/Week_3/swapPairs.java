package Leetcode_Easy.Week_3;

/**
 * @author ynz
 * create at 2020-05-11 00:26
 * @description:this is the class for
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 *  
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 **/

public class swapPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode next1=head.next;
        head.next=swapPairs(next1.next);
        next1.next=head;
        return next1;
    }
}
