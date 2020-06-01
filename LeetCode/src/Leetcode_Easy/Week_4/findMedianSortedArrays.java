package Leetcode_Easy.Week_4;

/**
 * @author ynz
 * create at 2020-05-24 00:18
 * @description:this is the class for
 **/

public class findMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if (n > m) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int L1 = 0, L2 = 0, R1 = 0, R2 = 0, cut1, cut2, begin = 0, end = n;
        while (begin <= end) {
            cut1 = (end + begin + 1) / 2;
            cut2 = (m + n) / 2 - cut1;
            L1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            R1 = (cut1 == n) ? Integer.MAX_VALUE : nums1[cut1];
            L2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            R2 = (cut2 == m) ? Integer.MAX_VALUE : nums2[cut2];
            if (L1 > R2) {
                end = cut1 - 1;
            } else if (L2 > R1) {
                begin = cut1 + 1;
            } else {
                break;
            }
        }
        if ((m + n) % 2 == 1) {
            return Math.min(R1, R2);
        } else {
            return (Math.max(L1, L2) + Math.min(R1, R2)) / 2.0;
        }
    }
}
