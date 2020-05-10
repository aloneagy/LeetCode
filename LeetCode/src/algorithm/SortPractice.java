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
    //tested
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


    public int[] quickSort(int[] arr,int low,int high) {
        int p,i,j,temp;
        if(low<high) {
            //p就是基准数,这里就是每个数组的第一个
            p = arr[low];
            i = low;
            j = high;
            while (i < j) {
                //右边当发现小于p的值时停止循环
                while (arr[j] >= p && i < j) {
                    j--;
                }

                //这里一定是右边开始，上下这两个循环不能调换（下面有解析，可以先想想）

                //左边当发现大于p的值时停止循环
                while (arr[i] <= p && i < j) {
                    i++;
                }

                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            arr[low] = arr[i];//这里的arr[i]一定是停小于p的，经过i、j交换后i处的值一定是小于p的(j先走)
            arr[i] = p;
            quickSort(arr, low, j - 1);  //对左边快排
            quickSort(arr, j + 1, high); //对右边快排
        }
         return arr;

    }
    //tested
    public int[] bubbleSort(int arr[],int n){//n为长度
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
        return arr;
    }
    //tested
    public int[] selectSort(int[] arr,int n){
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
        return arr;
    }
    public  int[] insertSort(int[] a) {
        int i, j, insertNote;// 要插入的数据
        for (i = 1; i < a.length; i++) {// 从数组的第二个元素开始循环将数组中的元素插入
            insertNote = a[i];// 设置数组中的第2个元素为第一次循环要插入的数据
            j = i - 1;
            while (j >= 0 && insertNote < a[j]) {
                a[j + 1] = a[j];// 如果要插入的元素小于第j个元素,就将第j个元素向后移动
                j--;
            }
            a[j + 1] = insertNote;// 直到要插入的元素不小于第j个元素,将insertNote插入到数组中
        }
        return a;
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

    public int[]  mergeSort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            // 左边
            mergeSort(a, low, mid);
            // 右边
            mergeSort(a, mid + 1, high);
            // 左右归并
            merge(a, low, mid, high);
        }
        return a;
    }

    public static void sort(int []arr){
        //1.构建大顶堆
        for(int i=arr.length/2-1;i>=0;i--){
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr,i,arr.length);
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for(int j=arr.length-1;j>0;j--){
            swap(arr,0,j);//将堆顶元素与末尾元素进行交换
            adjustHeap(arr,0,j);//重新对堆进行调整
        }

    }

    /**
     * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
     */
    public static void adjustHeap(int []arr,int i,int length){
        int temp = arr[i];//先取出当前元素i
        for(int k=i*2+1;k<length;k=k*2+1){//从i结点的左子结点开始，也就是2i+1处开始
            if(k+1<length && arr[k]<arr[k+1]){//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if(arr[k] >temp){//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;//将temp值放到最终的位置
    }

    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void main(String[] args) {
        SortPractice a=new SortPractice();
        int []arr = {3,1,4,2,8,5,9,7,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] aa=new int[]{4,3,5,6,7,9};
//        int[] ints = a.insertSort(aa);
//        System.out.println(Arrays.toString(ints));
//        int[] ints1 = a.mergeSort(aa, 0, aa.length - 1);
//        System.out.println(Arrays.toString(ints1));
//        int[] ints2 = a.quickSort(aa, 0, aa.length - 1);
//        System.out.println(Arrays.toString(aa));
    }



}
