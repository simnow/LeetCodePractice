package com.android.leetcode.offer;

/**
 * Offer47
 * TODO
 *
 * @author liangzhen
 * @date 8/30/21 9:45 AM
 */
public class Offer47 {


    class Solution {

        public int maxValue(int[][] grid) {
            int m = grid.length, n = grid[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0) {
                        if (j == 0) {
                            continue;
                        } else {
                            grid[0][j] += grid[0][j - 1];
                        }
                    } else {
                        if (j == 0) {
                            grid[i][0] += grid[i - 1][0];
                        } else {
                            grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
                        }
                    }
                }
            }
            return grid[m - 1][n - 1];
        }

        public int maxValue1(int[][] grid) {
            int m = grid.length, n = grid[0].length;
            for (int j = 1; j < n; j++) // 初始化第一行
                grid[0][j] += grid[0][j - 1];
            for (int i = 1; i < m; i++) // 初始化第一列
                grid[i][0] += grid[i - 1][0];
            for (int i = 1; i < m; i++)
                for (int j = 1; j < n; j++)
                    grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
            return grid[m - 1][n - 1];
        }
    }
}