package Leetcode_Easy;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author ynz
 * create at 2020-04-30 23:43
 * @description:this is the class for
 * 给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 *
 *  
 *
 * 进阶：
 *
 * 如果输入链表不能修改该如何处理？换句话说，你不能对列表中的节点进行翻转。
 *
 *  
 *
 * 示例：
 *
 * 输入：(7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 8 -> 0 -> 7
 **/

public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        ArrayList<ListNode> num = new ArrayList<>();
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        int flow = 0;
        while (!s1.empty() || !s2.empty()||flow!=0) {
            int pop1 = s1.empty() ? 0 : s1.pop();
            int pop2 = s2.empty() ? 0 : s2.pop();
            int sum = pop1 + pop2+flow;
            flow = sum / 10;
            sum = sum % 10;
            num.add(new ListNode(sum));
        }
        for (int i = num.size() - 1; i >= 1; i--) {
            num.get(i).next = num.get(i - 1);
        }
        return num.get(num.size()-1);
    }

}
