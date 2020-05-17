package Leetcode_Easy.Week_3;

/**
 * @author ynz
 * create at 2020-05-11 23:51
 * @description:this is the class for
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 **/

public class deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode a = head;
        while (head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return a;
    }
}
