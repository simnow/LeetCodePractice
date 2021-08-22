package com.android.leetcode.offer;
//
// Created by $梁振 on 8/22/21.
//

public class Offer11 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minArray(int[] numbers) {
            if (null==numbers||numbers.length==0){
                return 0;
            }
            int min=numbers[numbers.length-1];
            for (int i = numbers.length-1; i >=0 ; i--) {
                int index=numbers[i];
                if (index<=min){
                    min=index;
                }else {
                    break;
                }
            }
            return min;
        }

        public int minArray2(int[] numbers){
            if (null==numbers||numbers.length==0){
                return 0;
            }

            int low=0;
            int high=numbers.length-1;
            while (low<high){
                int pivot=low+(high-low)/2;
                if (numbers[pivot]<numbers[high]){
                    high=pivot;
                }else if (numbers[pivot]>numbers[high]){
                    low=pivot+1;
                }else {
                    high-=1;
                }
            }
            return numbers[low];
        }
    }
}
