package com.study.baekjoon.dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_11726 {

    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new int[n+1];
        dp[0] = dp[1] = 1;

        System.out.println((recur(n)));
    }

    static int recur(int n) {
        if (dp[n] > 0) return dp[n];

        dp[n] = recur(n-1) + recur(n-2);
        dp[n] %= 10007;
        return dp[n];
    }
}
