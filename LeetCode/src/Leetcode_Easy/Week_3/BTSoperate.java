package Leetcode_Easy.Week_3;

/**
 * @author ynz
 * create at 2020-05-14 14:02
 * @description:this is the class for
 * 二叉树的增删改
 **/

public class BTSoperate {
    public TreeNode find(TreeNode root,int target){
        if(root==null) return null;
        if(root.val==target){
            return root;
        }
        if(root.val>target){
            return find(root.left,target);
        }else {
            return find(root.right,target);
        }
    }


    public  void insert(TreeNode root,int insertValue){
        if(root==null) return;
        if(root.val>insertValue){
            if(root.left==null){
                root.left=new TreeNode(insertValue);
            }else {
                insert(root.left,insertValue);
            }
        }else if(root.val<insertValue){
            if(root.right==null){
                root.right=new TreeNode(insertValue);
            }else {
                insert(root.right,insertValue);
            }
        }
    }
    public void change(TreeNode root,int originValue,int changedValue){
        if(root==null) return;
        if(root.val==originValue){
            root.val=changedValue;
            return;
        }
        if(originValue>root.val){
            change(root.right,originValue,changedValue);
        }else {
            change(root.left,originValue,changedValue);
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
                int swaptem=tem.val;
                tem.val=root.val;
                root.val=swaptem;
                root.right=delete(root.right,deleteValue);
            }
        }
        return root;
    }

}
