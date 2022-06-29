package com.study.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Number_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[][] arr = new Integer[N][2];
        for (int i = 0; i < N; i++) {
            String[] sArr = br.readLine().split(" ");
            arr[i][0] = Integer.valueOf(sArr[0]);
            arr[i][1] = Integer.valueOf(sArr[1]);
        }

        Arrays.sort(arr, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        int endTime = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i][0] >= endTime) {
                endTime = arr[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}