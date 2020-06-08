package Leetcode_Easy.Week_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ynz
 * create at 2020-06-06 23:26
 * @description:this is the class for
 * //二叉树每层的平均数
 * 1
 * 2 3
 **/

public class averageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> avg=new ArrayList<>();
        Queue<TreeNode> tree=new LinkedList<>();
        if(root==null){
            return avg;
        }
        tree.add(root);
        while (!tree.isEmpty()){
            double sum=0;
            int count=tree.size();
            double number=tree.size();
            while (count!=0){
                TreeNode poll = tree.poll();
                sum+=poll.val;
                if(poll.left!=null){
                    tree.add(poll.left);
                }
                if(poll.right!=null){
                    tree.add(poll.right);
                }
                count--;
            }
            avg.add(sum/number);
        }
        return avg;
    }
}
