package algorithm;

/**
 * @author ynz
 * create at 2020-04-30 18:20
 * @description:this is the class for
 **/

public class quick_sort {
    public void sort(int left,int right,int[] array) {
        if (left>=right) return ;//终止条件
        int start=left;
        int end=right;
        int flag=left;//基准为左边的第一个数
        while(left<right) {
            while ((left<right)&&(array[right]>=array[flag])) {
                right--;//从右边搜索
            }
            if (array[right]<array[flag]) {//如果遇到右边的值比基准树小，就交换两个的值
                int tmp=array[right];
                array[right]=array[flag];
                array[flag]=tmp;
                flag=right;
            }
            while ((left<right)&&(array[left]<=array[flag])) {
                left++;//左边搜索
            }
            if (array[left]>array[flag]) {//如果左边的比基准树大，就交换
                int tmp=array[left];
                array[left]=array[flag];
                array[flag]=tmp;
                flag=left;
            }
        }
        sort(start, left-1, array);
        sort(left+1, end, array);
    }
    public static void sort(Comparable[] a,int lo,int hi){
        if(lo>=hi)return;
        int lt=lo,i=lo+1,gt=hi;
        Comparable v=a[lo];
        while (i<=gt){
            int temp=a[i].compareTo(v);
            if (temp<0) exch(a,lt++,i++);
            else if (temp>0) exch(a,i,gt--);
            else i++;
        }
        sort(a,lo,lt-1);
        sort(a,gt+1,hi);
    }

    private static void exch(Comparable[] a,int i,int j){
        Comparable t;
        t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

}
