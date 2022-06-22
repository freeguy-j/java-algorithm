package com.study.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] numCount = new int[10];
        int total = 0;
        for (int i = 0; i < N.length(); i++) {
            int tNum = Integer.parseInt(N.substring(i, i + 1));
            numCount[tNum] += 1;
            total += tNum;
        }

        if (!N.contains("0") || total % 3 != 0) {
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (numCount[i] != 0) {
                sb.append(i);
                numCount[i]--;
            }
        }
        System.out.println(sb.toString());
    }
}