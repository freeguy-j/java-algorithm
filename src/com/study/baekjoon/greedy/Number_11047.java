package com.study.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number_11047 {
    static List<Integer> costs = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);

        for (int i = 0; i < N; i++) {
            costs.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(costs, Collections.reverseOrder());

        int count = 0;
        for (int cost : costs) {
           count += K / cost;
           K %= cost;
        }

        System.out.println(count);
    }
}