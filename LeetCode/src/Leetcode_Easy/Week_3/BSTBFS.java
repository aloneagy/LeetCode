package Leetcode_Easy.Week_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ynz
 * create at 2020-05-13 01:21
 * @description:this is the class for
 * 广度优先
 **/

public class BSTBFS {
    public List<Integer> bfs(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            arrayList.add(poll.val);
            if (poll.left != null) {
                queue.add(poll.left);
            }
            if (poll.right != null) {
                queue.add(poll.right);
            }
        }
        return arrayList;
    }
}
