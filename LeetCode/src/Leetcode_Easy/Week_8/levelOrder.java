package Leetcode_Easy.Week_8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ynz
 * create at 2020-06-15 15:31
 * @description:this is the class for
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
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
 * 返回：
 *
 * [3,9,20,15,7]
 **/

public class levelOrder {
    public int[] levelOrder(TreeNode root) {
        if(root==null){
            return new int[]{};
        }
        ArrayList<Integer> list=new ArrayList<>();
        Queue<TreeNode> tree=new LinkedList<>();
        tree.add(root);
        while (!tree.isEmpty()){
            TreeNode poll = tree.poll();
            list.add(poll.val);
            if(poll.left!=null){
                tree.add(poll.left);
            }
            if(poll.right!=null){
                tree.add(poll.right);
            }
        }
        int[] res=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i]=list.get(i);
        }
        return res;
    }
}
