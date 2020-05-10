package Leetcode_Easy.Week_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//
///**
// * @author ynz
// * create at 2020-05-05 00:05
// * @description:this is the class for
// * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
// *
// * 注意：如果对空文本输入退格字符，文本继续为空。
// *
// *  
// *
// * 示例 1：
// *
// * 输入：S = "ab#c", T = "ad#c"
// * 输出：true
// * 解释：S 和 T 都会变成 “ac”。
// * 示例 2：
// *
// * 输入：S = "ab##", T = "c#d#"
// * 输出：true
// * 解释：S 和 T 都会变成 “”。
// * 示例 3：
// *
// * 输入：S = "a##c", T = "#a#c"
// * 输出：true
// * 解释：S 和 T 都会变成 “c”。
// * 示例 4：
// *
// * 输入：S = "a#c", T = "b"
// * 输出：false
// * 解释：S 会变成 “c”，但 T 仍然是 “b”。
// **/
//
public class backspaceCompare {
    public boolean backspaceCompare(String S, String T) {
        char[] split = S.toCharArray();
        char[] split2 = T.toCharArray();
        Stack<Character> one =new Stack<>();
        Stack<Character> two =new Stack<>();
        StringBuffer oneS=new StringBuffer();
        StringBuffer twoS=new StringBuffer();
        for (int i = 0; i <split.length ; i++) {
            if(split[i]=='#'&&!one.isEmpty()){
                one.pop();
            }
            if(split[i]!='#'){
                one.add(split[i]);
            }
        }
        for (int i = 0; i <split2.length ; i++) {
            if(split2[i]=='#'&&!two.isEmpty()){
                two.pop();
            }
            if(split2[i]!='#'){
                two.add(split2[i]);
            }

        }
        while (!one.isEmpty()){
            oneS.append(one.pop());
        }
        while (!two.isEmpty()){
            twoS.append(two.pop());
        }
        return oneS.toString().equals(twoS.toString());
    }

    public static void main(String[] args) {
        backspaceCompare a=new backspaceCompare();
        boolean b = a.backspaceCompare("ab#c", "ab#c");
        System.out.println(b);
    }
}
