package com.study.baekjoon.etc;


import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Number_1158 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1 ; i <= n ; i++) {
            queue.add(i);
        }

        while (queue.size() != 1) {
            for (int i = 1; i < k; i++) {
                queue.add(queue.poll());
            }

            sb.append(queue.poll()).append(", ");
        }

        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }
}