package com.android.leetcode.offer;
//
// Created by $梁振 on 8/31/21.
//

public class Offer18 {
    public static void main(String[] args) {

    }

    public static class Solution {
        public ListNode deleteNode(ListNode head, int val) {
            if (head == null) {
                return null;
            }
            if (head.val == val) {
                return head.next;
            }
            ListNode cur = head;
            while (cur.next != null && cur.next.val != val) {
                cur = cur.next;
            }
            if (cur.next != null) {
                cur.next = cur.next.next;
            }
            return head;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}