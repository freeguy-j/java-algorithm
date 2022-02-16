package com.study.baekjoon.dequeue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Number_10846 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        Deque<Integer> deque = new LinkedList<>();
        int last = 0;
        for (int i = 0; i < n ; i++) {
            switch (sc.next()) {
                case "push_front":
                    deque.addFirst(sc.nextInt());
                    break;
                case "push_back":
                    deque.addLast(sc.nextInt());
                    break;
                case "empty":
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "pop_front":
                    if (deque.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(deque.pollFirst()).append("\n");
                    }
                    break;
                case "pop_back":
                    if (deque.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(deque.pollLast()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "front":
                    if (deque.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(deque.peekFirst()).append("\n");
                    }
                    break;
                case "back":
                    if (deque.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(deque.peekLast()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}