package com.android.leetcode;

/**
 * @CLassName: LeetCode2
 * @Description: https://leetcode-cn.com/problems/add-two-numbers/
 * @author: 梁振
 * @date: 2019/1/18 12:08 PM
 */
public class LeetCode2 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode p = l1;
        p.next = new ListNode(8);
        p = p.next;
        p.next = new ListNode(7);
        p = p.next;
        p.next = new ListNode(6);
        p = p.next;
        ListNode l2 = new ListNode(0);
        ListNode q = l2;
        q.next = new ListNode(5);
        q = q.next;
        q.next = new ListNode(4);
        q = q.next;
        q.next = new ListNode(3);
        q = q.next;
        ListNode re = addTwoNumbers(l1, l2);

        while (re != null) {
            System.out.println(re.val);
            re = re.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
