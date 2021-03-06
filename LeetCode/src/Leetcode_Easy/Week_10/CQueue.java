package Leetcode_Easy.Week_10;

import java.util.Stack;

/**
 * @author ynz
 * create at 2020-06-30 00:29
 * @description:this is the class for
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 *  
 *
 * 示例 1：
 *
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 * 示例 2：
 *
 * 输入：
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]
 * 输出：[null,-1,null,null,5,2]
 **/

public class CQueue {
    Stack<Integer> s1=new Stack();
    Stack<Integer> s2=new Stack();
    public CQueue() {

    }

    public void appendTail(int value) {
        s1.add(value);
    }

    public int deleteHead() {
        if(s2.isEmpty()){
            if(s1.isEmpty()) return -1;
            while (!s1.isEmpty()){
                s2.add(s1.pop());
            }
            return s2.pop();
        }else return s2.pop();
    }

}
