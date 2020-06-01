package Leetcode_Easy.Week_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ynz
 * create at 2020-05-20 00:08
 * @description:this is the class for
 **/

public class getAllElements {
    ArrayList<Integer> res=new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        dfs(root1);
        dfs(root2);
        Collections.sort(res);
        return res;
    }
    public void dfs(TreeNode root){
        if(root==null) return;
        res.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}
