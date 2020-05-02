package algorithm;

/**
 * @author ynz
 * create at 2020-04-30 18:20
 * @description:this is the class for
 **/

public class quick_sort {
         public int[] quickSort(int[] arr, int left, int right) {
         if(left < right) {
             int p = partition(arr, left, right); //基准值
             quickSort(arr, left, p - 1);
             quickSort(arr, p + 1, right);
         }
         return arr;
         }

         public int partition(int[] arr, int left, int right) {
             int p = left;           // 根据基准值交换
             int index = left + 1;
             for(int i = index; i <= right; i++) {
                 if(arr[i] < arr[p]) {
                     swap(arr, index, i);
                     index++;
                 }
             }
             swap(arr, p, index - 1);
             return index - 1;
         }

         public void swap(int[] arr, int t1, int t2){
             int temp = arr[t1];  //交换数组元素
             arr[t1] = arr[t2];
             arr[t2] = temp;
         }

}
