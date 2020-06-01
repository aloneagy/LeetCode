package Leetcode_Easy.Week_5;

/**
 * @author ynz
 * create at 2020-05-30 00:33
 * @description:this is the class for
 * 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
 *
 * 求在该柱状图中，能够勾勒出来的矩形的最大面积。
 *
 *  
 *
 *
 *
 * 以上是柱状图的示例，其中每个柱子的宽度为 1，给定的高度为 [2,1,5,6,2,3]。
 *
 *  
 *
 *
 *
 * 图中阴影部分为所能勾勒出的最大矩形面积，其面积为 10 个单位。
 **/

public class largestRectangleArea {
    public int largestRectangleArea(int[] heights) {
        int max=0;
        for (int i = 0; i <heights.length ; i++) {
            int left=i-1;
            int right=i+1;
            int count=1;
            while (left>=0&&heights[left]>=heights[i]){
                left--;
                count++;
            }
            while (right<heights.length&&heights[right]>=heights[i]){
                right++;
                count++;
            }
            max=Math.max(max,count*heights[i]);
        }
        return max;
    }
}
