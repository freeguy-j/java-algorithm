package com.study.baekjoon.dp;



/*
최장 증가 부분 수열(LIS, Longest Increasing Subsequence)란?

원소가 n개인 배열의 일부 원소를 골라내서 만든 부분 수열 중, 각 원소가 이전 원소보다 크다는 조건을 만족하고,
그 길이가 최대인 부분 수열을 최장 증가 부분 수열이라고 합니다.
예를 들어, { 6, 2, 5, 1, 7, 4, 8, 3} 이라는 배열이 있을 경우, LIS는 { 2, 5, 7, 8 } 이 됩니다.
{ 2, 5 }, { 2, 7 } 등 증가하는 부분 수열은 많지만 그 중에서 가장 긴 것이 { 2, 5, 7, 8 } 입니다.
일반적으로 최장 증가 부분 수열의 길이가 얼마인지 푸는 간편한 방법은 DP를 이용하는 것입니다.

시간 복잡도 계산
N개 탐색 * N번째 값을 구할때 N만큼의 비교가 필요하므로
O(N^2)
*/

import java.util.Scanner;
public class Number_11053_Bottom_Up {

    static int[] arr,dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[n];
        dp = new int[n];

        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0 ; j < i; j++) {
                if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int max = -1;
        for (int i = 0 ; i < n ; i++) {
            max = Math.max(dp[i], max);
        }
        System.out.println(max);
    }
}