package com.study.baekjoon.dp;

import java.util.Scanner;


public class Number_2579_Top_Down {

    static Integer[] dp, arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        dp = new Integer[n + 1];
        arr = new Integer[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }

        dp[0] = arr[0] = 0;
        dp[1] = arr[1];
        if (n >= 2) {
            dp[2] = arr[1] + arr[2];
        }
        System.out.println(recur(n));
    }

    static int recur(int n) {
        if (dp[n] == null) {
            dp[n] = Math.max(recur(n - 2), recur(n - 3) + arr[n - 1]) + arr[n];
        }
        return dp[n];
    }
}