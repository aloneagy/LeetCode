package Leetcode_Easy.Week_6;

/**
 * @author ynz
 * create at 2020-06-06 17:32
 * @description:this is the class for
 **/

public class checkIfExist {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            int num=arr[i]*2;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]==num&&i!=j){
                    return true;
                }
            }
        }
        return false;
    }
}
