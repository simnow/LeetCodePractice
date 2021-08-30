package com.android.leetcode.offer;
//
// Created by $梁振 on 8/25/21.
//

public class Offer28 {
    public static void main(String[] args) {
        int[] aa={4,2,7,1,3,6,9};
        TreeNode treeNode=new TreeNode(4);
        treeNode.left=new TreeNode(2);
//        treeNode.left.left=new TreeNode(1);
        treeNode.left.right=new TreeNode(3);
        treeNode.right=new TreeNode(7);
//        treeNode.right.left=new TreeNode(6);
        treeNode.right.right=new TreeNode(9);
    }
    public boolean isSymmetric(TreeNode root) {
        if (null==root){
            return true;
        }
        return recur(root.left,root.right);
    }
    public static Boolean recur(TreeNode L,TreeNode R){
        if (null==L&&R==null){
            return true;
        }
        if (null==L||R==null||L.val!=R.val){
            return false;
        }
        return recur(L.left,R.right)&&recur(L.right,R.left);
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
