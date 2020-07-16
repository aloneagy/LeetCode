package Leetcode_Easy.Week_9;

/**
 * @author ynz
 * create at 2020-06-26 14:57
 * @description:this is the class for
 * 实现一个函数，检查一棵二叉树是否为二叉搜索树。
 *
 * 示例 1:
 * 输入:
 *     2
 *    / \
 *   1   3
 * 输出: true
 * 示例 2:
 * 输入:
 *     5
 *    / \
 *   1   4
 *      / \
 *     3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 *      根节点的值为 5 ，但是其右子节点值为 4 。

 **/

public class isValidBST {
    public boolean isValidBST(TreeNode root) {
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValid(TreeNode root,long min,long max){
        return root==null || (root.val>min&&root.val<max)&&isValid(root.left,min,root.val)&&isValid(root.right,root.val,max);
    }
}
