package com.study.baekjoon.dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2156_Bottom_Up {

    static int[] dp, cost;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];
        cost = new int[n + 1];

        for (int k = 1; k <= n; k++) {
            cost[k] = Integer.parseInt(br.readLine());
        }

        dp[1] = cost[1];

        if (n > 1) {
            dp[2] = cost[1] + cost[2];
        }

        for (int k = 3; k <= n; k++) {
            dp[k] = Math.max(dp[k - 1], Math.max(dp[k - 2] + cost[k], dp[k - 3] + cost[k - 1]  + cost[k]));
        }
        System.out.println(dp[n]);
    }
}