package com.study.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number_20044 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.valueOf(br.readLine());
        String[] W = br.readLine().split(" ");

        List<Integer> s = new ArrayList<>();
        for (String a : W) {
            s.add(Integer.valueOf(a));
        }

        s.sort(Collections.reverseOrder());

        int answer = (s.get(0) + s.get(s.size() -1));
        for (int i = 1 ; i < N; i++) {
            int sum = (s.get(i) + s.get(s.size() -1 - i));
            if (answer > sum) {
                answer = sum;
            }
        }
        System.out.println(answer);
    }
}