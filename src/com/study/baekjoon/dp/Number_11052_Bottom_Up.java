package com.study.baekjoon.dp;

import java.util.Scanner;

public class Number_11052_Bottom_Up {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n + 1];
        int[] d = new int[n + 1];

        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                d[i] = Math.max(d[i], d[i - j] + arr[j]);
            }
        }

        System.out.println(d[n]);
    }
}

//    DataType	        Byte	Min	    Max
//      byte	        1byte	-128	127
//      short	        2byte	-32768	32767
//      int	            4byte	-2147483648	2147483647
//      long	        8byte	-9223372036854775808	9223372036854775807
//      float	        4byte	1.4E-45	3.4028235E38
//      double	        8byte	4.9E-324	1.7976931348623157E308