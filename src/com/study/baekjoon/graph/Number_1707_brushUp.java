package com.study.baekjoon.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Number_1707_brushUp {

    static int V;
    static int E;
    static ArrayList<ArrayList<Integer>> graph;
    static String answer = "YES";
    static int[] checkd;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        while(K-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            graph = new ArrayList<>();
            for (int i = 0; i <= V; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 1; i <= E; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            checkd = new int[V + 1];
            for (int i = 1; i <= V; i++) {
                if (checkd[i] == 0) {
                    if (!bfs(i)) break;
                }
            }
            System.out.println(answer);
        }
    }

    private static boolean bfs (int n) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(n);
        checkd[n] = 1;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int i : graph.get(node)) {
                if (checkd[node] == checkd[i]) {
                    answer = "NO";
                    return false;
                }
                if (checkd[i] == 0) {
                    queue.add(i);
                    checkd[i] = checkd[node] * -1;
                }
            }
        }
        return true;
    }
}


