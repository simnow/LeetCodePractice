package com.android.leetcode.offer;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Offer50
 * 剑指 Offer 50. 第一个只出现一次的字符
 *
 * @author liangzhen
 * @date 8/22/21 6:47 PM
 */
public class Offer50 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar("loveleetcode"));
    }

    static class Solution {
        public char firstUniqChar(String s) {
            char result = ' ';
            if (null == s || s.isEmpty()) {
                return result;
            }
            HashMap<Character, Boolean> dic = new HashMap<>();
            char[] sc = s.toCharArray();
            for(char c : sc) {
                dic.put(c, !dic.containsKey(c));
            }
            for(char c : sc) {
                if(dic.get(c)) {
                    return c;
                }
            }
            return result;
        }
    }
}
