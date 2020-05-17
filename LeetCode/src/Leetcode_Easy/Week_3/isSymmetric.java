package Leetcode_Easy.Week_3;

/**
 * @author ynz
 * create at 2020-05-13 14:14
 * @description:this is the class for
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 *  
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *  
 *
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 **/

public class isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return is(root.left,root.right);
    }
    public  boolean is(TreeNode one,TreeNode two){
        if(one==null&&two==null) return true;
        if(one==null||two==null) return false;
        if(one.val!=two.val) return false;
        return is(one.left,two.right)&&is(one.right,two.left);
    }
}
