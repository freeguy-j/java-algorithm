package com.study.baekjoon.dp;

//다이나믹 프로그래밍 문제를 푸는 방법은 Top-down과 Bottom-up이 있다.
//두 방법 모두 큰 문제를 여러 개의 부분 문제들로 나누어 풀지만,
//1. Top-down은 가장 큰 문제를 방문 후 작은 문제를 호출 하여 답을 찾는 방식이고,
//2. Bottom-up은 가장 작은 문제들 부터 답을 구해가며 전체 문제의 답을 찾는 방식이다.
//흔히 top-down은 재귀 호출을, bottom-up은 반복문을 이용해 구현한다.

//메모이제이션을 이용하여 구하기.
//-> 한번 구한 계산은 더 이상 계산하지 않고 가져다 쓰는 개념이라 시간이 확 줄어든다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_1463 {

    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;

        System.out.println(recur(n));

    }

    static int recur(int n) {
        if (dp[n] == null) {
            if (n % 6 == 0) {
                dp[n] = Math.min(recur(n - 1), Math.min(recur(n / 3), recur(n / 2))) + 1;
            }else if (n % 3 == 0) {
                dp[n] = Math.min(recur(n / 3), recur(n - 1)) + 1;
            }else if (n % 2 == 0) {
                dp[n] = Math.min(recur(n / 2), recur(n - 1)) + 1;
            }else {
                dp[n] = recur(n - 1) + 1;
            }
        }
        return dp[n];
    }

    // 10
    // % 2 / dp[10] = recur(5) , recur(9) + 1
    // 1. -1 / dp[5] = recur(4) + 1  // 2. %3 / dp[9] = recur[3] , recur[8] + 1
    // ...
}
