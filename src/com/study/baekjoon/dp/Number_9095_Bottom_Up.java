package com.study.baekjoon.dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_9095_Bottom_Up {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n ; i++) {
            int num = Integer.parseInt(br.readLine());

            int[] dp = new int[11];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int k = 4; k <= num; k++) {
                dp[k] = dp[k - 1] + dp[k - 2] + dp[k - 3];
            }
            System.out.println(dp[num]);
        }
    }
}