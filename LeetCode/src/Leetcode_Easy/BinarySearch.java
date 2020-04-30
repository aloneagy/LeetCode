package Leetcode_Easy;

/**
 * @author ynz
 * create at 2020-04-26 15:45
 * @description:this is the class for
 **/

public class BinarySearch {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }else if(root.val>val){
            return searchBST(root.left,val);
        }else if(root.val<val){
            return searchBST(root.right,val);
        }
        return null;
    }

}
