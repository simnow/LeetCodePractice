package com.android.leetcode.offer;
//
// Created by $梁振 on 8/18/21.
//

import java.util.HashMap;
import java.util.Map;

public class Offer35 {
    public static void main(String[] args) {

    }

    class Solution {
        Map<Node, Node> cachedNode = new HashMap<Node, Node>();

        public Node copyRandomList(Node head) {
            if (head == null) {
                return null;
            }
            if (!cachedNode.containsKey(head)) {
                Node headNew = new Node(head.val);
                cachedNode.put(head, headNew);
                headNew.next = copyRandomList(head.next);
                headNew.random = copyRandomList(head.random);
            }
            return cachedNode.get(head);
        }

    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
