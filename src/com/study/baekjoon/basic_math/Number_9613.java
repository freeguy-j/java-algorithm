package com.study.baekjoon.basic_math;

    
import java.util.Scanner;

public class Number_9613 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++) {
            int s = sc.nextInt();
            int[] arr = new int[s];
            for (int z = 0; z < s; z ++) {
                arr[z] = sc.nextInt();
            }

            long totalGcd = 0;
            for (int k = 0; k < s; k++) {
                for (int j = k; j < s; j++) {
                    if (k != j) {
                        totalGcd += gcd(arr[k], arr[j]);
                    }
                }
            }
            System.out.println(totalGcd);
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}