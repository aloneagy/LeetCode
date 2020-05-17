package Leetcode_Easy.Week_3;

/**
 * @author ynz
 * create at 2020-05-14 00:45
 * @description:this is the class for
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 *  
 *
 * 示例 1：
 *
 * 输入：root = [1,2,2,3,4,4,3]
 * 输出：true
 * 示例 2：
 *
 * 输入：root = [1,2,2,null,3,null,3]
 * 输出：false
 **/

public class isSymmetric2 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return true&&is(root.right,root.left);
    }
    public boolean is(TreeNode one,TreeNode two){
        if(one==null&&two==null) return true;
        if(one==null||two==null) return false;
        if(one.val!=two.val){
            return false;
        }
        return true&&is(one.left,two.right)&&is(one.right,two.left);
    }
}
