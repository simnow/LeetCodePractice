package com.android.leetcode.offer;
//
// Created by $梁振 on 8/24/21.
//

public class Offer26 {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean isSubStructure(TreeNode A, TreeNode B) {
            return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
        }

        boolean recur(TreeNode A, TreeNode B) {
            if (B == null) return true;
            if (A == null || A.val != B.val) return false;
            return recur(A.left, B.left) && recur(A.right, B.right);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
