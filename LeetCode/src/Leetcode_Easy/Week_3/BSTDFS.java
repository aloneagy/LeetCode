package Leetcode_Easy.Week_3;

import java.util.ArrayList;

/**
 * @author ynz
 * create at 2020-05-14 13:49
 * @description:this is the class for
 **/

public class BSTDFS {
    ArrayList<Integer> pre=new ArrayList<>();
    ArrayList<Integer> in=new ArrayList<>();
    ArrayList<Integer> post=new ArrayList<>();
    public void preOrder(TreeNode root){
        if(root==null) return ;
        pre.add(root.val);
        if(root.left!=null){
             preOrder(root.left);
        }
        if(root.right!=null){
             preOrder(root.right);
        }
    }

    public void inOrder(TreeNode root){
        if(root==null) return ;
        if(root.left==null){
             inOrder(root.left);
        }
        in.add(root.val);
        if(root.right!=null){
             inOrder(root.right);
        }

    }

    public void postOrder(TreeNode root){
        if(root==null) return;
        if(root.left!=null){
             postOrder(root.left);
        }
        if(root.right!=null){
             postOrder(root.right);
        }
        post.add(root.val);
    }
}
