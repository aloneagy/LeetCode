package algorithm;

/**
 * @author ynz
 * create at 2020-05-03 15:22
 * @description:this is the class for
 **/

public class Test1 {
    public void bubble_sort(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    int tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
    }
    public void sort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int min=Integer.MAX_VALUE;
            int k=0;
            for (int j = i+1; j <arr.length ; j++) {
                if(min>=arr[j]){
                    min=arr[j];
                    k=j;
                }
            }
            int tem=arr[i];
            arr[i]=arr[k];
            arr[k]=tem;
        }
    }
    public int[] merge(int[] arr1,int[] arr2){
        int[] arr=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<arr1.length||j<arr2.length){
            if(i>=arr1.length){
                arr[k]=arr2[j];
                j++;
            }else if(j>=arr2.length){
                arr[k]=arr1[i];
                i++;
            }else if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
            }else {
                arr[k]=arr2[j];
                j++;
            }
            k++;

        }
        return arr;

    }
}
