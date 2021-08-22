package com.android.leetcode.offer;
//
// Created by $梁振 on 8/18/21.
//

public class Offer05 {
    public static void main(String[] args) {

    }

    class Solution {
        public String replaceSpace(String s) {
            StringBuilder builder = new StringBuilder();
            for (Character c : s.toCharArray()) {
                if (' ' != c) {
                    builder.append(c);
                } else {
                    builder.append("%20");
                }
            }
            return builder.toString();
        }
    }
}
