package com.android.leetcode.offer;
//
// Created by $梁振 on 8/25/21.
//

public class Offer27 {
    public static void main(String[] args) {
        int[] aa={4,2,7,1,3,6,9};
        TreeNode treeNode=new TreeNode(4);
        treeNode.left=new TreeNode(2);
        treeNode.left.left=new TreeNode(1);
        treeNode.left.right=new TreeNode(3);
        treeNode.right=new TreeNode(7);
        treeNode.right.left=new TreeNode(6);
        treeNode.right.right=new TreeNode(9);
        TreeNode treeNode1=mirrorTree(treeNode);
        System.out.println(treeNode1.val+""+treeNode1.left.val);
    }
    public static TreeNode mirrorTree(TreeNode root){
        if (null==root){
            return null;
        }
        TreeNode left=mirrorTree(root.left);
        TreeNode right=mirrorTree(root.right);
        root.left=right;
        root.right=left;
        return root;
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
