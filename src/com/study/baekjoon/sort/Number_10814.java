package com.study.baekjoon.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Number_10814 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
        }

        Arrays.sort(arr, (e1, e2) -> {
            int a = Integer.parseInt(e1[0]);
            int b = Integer.parseInt(e2[0]);
            if (a == b) {
                return 0;
            } else {
                return a - b;
            }
        });

        for (String[] i : arr) {
            System.out.println(i[0] + " " + i[1]);
        }
    }
}
//
//    이 문제는 대부분 Arrays.sort 로 풀면 시간초과가 난다.
//
//        (위는 Java8 기준이다. 참고로 자바의 버전마다 조금씩 다르기 때문에 다른 버전으로 제출하면 통과될 수 있다.)
//
//        Arrays.sort() 의 경우 dual-pivot Quicksort 알고리즘을 사용한다고 했다. 물론 평균 시간복잡도가 O(nlogn) 이고 매우 빠른 알고리즘인 것은 맞다. 그러나 최악의 경우 시간복잡도는 O(n2) 이라는 점을 기억해야한다.
//
//        이 문제는 단순하게 Arrays.sort() 를 쓰지 못하게 일부러 O(n2) 이 걸리도록 저격한 데이터가 있다.
//        그래서 아마 Arrays.sort 방법을 써서 제출하다가 틀린 사람이 한 둘이 아니다. (필자의 경우도 저격데이터가 있는지 모르고 제출했다가 틀렸었다... 방심했다..)
//
//        일단, 최악의 경우에도 O(nlogn) 을 보장하거나 혹은, O(n) 에 가까운 정렬 알고리즘을 사용해야 한다. 이에 대한 해결 방법은 두 가지가 있다.
//
//        첫 번째는 Collections.sort() 를 쓰는 방법이다. Collections.sort() 은 Timsort이다. Timsort 의 경우 합병 및 삽입정렬 알고리즘을 사용한다.
//        이렇게 두 가지가 섞여있는 정렬 알고리즘을 hybrid sorting algorithm 이라고 하는데, 합병정렬(Merge Sort)의 경우 최선, 최악 모두 O(nlogn)  을 보장하고.
//        삽입정렬(Insertion sort)의 경우 최선의 경우는 O(n) , 최악의 경우는 O(n2) 이다.
//        그리고 두 정렬 모두 안정 정렬(stable sort)이기 때문에 Timsort를 hybrid stable sorting algorithm이라고도 한다.
//
//        즉, 합병정렬의 최악의 경우와 삽입정렬의 최선의 경우를 짬뽕한 알고리즘이 Timsort 라는 것이다. 실제로 파이썬이나 기타 정렬 알고리즘에서 가장 많이 쓰이는 알고리즘이기도 하다.
//
//        시간복잡도 O(n) ~ O(nlogn) 을 보장한다는 장점이 있다. 대신에 Collections.sort()를 사용하고자 한다면 가장 쉬운 방법으로는 일반적인 primitive 배열이 아닌 List 계열(ArrayList, LinkedList 등..)의 자료구조를 사용하여 정렬해야한다.

