package com.study.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_1783 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        int answer = 0;
        if (N == 1) {
            answer = 1;
        } else if (N == 2) {
            answer = Math.min(4, (M + 1)/2);
        } else {
            if (M >= 7) {
                answer = M - 2;
            } else {
                answer = Math.min(4, M);
            }
        }
        System.out.println(answer);
    }
}