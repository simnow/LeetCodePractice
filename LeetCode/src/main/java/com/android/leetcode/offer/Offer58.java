package com.android.leetcode.offer;
//
// Created by $梁振 on 8/18/21.
//

public class Offer58 {
    public static void main(String[] args) {

    }

    class Solution {
        public String reverseLeftWords(String s, int n) {
            return s.substring(n, s.length()) + s.substring(0, n);
        }
    }

}
