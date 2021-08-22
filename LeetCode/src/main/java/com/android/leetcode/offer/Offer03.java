package com.android.leetcode.offer;
//
// Created by $梁振 on 8/18/21.
//

import java.util.HashSet;
import java.util.Set;

public class Offer03 {

    public static void main(String[] args) {

    }

    class Solution {


        public int findRepeatNumber(int[] nums) {
            Set<Integer> set = new HashSet<>();
            int result = -1;
            for (int num : nums) {
                if (!set.add(num)) {
                    result = num;
                    break;
                }
            }

            return result;
        }
    }
}
