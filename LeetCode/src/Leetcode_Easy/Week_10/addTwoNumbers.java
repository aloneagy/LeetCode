package Leetcode_Easy.Week_10;

/**
 * @author ynz
 * create at 2020-06-29 16:17
 * @description:this is the class for
 **/

public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root=new ListNode(0);
        ListNode cur=root;
        int carry=0;
        while (l1!=null || l2!=null || carry!=0){
            int v1= l1==null ? 0:l1.val;
            int v2= l2==null ? 0:l2.val;
            int sum=v1+v2+carry;
            carry=sum/10;
            ListNode sumNode=new ListNode(sum%10);
            cur.next=sumNode;
            cur=sumNode;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l1=l2.next;
        }
        return root.next;
    }
}
