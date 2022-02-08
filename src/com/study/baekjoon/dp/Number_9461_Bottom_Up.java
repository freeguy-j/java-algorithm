package com.study.baekjoon.dp;

import java.util.Scanner;


public class Number_9461_Bottom_Up {

    static Long[] dp;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int t = scanner.nextInt();
        dp = new Long[101];
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;
        dp[4] = 2L;
        dp[5] = 2L;
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            for (int j = 6; j <= n; j++) {
                if (dp[j] == null) {
                    dp[j] = dp[j-1] + dp[j-5];
                }
            }
            stringBuilder.append(dp[n]).append('\n');
        }

        System.out.println(stringBuilder);
    }
}

