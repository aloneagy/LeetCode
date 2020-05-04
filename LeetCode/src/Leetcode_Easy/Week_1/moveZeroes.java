package Leetcode_Easy.Week_1;

/**
 * @author ynz
 * create at 2020-04-30 19:43
 * @description:this is the class for
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 **/

public class moveZeroes {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
            int j=i+1;
            if(nums[i]==0){
                while (j<nums.length){
                    if(nums[j]!=0){
                        int tem=nums[i];
                        nums[i]=nums[j];
                        nums[j]=tem;
                        break;
                    }
                    j++;
                }
            }
        }
    }

    public static void main(String[] args) {
        moveZeroes a=new moveZeroes();
        int[] aa=new int[]{0,1,0,3,12};
        a.moveZeroes(aa);
    }

}
