package com.android.leetcode.interview;

/**
 * A～Z 0～25  a～z 26～52
 * 283732283732283732283732
 * 数字转换字符串
 * 应用ASCII码转换
 * a 97 A 65  0 48
 */
public class Solution4 {

    public static void main(String[] args) {
        numToLetter(283732837328373L);

    }

    public static void numToLetter(long source){
        numStrToLetter(String.valueOf(source));
    }

    public static void numStrToLetter(String input) {
        char[] carr = input.toCharArray();
        for (int i = 1; i < carr.length; i++) {
            //0
            if (carr[i - 1] == 48) {
                System.out.print((char) (carr[i - 1]+17));
                continue;
            }
            //<3
            if (carr[i - 1] < 51) {
                boolean flag = carr[i - 1] == 49;
                int z = flag ? 17 : 27;
                if (carr[i] < 54) {
                    System.out.print((char) (carr[i] + z));
                } else {
                    System.out.print((char) (carr[i] + 43));
                }
                i++;
                continue;
            }
            //<6
            if (carr[i - 1] < 54) {
                boolean flag = carr[i - 1] == 52;
                int z = flag ? 53 : 63;
                System.out.print((char) (carr[i] + z));
                i++;
                continue;
            }
            System.out.print((char)(carr[i - 1]+17));
        }
    }

}
