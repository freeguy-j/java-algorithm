package com.study.baekjoon.dp;

import java.util.Scanner;


public class Number_1912_Bottom_Up {

    static int[] dp, arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        dp = new int[n];
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        dp[0] = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
            max = Math.max(dp[i], max);
        }

        System.out.println(max);
    }
}