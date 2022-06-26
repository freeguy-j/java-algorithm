package com.study.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2195 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String P = br.readLine();

        int index = 0;
        int count = 0;
        for (int i = 1; i <= P.length(); i++) {
            if (S.contains(P.substring(index,i))) {
                if (i == P.length()) {
                    count++;
                }
            } else {
                index = i-1;
                i--;
                count++;
            }
        }

        System.out.println(count);
    }
}