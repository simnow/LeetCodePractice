package com.android.leetcode;

/**
 * @CLassName: LeetCode35
 * @Description: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 * https://leetcode-cn.com/problems/search-insert-position/
 * @author: 梁振
 * @date: 2019/1/18 3:25 PM
 */
public class LeetCode35 {

    public static void main(String[] args) {

    }


    public static boolean binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int mid = (left + right) / 2;
        while (array[mid] != target && right > left) {
            if (array[mid] > target) {
                right = mid - 1;
            } else if (array[mid] < target) {
                left = mid + 1;
            }
            mid = (left + right) / 2;
            //判断在缩小范围后，新的left或者right是否会将target排除
            if (array[right] < target) {
                break;//若缩小后right比target小，即target不在数组中
            } else if (array[left] > target) {
                break;//若缩小后left比target大，即target不在数组中
            }
        }
        return (array[mid] == target);
    }

    /**
     * @param nums   假定该数组升序排列
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        if (nums[mid] == target) return mid;
        int index = 0;
        while (nums[mid] != target && right > left) {
                if (nums[mid]>target){

                }
        }

        return index;
    }
}
