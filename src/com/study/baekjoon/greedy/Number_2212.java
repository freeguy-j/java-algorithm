package com.study.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Number_2212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        if (K >= N) {
            System.out.println(0);
            return;
        }

        Integer[] nArr = new Integer[N];
        String[] sArr = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            nArr[i] = Integer.valueOf(sArr[i]);
        }
        Arrays.sort(nArr);

        Integer[] arr = new Integer[N - 1];
        for (int i = 1; i < N; i++) {
            arr[i-1] = nArr[i] - nArr[i - 1];
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int sum = 0;
        for (int i = K - 1; i < N - 1; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

    }
}