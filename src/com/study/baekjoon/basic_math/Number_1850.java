package com.study.baekjoon.basic_math;


    import java.util.Scanner;

    public class Number_1850 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            long a = sc.nextLong();
            long b = sc.nextLong();

            long d = gcd(a, b);
            for (int i = 0 ; i < d ; i++) {
                sb.append("1");
            }
            System.out.println(sb);
        }

        private static long gcd(long a, long b) {
            if (b == 0) return a;
            return gcd(b, a % b);
        }
    }