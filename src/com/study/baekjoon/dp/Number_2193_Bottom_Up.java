package com.study.baekjoon.dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2193_Bottom_Up {

    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new long[n+1];
        dp[1] = 1;
        System.out.println(recur(n));
    }

    static long recur(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        dp[n] = recur(n - 1) + recur(n - 2);
        return dp[n];
    }
}