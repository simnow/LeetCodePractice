package com.android.leetcode.offer;
//
// Created by $梁振 on 8/18/21.
//

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Offer30 {
    public static void main(String[] args) {

    }

    class MinStack {
        Deque<Integer> stack;
        /** initialize your data structure here. */
        public MinStack() {
            stack=new LinkedList<>();
        }

        public void push(int x) {
            stack.push(x);
        }

        public void pop() {
            stack.pop();
        }

        public int top() {
            return stack.peekLast();
        }

        public int min() {
            return stack.getLast();
        }
    }
}
