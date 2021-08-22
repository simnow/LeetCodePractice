package com.android.leetcode.offer;
//
// Created by $梁振 on 8/18/21.
//

import java.util.LinkedList;
import java.util.Queue;

public class Offer09 {
    public static void main(String[] args) {

    }

    class CQueue {
        Queue<Integer> stack1;
        Queue<Integer> stack2;

        public CQueue() {
            stack1= new LinkedList<>();
            stack2= new LinkedList<>();
        }

        public void appendTail(int value) {
            stack1.add(value);
        }

        public int deleteHead() {
            if (stack2.isEmpty()){
                while (!stack1.isEmpty()){
                    stack2.add(stack1.poll());
                }
            }
            if (stack2.isEmpty()){
                return -1;
            }else {
                int deleteItem=stack2.poll();
                return deleteItem;
            }
        }
    }
}
