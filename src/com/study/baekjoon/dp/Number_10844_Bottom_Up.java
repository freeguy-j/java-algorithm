package com.study.baekjoon.dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10844_Bottom_Up {

    static Long[][] dp;
    final static long MOD = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new Long[n + 1][10];

        for (int i = 0; i < 10; i ++) {
            dp[1][i] = 1L;
        }

        long result = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i-1][1] % MOD;
                } else if (j == 9){
                    dp[i][j] = dp[i-1][8] % MOD;
                } else {
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % MOD;
                }
            }
        }
        for (int i = 0; i <= 9; i++) {
            result += dp[n][i];
        }
        System.out.println(result % MOD);
    }
}