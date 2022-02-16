package com.study.baekjoon.string;

import java.util.Scanner;

public class Number_10824 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        long ab = Long.parseLong(a + "" + b);
        long cd = Long.parseLong(c + "" + d);

        System.out.println(ab + cd);
    }
}