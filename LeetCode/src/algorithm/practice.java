package algorithm;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-05-04 12:30
 * @description:this is the class for
 **/

public class practice {
    public void merge(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            int i = low;
            int j = mid + 1;
            int k = 0;
            int[] tem = new int[high - low + 1];
            while (i <= mid && j < high) {
                if (arr[i] < arr[j]) {
                    tem[k++] = arr[i++];
                } else {
                    tem[k++] = arr[j++];
                }
            }
            while (i <= mid) {
                tem[k++] = arr[i++];
            }
            while (i < high) {
                tem[k++] = arr[j++];
            }
            for (int l = 0; l < tem.length; l++) {
                arr[low + l] = tem[l];
            }
        }
    }

    public int[] mergeSort(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, high);
        }
        return arr;
    }


    public static void main(String[] args) {
        practice a = new practice();
        int[] aa = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] bb = new int[]{4, 3, 5, 7, 8, 1, 9, 10, 19};
//        int[] heapsort = a.Heapsort(bb);
//        System.out.println(Arrays.toString(heapsort));
//        int[] ints = a.insertSort(bb);
//        System.out.println(Arrays.toString(ints));
//        int i = a.binarySearch(aa, 0, aa.length - 1, 3);
//        System.out.println(i);
//        int[] ints = a.bubbleSort(bb);
//        System.out.println(Arrays.toString(ints));
//        int[] ints1 = a.selectSort(bb);
//        System.out.println(Arrays.toString(ints1));
//        int[] ints = a.mergeSort(bb, 0, bb.length - 1);
//        System.out.println(Arrays.toString(ints));
//        int[] ints = a.quickSort(bb, 0, bb.length - 1);
//        System.out.println(Arrays.toString(ints));
    }
}
