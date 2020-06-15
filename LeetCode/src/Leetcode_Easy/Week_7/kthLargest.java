package Leetcode_Easy.Week_7;

/**
 * @author ynz
 * create at 2020-06-08 15:39
 * @description:this is the class for
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * 输出: 4
 * 示例 2:
 *
 * 输入: root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 * 输出: 4
 **/

public class kthLargest {
    int count=0;
    int value=0;
    public int kthLargest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        kthLargest(root.right,k);
        count++;
        if(count==k){
            value= root.val;
        }
        kthLargest(root.left,k);
        return value;
    }
}
