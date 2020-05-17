package Leetcode_Easy.Week_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ynz
 * create at 2020-05-16 19:04
 * @description:this is the class for
 **/

public class Test {
    public List<Integer> bfs(TreeNode root){
        if(root==null) return null;
        ArrayList<Integer> res=new ArrayList<>();
        Queue<TreeNode> tree=new LinkedList<>();
        tree.add(root);
        while (!tree.isEmpty()){
            TreeNode poll = tree.poll();
            res.add(poll.val);
            if(poll.left!=null){
                tree.add(poll.left);
            }
            if(poll.right!=null){
                tree.add(poll.right);
            }
        }
        return res;
    }
    public boolean find(TreeNode root,int target){
        if(root==null) return false;
        if(root.val==target){
            return true;
        }else if(root.val>target){
            return find(root.left,target);
        }else {
            return find(root.right,target);
        }
    }
    public TreeNode insert(TreeNode root,int value){
        if(root==null) return new TreeNode(value);
        if(root.val>value){
            if(root.left==null){
                root.left=new TreeNode(value);
            }else {
                return insert(root.left,value);
            }
        }else {
            if(root.right==null){
                root.right=new TreeNode(value);
            }else {
                return insert(root,value);
            }
        }
        return root;
    }
    public void change(TreeNode root,int origin,int changed){
        if(root==null) return;
        if(root.val==origin){
            root.val=changed;
        }else if(root.val>origin){
            change(root.left,origin,changed);
        }else {
            change(root.right,origin,changed);
        }
    }
    public TreeNode delete(TreeNode root,int deleteValue){
        if(root==null) return null;
        if(root.val>deleteValue){
            return delete(root.left,deleteValue);
        }else if(root.val<deleteValue){
            return delete(root.right,deleteValue);
        }else {
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else {
                TreeNode tem=root.right;
                while (tem.left!=null){
                    tem=tem.left;
                }
                int swap=tem.val;
                tem.val=root.val;
                root.val=swap;
                root.right=delete(root.right,deleteValue);
            }
        }
        return root;
    }
}
