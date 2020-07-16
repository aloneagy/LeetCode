package Leetcode_Easy.Week_8;

import java.util.*;

/**
 * @author ynz
 * create at 2020-06-15 15:40
 * @description:this is the class for
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 *
 *  
 *
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
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
 *   [20,9],
 *   [15,7]
 * ]
 **/

public class levelOrder2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> tree=new LinkedList<>();
        tree.add(root);
        int level=1;
        while (!tree.isEmpty()){
            int count=tree.size();
            ArrayList<Integer> tem=new ArrayList<>();
            while (count!=0){
                TreeNode poll = tree.poll();
                tem.add(poll.val);
                if(poll.left!=null){
                    tree.add(poll.left);
                }
                if(poll.right!=null){
                    tree.add(poll.right);
                }
                count--;
            }
            if(level%2==0){
                Collections.reverse(tem);
            }
            list.add(tem);
            level++;
        }
        return list;
    }

}
