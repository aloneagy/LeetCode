package Leetcode_Easy.Week_7;

/**
 * @author ynz
 * create at 2020-06-09 00:41
 * @description:this is the class for
 **/

public class minArray {
    public static int climb(int[] numbers) {
        if (numbers.length == 1) {
            return numbers[0];
        }
        int start = 0;
        int end = numbers.length - 1;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (numbers[mid] > numbers[mid + 1] && numbers[mid] > numbers[mid - 1]) {
                return mid;
            } else if (numbers[mid + 1] > numbers[mid] && numbers[mid] > numbers[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }

    int res = -1;

    public int minArray(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        if (numbers.length == 1) {
            return numbers[0];
        }
        int start = 0;
        int end = numbers.length - 1;
        while (end > start) {
            int mid = start + (end - start) / 2;
            if (numbers[mid] > numbers[end]) {
                start = mid+1;
            } else if (numbers[mid] < numbers[end]) {
                end = mid;
            } else {
                end--;
            }
        }
        return numbers[start];
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 6, 7, 92, 1};
        int climb = climb(a);
        System.out.println(climb);
    }
}
