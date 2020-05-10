package Leetcode_Easy.Week_2;

import java.util.*;

/**
 * @author ynz
 * create at 2020-05-04 23:19
 * @description:this is the class for
 **/

public class isValidBST {
    List<Integer> a=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        dfs(root);
        for (int i = 0; i <a.size()-1 ; i++) {
            if(a.get(i)>=a.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public void dfs(TreeNode root){
        if(root==null){
            return;
        }
        dfs(root.left);
        a.add(root.val);
        dfs(root.right);
    }
}
