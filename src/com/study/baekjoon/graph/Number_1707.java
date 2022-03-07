package com.study.baekjoon.graph;

import java.util.*;

public class Number_1707 {
    static String result = "YES";
    static int[] team;
    static int RED = 1, GREEN = -1;
    static int a,b;
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        while (K--> 0) {
            result = "YES";
            int V = sc.nextInt();
            int E = sc.nextInt();

            graph = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < E; i++) {
                a = sc.nextInt() - 1;
                b = sc.nextInt() - 1;
                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            team = new int[V];
            for (int i = 0; i < V; i++) {
                if (team[i] == 0) {
                    if (!bfs(i)) break;
                }
            }

            sb.append(result).append("\n");
        }
        System.out.println(sb);

    }

    private static boolean bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(n);
        team[n] = RED;
        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int i : graph.get(node)) {
                if (team[node] == team[i]) {
                    result = "NO";
                    return false;
                }
                if (team[i] == 0) {
                    team[i] = team[node] * -1;
                    queue.add(i);
                }
            }
        }
        return true;
    }
}


