package com.study.baekjoon.dp;

import java.util.Scanner;


public class Number_2225_Bottom_Up {

    static long[][] dp;
    static long mod = 1000000000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        dp = new long[n+1][k+1];

        for (int i = 1; i <= k; i++) {
            dp[0][i] = 1;
            if (n > 0) dp[1][i] = i;
        }

        for (int i = 1; i <= n; i++) {
            dp[i][1] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= k; j++) {
                for (int z = 0; z <= i; z++) {
                    dp[i][j] += dp[i-z][j-1] % mod;
                }
                dp[i][j] %= mod;
            }
        }

        System.out.println(dp[n][k] % mod);
    }
}

