package algorithm;

import java.sql.Statement;
import java.util.*;

/**
 * @author ynz
 * create at 2020-04-28 15:19
 * @description:this is the class for
 **/

public class ListTest {
    //删除最后一个节点
    public ListNode DeleteLast(ListNode first){
        if(first==null) return first;
        ListNode cur=first;
        while (cur!=null){
            if(cur.next==null){
                cur.next=cur.next.next;
                break;
            }
            cur=cur.next;
        }
        return first;
    }
    //查看是否链表中值为k的节点
    public boolean find(ListNode list,int k){
        if(list==null) return false;
        while (list!=null){
            if(list.val==k){
                return true;
            }
            list=list.next;
        }
        return false;
    }
    //将两个链表节点最为参数，第二个节点插入链表并使之称为第一个链表的后续节点
    public ListNode insertAfter(ListNode first,ListNode second){
        if(first==null) return second;
        if(second==null) return first;
        ListNode one =first;
        while (one.next!=null){
            one=one.next;
        }
        one.next=second;
        return first;

    }
    //删除后续节点（如果为空什么都不做）
    public ListNode removeAfter(ListNode list){
        if(list==null) return null;
        list.next=null;
        return list;

    }
    //返回节点最大值,链表为空返回0
    public int max(ListNode list){
        if(list==null) return 0;
        int max=Integer.MIN_VALUE;
        while (list!=null){
            if(list.val>max){
                max=list.val;
            }
            list=list.next;
        }
        return max;

    }
    //递归做上面的题
    public int max2(ListNode listNode){
        if(listNode.next==null) return listNode.val;
        int max=max2(listNode.next);
        return listNode.val>max ? listNode.val:max;

    }
    //用环形链表实现Queue，环形链表没有任何节点连接为空，只要链表非空则last.next的值为first,只能用一个Node的实例变量（list）
    public void LinklisttoQueue(ListNode first){
        ListNode cur=first;
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=first;
    }
    //反转链表
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
    //编写一个QUEUE接受参数k并输出倒数第k个元素
    public int GetK(Queue<Integer> queue,int k){
        while (k!=0){
            queue.poll();
            k--;
        }
        return queue.poll();

    }

    //QUEUE删除第k个元素
    public Queue delete(Queue queue,int k){
        Stack stack=new Stack();
        if(k==0) {
            queue.poll();
            return queue;
        }
        while (k!=0){
            stack.push(queue.poll());
            k--;
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
        return queue;

    }

    //复制队列
    public void copyArray(Queue one,Queue two){
        one.addAll(two);
    }


    //复制栈
    public Stack CopyStack(Stack stack){
        Stack newStack=new Stack();
        Stack newStack2=new Stack();
        while (!stack.isEmpty()){
            newStack.push(stack.pop());
        }
        while (!newStack.isEmpty()){
            newStack2.push(newStack.pop());
        }
        return newStack2;
    }

    //两个栈实现一个队列

    //一个队列实现栈


}
