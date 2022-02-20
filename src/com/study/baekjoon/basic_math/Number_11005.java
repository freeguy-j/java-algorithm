package com.study.baekjoon.basic_math;

    
import java.util.Scanner;

public class Number_11005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int n = sc.nextInt();
        int b = sc.nextInt();

        while (n > 0) {
            if (n % b < 10) {
                stringBuilder.append((char)(n % b + '0'));
            } else {
                stringBuilder.append((char)(n % b - 10 + 'A'));
            }
            n /= b;
        }

        System.out.println(stringBuilder.reverse());
    }

}