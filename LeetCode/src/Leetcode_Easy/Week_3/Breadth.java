package Leetcode_Easy.Week_3;

import java.util.*;

/**
 * @author ynz
 * create at 2020-05-17 15:00
 * @description:this is the class for
 **/

public class Breadth {
    public int Breadth(TreeNode root) {
        int max = Integer.MIN_VALUE;
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            if (count > max) {
                max = count;
            }
            while (count > 0) {
                TreeNode poll = queue.poll();
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
                count--;
            }
        }
        return max;
    }

    public List<Integer> common(int[] a, int[] b){
        HashMap<Integer,Integer> aMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <a.length ; i++) {
            aMap.put(a[i],aMap.getOrDefault(a[i],0)+1);
        }
        for (int i = 0; i <b.length; i++) {
            if (aMap.getOrDefault(b[i],0) > 0) {
                arrayList.add(b[i]);
                aMap.put(b[i], aMap.get(b[i]) - 1);
            }
        }

        return arrayList;
    }

    public List<Integer> merge(int[] a,int[] b){
        int i = 0;
        int j = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (i < a.length && j < b.length){
            if (a[i] < a[j]){
                i++;
            } else if(a[i] > a[j]){
                j++;
            } else {
                arrayList.add(a[i]);
                i++;
                j++;
            }
        }
        return arrayList;
    }
}
