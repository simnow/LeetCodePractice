package com.android.leetcode.offer;
//
// Created by $梁振 on 8/18/21.
//

import com.android.leetcode.LeetCode2;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Offer06 {
    public static void main(String[] args) {

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public int[] reversePrint(ListNode head) {
            Deque<Integer> stack = new LinkedList<>();
            while (null != head) {
                stack.push(head.val);
                head=head.next;
            }
            int size=stack.size();
            int[] result=new int[size];
            for (int i = 0; i <size ; i++) {
                result[i]=stack.pop();
            }
            return result;
        }
    }
}




