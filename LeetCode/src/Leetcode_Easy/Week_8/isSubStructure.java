package Leetcode_Easy.Week_8;

/**
 * @author ynz
 * create at 2020-06-21 01:08
 * @description:this is the class for
 **/

public class isSubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null || B==null){
            return false;
        }
        return test(A,B)||isSubStructure(A.right,B)||isSubStructure(A.left,B);
    }
    public boolean test(TreeNode A,TreeNode B){
        if(B ==null){
            return true;
        }
        if(A==null) return false;
        return A.val==B.val&&test(A.left,B.left)&&test(A.right,B.right);
    }
}
