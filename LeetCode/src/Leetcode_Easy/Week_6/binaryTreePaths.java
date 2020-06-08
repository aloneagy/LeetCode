package Leetcode_Easy.Week_6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ynz
 * create at 2020-06-06 00:37
 * @description:this is the class for
 *
 **/

public class binaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res =new ArrayList<>();
        path("",root,res);
        return res;
    }
    public void path(String cur,TreeNode root,List<String> res){
        if(root == null) return;
        cur+=root.val;
        if(root.left==null & root.right ==null){
            res.add(cur);
        }else {
            path(cur+"->",root.left,res);
            path(cur+"->",root.right,res);
        }
    }
}
