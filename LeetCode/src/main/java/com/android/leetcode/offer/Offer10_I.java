package com.android.leetcode.offer;

/**
 * 剑指 Offer 10- I. 斐波那契数列
 * 动态规划算法
 *
 * 斐波那契数列的定义是 f(n + 1) = f(n) + f(n - 1)f(n+1)=f(n)+f(n−1) ，生成第 nn 项的做法有以下几种：
 *
 * 递归法：
 * 原理： 把 f(n)f(n) 问题的计算拆分成 f(n-1)f(n−1) 和 f(n-2)f(n−2) 两个子问题的计算，并递归，以 f(0)f(0) 和 f(1)f(1) 为终止条件。
 * 缺点： 大量重复的递归计算，例如 f(n)f(n) 和 f(n - 1)f(n−1) 两者向下递归需要 各自计算 f(n - 2)f(n−2) 的值。
 * 记忆化递归法：
 * 原理： 在递归法的基础上，新建一个长度为 nn 的数组，用于在递归时存储 f(0)f(0) 至 f(n)f(n) 的数字值，重复遇到某数字则直接从数组取用，避免了重复的递归计算。
 * 缺点： 记忆化存储需要使用 O(N)O(N) 的额外空间。
 * 动态规划：
 * 原理： 以斐波那契数列性质 f(n + 1) = f(n) + f(n - 1)f(n+1)=f(n)+f(n−1) 为转移方程。
 * 从计算效率、空间复杂度上看，动态规划是本题的最佳解法。
 * 下图帮助理解递归法的 “重复计算” 概念。
 *
 *
 *
 * 动态规划解析：
 * 状态定义： 设 dpdp 为一维数组，其中 dp[i]dp[i] 的值代表 斐波那契数列第 ii 个数字 。
 * 转移方程： dp[i + 1] = dp[i] + dp[i - 1]dp[i+1]=dp[i]+dp[i−1] ，即对应数列定义 f(n + 1) = f(n) + f(n - 1);
 * f(n+1)=f(n)+f(n−1) ；
 * 初始状态： dp[0] = 0dp[0]=0, dp[1] = 1dp[1]=1 ，即初始化前两个数字；
 * 返回值： dp[n]dp[n] ，即斐波那契数列的第 nn 个数字。
 * 空间复杂度优化：
 * 若新建长度为 nn 的 dpdp 列表，则空间复杂度为 O(N)O(N) 。
 *
 * 由于 dpdp 列表第 ii 项只与第 i-1i−1 和第 i-2i−2 项有关，因此只需要初始化三个整形变量 sum, a, b ，利用辅助变量 sumsum 使 a, ba,b 两数字交替前进即可 （具体实现见代码） 。
 * 节省了 dpdp 列表空间，因此空间复杂度降至 O(1)O(1) 。
 * 循环求余法：
 * 大数越界： 随着 nn 增大, f(n)f(n) 会超过 Int32 甚至 Int64 的取值范围，导致最终的返回值错误。
 *
 * 求余运算规则： 设正整数 x, y, px,y,p ，求余符号为 \odot⊙ ，则有 (x + y) \odot p = (x \odot p + y \odot p) \odot p(x+y)⊙p=(x⊙p+y⊙p)⊙p 。
 * 解析： 根据以上规则，可推出 f(n) \odot p = [f(n-1) \odot p + f(n-2) \odot p] \odot pf(n)⊙p=[f(n−1)⊙p+f(n−2)⊙p]⊙p ，从而可以在循环过程中每次计算 sum = (a + b) \odot 1000000007sum=(a+b)⊙1000000007 ，此操作与最终返回前取余等价。
 *
 * 作者：jyd
 * 链接：https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/solution/mian-shi-ti-10-i-fei-bo-na-qi-shu-lie-dong-tai-gui/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer10_I {
    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(fib(21));
        System.out.println(fib(41));
    }
    public static int fib(int n) {
        int a = 0, b = 1;
        int sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
