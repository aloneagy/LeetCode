package Leetcode_Easy.Week_4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ynz
 * create at 2020-05-19 15:33
 * @description:this is the class for
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * <p>
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其自底向上的层次遍历为：
 * <p>
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 **/

public class levelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<List<Integer>> sum = new ArrayList<>();
        ArrayList<List<Integer>> res = new ArrayList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            ArrayList<Integer> arrayList = new ArrayList<>();
            while (count > 0) {
                TreeNode poll = queue.poll();
                arrayList.add(poll.val);
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
                count--;
            }
            sum.add(arrayList);
        }
        for (int i = sum.size() - 1; i >= 0; i--) {
            res.add(sum.get(i));
        }
        return res;
    }
}
