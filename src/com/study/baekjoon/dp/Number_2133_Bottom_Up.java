package com.study.baekjoon.dp;

import java.util.Scanner;


public class Number_2133_Bottom_Up {

    static int[] dp;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        dp = new int[31];
        dp[0] = 1;
        dp[1] = 0;
        if (n >1) {
            dp[2] = 3;
        }

        for (int i = 4; i <= n; i+=2) {
            dp[i] = 3 * dp[i-2];
            for (int j = 0; j < i - 2; j+=2) {
                dp[i] += dp[j] * 2;
            }
        }
        System.out.println(dp[n]);
    }
}

