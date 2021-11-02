package com.android.leetcode;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author liangzhen
 */
public class Test001 {

    public class A{

    }
    public class B extends A{}

    public static void main(String[] args) {
        int count=102%100000;
        search();
        System.out.println(updateTotal5d());
        search();
    }
    public static int countSubString(String s, String[] words){
        int result=0;

        for(int i=0;i<words.length;i++){
            int index_=-1;
            char[] arrs=words[i].toCharArray();
            for(int j=0;j<arrs.length;j++){
                int m=s.indexOf(arrs[j]);
                if(m<0||m<=index_){
                    break;
                }
                index_=m;
                if(j==arrs.length-1&&index_>=0){
                    result++;
                    index_=-1;
                }
            }
        }
        return result;
    }
    private static AtomicInteger totalRequest = new AtomicInteger(0);

    private static void search(){
        for (int i = 0; i < 100; i++) {
            System.out.println(updateTotal5d());
        }
    }

    public static String updateTotal5d() {
        int total = totalRequest.getAndIncrement() % 100000;
        return String.format("%05d", total);
    }
}
