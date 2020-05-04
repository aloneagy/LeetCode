package algorithm;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-05-03 20:20
 * @description:this is the class for
 **/

public class SortPractice {
    //假设进来的是递增序列
    //没找到返回-1；
    public int binarySearch(int[] arr,int left,int right,int target) {
        int mid = (left + right) / 2;
        if (right >= left) {
            if (target == arr[mid]) {
                return mid;
            } else if (arr[mid] > target) {
                return binarySearch(arr, left, mid - 1, target);
            } else {
                return binarySearch(arr, mid + 1, right, target);
            }
        } else {
            return -1;
        }
    }

    
    public void quickSort(int[] a,int left,int right){
        if(left>right){
            return;
        }
        int privotkey=a[left];
        int i=left;
        int j=right;
        while (i<j){
            while (a[j]>=privotkey&&i<j){
                j--;
            }
            a[i]=a[j];
            while (a[i]<=privotkey&&i<j){
                i++;
            }
            a[j]=a[i];
        }
        a[i]=privotkey;
        quickSort(a,left,i-1);
        quickSort(a,i+1,right);
    }
    public void bubbleSort(int arr[],int n){//n为长度
        int i,j,k;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    k=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=k;
                }
            }
        }
    }
    public void selectSort(int[] arr,int n){
        int i,j,min,k;
        for(i=0;i<n-1;i++){
            min=i;//设定第一个数为最小，然后遍历
            for(j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            if(min!=i){
                k=arr[min];
                arr[min]=arr[i];
                arr[i]=k;
            }
        }
    }

    public void insertSort(int arr[],int n){
        int i,j,tem;
        for(i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                tem=arr[i];
                for(j=i;arr[j-1]>tem;j++){
                    arr[j]=arr[j-1];
                }
                arr[j]=tem;
            }
        }
    }

    //归并排序
    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            a[k2 + low] = temp[k2];
        }
    }

    public static void mergeSort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            // 左边
            mergeSort(a, low, mid);
            // 右边
            mergeSort(a, mid + 1, high);
            // 左右归并
            merge(a, low, mid, high);
            System.out.println(Arrays.toString(a));
        }
    }






    //堆排序
    private static void heapSort(int[] arr) {
        // 将待排序的序列构建成一个大顶堆
        for (int i = arr.length / 2; i >= 0; i--){
            heapAdjust(arr, i, arr.length);
        }

        // 逐步将每个最大值的根节点与末尾元素交换，并且再调整二叉树，使其成为大顶堆
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i); // 将堆顶记录和当前未经排序子序列的最后一个记录交换
            heapAdjust(arr, 0, i); // 交换之后，需要重新检查堆是否符合大顶堆，不符合则要调整
        }
    }

    /**
     * 构建堆的过程
     * @param arr 需要排序的数组
     * @param i 需要构建堆的根节点的序号
     * @param n 数组的长度
     */
    private static void heapAdjust(int[] arr, int i, int n) {
        int child;
        int father;
        for (father = arr[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);

            // 如果左子树小于右子树，则需要比较右子树和父节点
            if (child != n - 1 && arr[child] < arr[child + 1]) {
                child++; // 序号增1，指向右子树
            }

            // 如果父节点小于孩子结点，则需要交换
            if (father < arr[child]) {
                arr[i] = arr[child];
            } else {
                break; // 大顶堆结构未被破坏，不需要调整
            }
        }
        arr[i] = father;
    }

    // 获取到左孩子结点
    private static int leftChild(int i) {
        return 2 * i + 1;
    }

    // 交换元素位置
    private static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }



}
