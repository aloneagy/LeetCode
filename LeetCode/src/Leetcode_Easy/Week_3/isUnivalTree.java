package Leetcode_Easy.Week_3;

import java.util.ArrayList;

/**
 * @author ynz
 * create at 2020-05-14 00:22
 * @description:this is the class for
 * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
 *
 * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
 *
 *  
 *
 * 示例 1：
 *
 *
 *
 * 输入：[1,1,1,1,1,null,1]
 * 输出：true
 * 示例 2：
 *
 *
 *
 * 输入：[2,2,2,5,2]
 * 输出：false

 **/

public class isUnivalTree {
    ArrayList<Integer> res=new ArrayList<>();
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        if(root.left==null&&root.right==null) return true;
        dfs(root);
        for (int i = 1; i <res.size() ; i++) {
            if(res.get(i)!=res.get(i-1)){
                return false;
            }
        }
        return true;
    }
    public void dfs(TreeNode root){
        if(root!=null) res.add(root.val);
        if(root.left!=null){
            dfs(root.left);
        }
        if(root.right!=null){
            dfs(root.right);
        }
    }
}
