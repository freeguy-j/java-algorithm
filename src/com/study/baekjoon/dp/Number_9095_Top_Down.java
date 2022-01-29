package com.study.baekjoon.dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_9095_Top_Down {

    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n ; i++) {
            int a = Integer.parseInt(br.readLine());
            recur(a);
            System.out.println(count);
            count = 0;
        }


    }

    static void recur(int n) {
        if (n == 0) {
            count++;
        }

        if (n - 3 >= 0) {
            recur(n - 3);
            recur(n - 2);
            recur(n - 1);
        } else if (n - 2 >= 0) {
            recur(n - 2);
            recur(n - 1);
        } else if (n - 1 >= 0){
            recur(n - 1);
        }
    }
}