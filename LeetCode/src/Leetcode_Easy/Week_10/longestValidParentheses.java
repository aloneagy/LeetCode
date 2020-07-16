package Leetcode_Easy.Week_10;

import java.util.Stack;

/**
 * @author ynz
 * create at 2020-07-04 00:12
 * @description:this is the class for
 **/

public class longestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack =new Stack<>();
        int count=0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                stack.push(i);
            }else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else {
                    count=Math.max(count,i-stack.peek());
                }
            }
        }
        return count;
    }
}
