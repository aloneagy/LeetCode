package Leetcode_Easy.Week_2;

/**
 * @author ynz
 * create at 2020-05-05 16:45
 * @description:this is the class for
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 *
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 **/

public class removeElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode a=head;
        if(a.val==val) return a.next;
        while (a.next!=null){
            if(a.next.val==val){
                a.next=a.next.next;
            }
        }
        return head;
    }
}
