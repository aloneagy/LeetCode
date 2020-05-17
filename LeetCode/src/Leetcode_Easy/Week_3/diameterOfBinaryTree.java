package Leetcode_Easy.Week_3;

import javax.swing.plaf.metal.MetalTheme;

/**
 * @author ynz
 * create at 2020-05-12 18:08
 * @description:this is the class for
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 * <p>
 *  
 * <p>
 * 示例 :
 * 给定二叉树
 * <p>
 * 1
 * / \
 * 2   3
 * / \
 * 4   5
 * 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
 **/

public class diameterOfBinaryTree {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        getHeight(root);
        return max;
    }

    public int getHeight(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        max = Math.max(rightHeight + leftHeight, max);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
