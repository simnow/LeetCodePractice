package com.android.leetcode.offer;
//
// Created by $梁振 on 8/21/21.
//

public class Offer53 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = {0,1,2,3,4,4,4,4,5,6,6,9};
        int[] nums = {0};
        System.out.println(solution.search2(nums,4));
        System.out.println(solution.helper(nums,4));
        System.out.println(solution.helper(nums,3));
    }

    public static class Solution {

        public int search(int[] nums, int target) {
            int time = 0;
            if (nums == null) {
                return time;
            }
            int lengh = nums.length;
            int mIndex = lengh / 2;
            if (mIndex <= 1) {
                for (int num : nums) {
                    if (target == num) {
                        time++;
                    }
                }
                return time;
            }
            for (int i = mIndex - 1; i >= 0; i--) {
                if (target == nums[i]) {
                    time++;
                } else {
                    if (target > nums[i]) {
                        break;
                    } else {
                        continue;
                    }
                }
            }

            for (int i = mIndex; i < lengh; i++) {
                if (target == nums[i]) {
                    time++;
                } else {
                    if (target < nums[i]) {
                        break;
                    } else {
                        continue;
                    }
                }
            }

            return time;
        }

        public int search2(int[] nums, int target) {
            return helper(nums, target) - helper(nums, target - 1);
        }
        int helper(int[] nums, int tar) {
            int i = 0, j = nums.length - 1;
            while(i <= j) {
                int m = (i + j) / 2;
                if(nums[m] <= tar) i = m + 1;
                else j = m - 1;
            }
            return i;
        }
    }

    static class Solution2 {

        public int missingNumber(int[] nums) {
            int result=-1;
            if (null==nums){
                return result;
            }
            for (int i = 0; i < nums.length; i++) {
                if (i!=nums[i]){
                    result=i;
                    break;
                }
            }
            return result;
        }

        public int missingNumber2(int[] nums) {
            int i = 0, j = nums.length - 1;
            while(i <= j) {
                int m = (i + j) / 2;
                if(nums[m] == m) i = m + 1;
                else j = m - 1;
            }
            return i;
        }

    }
}
