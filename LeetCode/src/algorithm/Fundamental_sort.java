package algorithm;


/**
 * @author ynz
 * create at 2020-04-28 23:55
 * @description:this is the class for
 **/

public class Fundamental_sort {
    public void quick_sort(int[] array){//选择排序
        int tem=0;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                if(array[i]>array[j]){
                    tem=array[i];
                    array[i]=array[j];
                    array[j]=tem;
                }
            }
        }
    }

    public void insert_sort(int[] arr){//插入排序
        for(int i=0;i<arr.length;i++){
            for(int j=i;j>0&&arr[j]<arr[j-1];j--){
                int tem;
                tem=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=tem;
            }
        }
    }

    public void insert_sort_2(int[] arr){//插入排序，改进版
        for(int i=0;i<arr.length;i++){
            int value=arr[i];
            int j;
            for(j=i;j>0&&arr[j-1]<value;j--){
                arr[j]=arr[j-1];
            }
            arr[j]=value;
        }
    }

    public void shell_sort(int[] arr){//希尔排序
        int j=0;
        int tem=0;
        for(int gap=arr.length/2;gap>0;gap/=2){
            for(int i=gap;i<arr.length;i++){
                tem=arr[i];
                for(j=i-gap;j>0;j-=gap){
                    if(tem<arr[j]){
                        arr[j+gap]=arr[j];
                    }else {
                        break;
                    }
                }
                arr[j+gap]=tem;
            }
        }

    }

}
