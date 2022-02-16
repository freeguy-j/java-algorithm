package com.study.baekjoon.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Number_10845 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        int last = 0;
        for (int i = 0; i < n ; i++) {
            switch (sc.next()) {
                case "push":
                    last = sc.nextInt();
                    queue.add(last);
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(queue.poll()).append("\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(queue.peek()).append("\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(last).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}