package Leetcode_Easy.Week_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ynz
 * create at 2020-05-13 00:32
 * @description:this is the class for
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 *  
 *
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 **/

public class levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<List<Integer>> res=new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> aa=new ArrayList<>();
            int count=queue.size();
            while (count>0){
                TreeNode newNode=queue.poll();
                aa.add(newNode.val);
                if(newNode.left!=null){
                    queue.add(newNode.left);
                }
                if(newNode.right!=null){
                    queue.add(newNode.right);
                }
                count--;
            }
            res.add(aa);
        }
        return res;
    }
}
