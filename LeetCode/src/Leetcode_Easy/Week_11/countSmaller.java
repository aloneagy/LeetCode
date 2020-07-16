package Leetcode_Easy.Week_11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ynz
 * create at 2020-07-11 15:43
 * @description:this is the class for
 * 给定一个整数数组 nums，按要求返回一个新数组 counts。数组 counts 有该性质： counts[i] 的值是  nums[i] 右侧小于 nums[i] 的元素的数量。
 *
 * 示例:
 *
 * 输入: [5,2,6,1]
 * 输出: [2,1,1,0]
 * 解释:
 * 5 的右侧有 2 个更小的元素 (2 和 1).
 * 2 的右侧仅有 1 个更小的元素 (1).
 * 6 的右侧有 1 个更小的元素 (1).
 * 1 的右侧有 0 个更小的元素.
 **/

public class countSmaller {
    private int[] indexs;
    private int[] tmp;
    private int[] res;

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return new ArrayList<>();
        }
        indexs = new int[n];
        tmp = new int[n];
        res = new int[n];
        for (int i = 0; i < n; i++) {
            indexs[i] = i;
        }
        mergeSort(nums, 0, n - 1);
        List<Integer> result = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            result.add(res[i]);
        }
        return result;
    }

    private void mergeSort(int[] nums, int l, int r){
        if (l >= r) {
            return;
        }
        int mid = l + (r - l) / 2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);
        //归并排序的优化
        if (nums[indexs[mid]] > nums[indexs[mid + 1]]) {
            merge(nums, l, mid, r);
        }
    }

    private void merge(int[] nums, int l, int mid, int r) {
        //开始归并，归并的时候左侧数组出列时计算逆序数
        //用临时数组存储排序后的情况
        int i = l;
        int j = mid + 1;
        int k = l;
        while (i <= mid && j <= r) {
            if (nums[indexs[i]] <= nums[indexs[j]]) {
                //计算逆序数
                res[indexs[i]] += j - mid - 1;
                tmp[k++] = indexs[i++];
            } else {
                tmp[k++] = indexs[j++];
            }
        }
        while (i <= mid) {
            //计算逆序数
            res[indexs[i]] += j - mid - 1;
            tmp[k++] = indexs[i++];
        }
        while (j <= r) {
            tmp[k++] = indexs[j++];
        }
        //从临时数组中复制
        for (int x = l; x <= r; x++) {
            indexs[x] = tmp[x];
        }
    }
}
