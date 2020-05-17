package Leetcode_Easy.Week_3;

/**
 * @author ynz
 * create at 2020-05-13 23:42
 * @description:this is the class for
 * 翻转一棵二叉树。
 *
 * 示例：
 *
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 **/

public class invertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        TreeNode tem=root.left;
        root.left=root.right;
        root.right=tem;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
