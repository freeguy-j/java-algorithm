package com.study.baekjoon.dp;

import java.util.Scanner;

public class Number_11055_Bottom_Up {

    static int[] dp, arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        arr = new int[n];
        dp = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();;
        }

        for (int i = 0; i < n; i++) {
            dp[i] = arr[i];
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[i] < dp[j] + arr[i]) {
                    dp[i] = dp[j] + arr[i];
                }
            }
        }

        int max = -1;
        for (int i = 0; i < n; i++) {
            max = Math.max(dp[i], max);
        }
        System.out.println(max);
    }
}