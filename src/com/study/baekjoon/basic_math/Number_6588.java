package com.study.baekjoon.basic_math;


import java.util.Scanner;

public class Number_6588 {

    static int MAX = 1000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] checked = new boolean[MAX + 1];

        for (int i = 2 ; i <= MAX ; i++) {
            checked[i] = true;
        }

        for (int i = 2 ; i <= MAX ; i++) {
            for (int j = i * 2; j <= MAX; j += i) {
                if (!checked[j]) continue;
                checked[j] = false;
            }
        }

        while (true) {
            int n = sc.nextInt();
            boolean ok = false;
            if (n == 0) break;

            for (int i = 2; i <= n / 2; i++) {
                if (checked[i] && checked[n-i]) {
                    System.out.println(n + " = " + i + " + " + (n-i));
                    ok = true;
                    break;
                }
            }

            if (!ok) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }


    }
}