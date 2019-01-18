package com.android.leetcode;

import java.util.HashMap;


public class LeetCode1{


    public static void main(String[] args){
        System.out.print(twoSum(new int[]{2, 7, 11, 15},9));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{0, 0};
    }

}
