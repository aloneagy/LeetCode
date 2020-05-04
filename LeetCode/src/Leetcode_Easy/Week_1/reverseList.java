package Leetcode_Easy.Week_1;

/**
 * @author ynz
 * create at 2020-04-27 20:29
 * @description:this is the class for
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 **/

public class reverseList {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head, pre = null, next = null;
        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
