package Leetcode_Easy.Week_8;

/**
 * @author ynz
 * create at 2020-06-21 00:37
 * @description:this is the class for
 * 给定一个非空二叉树，返回其最大路径和。
 *
 * 本题中，路径被定义为一条从树中任意节点出发，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 *
 *        1
 *       / \
 *      2   3
 *
 * 输出: 6
 * 示例 2:
 *
 * 输入: [-10,9,20,null,null,15,7]
 *
 *    -10
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 输出: 42
 **/

public class maxPathSum {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxValue(root);
        return max;
    }
    public int maxValue(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=Math.max(maxValue(root.left),0);
        int right=Math.max(maxValue(root.right),0);
        int curmax=root.val+left+right;
        max=Math.max(curmax,max);
        return Math.max(left,right)+root.val;
    }
}
