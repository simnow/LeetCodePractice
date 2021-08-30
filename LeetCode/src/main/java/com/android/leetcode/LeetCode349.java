package com.android.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.ToIntFunction;

/**
 * LeetCode349
 * TODO
 *
 * @author liangzhen
 * @date 8/24/21 8:13 AM
 */
public class LeetCode349 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {2, 2};
        int[] arr = solution.intersection0(num1, num2);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Map<Integer, Boolean> map = new HashMap();
            List<Integer> list = new ArrayList<>();
            for (int num : nums1) {
                map.put(num, false);
            }
            for (int num : nums2) {
                if (map.containsKey(num) && !map.get(num)) {
                    map.put(num, true);
                    list.add(num);
                }
            }
            int[] res = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                res[i] = list.get(i);
            }
            return res;
        }

        public int[] intersection0(int[] nums1, int[] nums2) {
            Map<String, Boolean> map = new HashMap();
            List<Integer> list = new ArrayList<>();
            for (int num : nums1) {
                map.put(String.valueOf(num), false);
            }
            for (int num : nums2) {
                String key=String.valueOf(num);
                if (map.containsKey(key) && !map.get(key)) {
                    map.put(key, true);
                    list.add(num);
                }
            }
            int[] res = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                res[i] = list.get(i);
            }
            return res;
        }

        public int[] intersection1(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            List<Integer> list = new ArrayList<>();
            for (int i : nums1) {
                list.add(i);
            }
            for (int i : nums2) {
                set2.add(i);
            }
            list.retainAll(set2);
            set1.addAll(list);
            return set1.stream().mapToInt(
                    new ToIntFunction<Integer>() {

                        @Override
                        public int applyAsInt(Integer integer) {
                            return integer;
                        }
                    }
            ).toArray();
        }
    }
}
