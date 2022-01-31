package com.study.baekjoon.dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_9465_Bottom_Up {

    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            int val = Integer.parseInt(br.readLine());
            dp = new int[2][val];
            for (int k = 0; k < 2 ; k++) {
                for (int j = 0; j < val; j++) {
                    dp[k][j] = Integer.parseInt(br.readLine());
                }
                System.out.println(recur(dp, val, 0, 0, 0));
            }
        }
    }

    static int recur(int[][] dp, int arrVal, int digit, int val, int sum) {
        if (val == 0) {
            if (digit == 0) {
                sum += Math.max(dp[digit][val], Math.max(dp[digit][val + 1], dp[digit + 1][val]));
            } else {
                sum += Math.max(dp[digit][val], Math.max(dp[digit][val + 1], dp[digit - 1][val]));
            }
        } else if (val == arrVal - 1) {
            if (digit == 0) {
                sum += Math.max(dp[digit][val], Math.max(dp[digit][val - 1], dp[digit + 1][val]));
            } else {
                sum += Math.max(dp[digit][val], Math.max(dp[digit][val - 1], dp[digit - 1][val]));
            }
        } else {
            if (digit == 0) {
                sum += Math.max(dp[digit][val], Math.max(dp[digit][val + 1], dp[digit + 1][val]));
            } else {
                sum += Math.max(dp[digit][val], Math.max(dp[digit][val + 1], dp[digit - 1][val]));
            }
        }
    }
}