package Leetcode_Easy.Week_3;

/**
 * @author ynz
 * create at 2020-05-13 23:40
 * @description:this is the class for
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 *  
 *
 * 例如，给出
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 **/

public class buildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0) return null;
        return build(0,preorder.length-1,preorder,0,inorder.length-1,inorder);

    }
    public TreeNode build(int preStart,int preEnd,int[] pre,int inStart,int inEnd,int[] in){
        if(preStart>preEnd||inStart>inEnd) return null;
        int index=0;
        for (int i = inStart; i<=inEnd ; i++) {
            if(pre[preStart]==in[i]){
                index=i;
                break;
            }
        }
        int size=index-inStart;
        TreeNode root=new TreeNode(pre[preStart]);
        root.left=build(preStart+1,preStart+size,pre,inStart,index-1,in);
        root.right=build(preStart+size+1,preEnd,pre,index+1,inEnd,in);
        return root;
    }

    public static void main(String[] args) {
        buildTree a=new buildTree();
        int[] aa=new int[]{1,2,3};
        int[] bb=new int[]{3,2,1};
        a.build(0,2,aa,0,2,bb);
    }
}
