package com.android.leetcode;


import com.sun.corba.se.impl.orbutil.concurrent.Sync;

/**
 * @author liangzhen
 */
public class Test001 {
    public static void main(String[] args) {
        String s = "abcde";
        String[] words = {"a","bb","acd","ace"};
        System.out.println(countSubString(s,words));
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
}
