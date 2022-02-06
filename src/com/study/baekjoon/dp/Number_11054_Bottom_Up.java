package com.study.baekjoon.dp;

import java.util.Scanner;


/*
바이토닉 수열이란 수열이 증가했다가 감소하는 수열을 의미한다.
예를 들어 [1, 2, 3, 4, 2, 1] 은 바이토닉 수열이 맞지만
[1, 2, 2, 3, 2, 1]은 같은 값이 연속으로 있으므로 바이토닉 수열이 아니다.
*/
public class Number_11054_Bottom_Up {

    static int[] r_dp, l_dp, arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        r_dp = new int[n];
        l_dp = new int[n];
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            r_dp[i] = 1;
            l_dp[n-1-i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] & r_dp[i] < r_dp[j] + 1) {
                    r_dp[i] = r_dp[j] + 1;
                }

                if (arr[n-1-i] > arr[n-1-j] & l_dp[n-1-i] < l_dp[n-1-j] + 1) {
                    l_dp[n-1-i] = l_dp[n-1-j] + 1;
                }
            }
        }

        int max = -1;
        for (int i = 0; i < n; i++) {
            max = Math.max(r_dp[i] + l_dp[i] - 1, max);
        }
        System.out.println(max);
    }
}