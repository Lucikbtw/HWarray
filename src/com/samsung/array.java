package com.samsung;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] Array = new int[n];

        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i = 0; i < Array.length; i++) {
            if (x==Array[i]) {
                System.out.println(++i);
                return;
            }
        }
        System.out.println("NO");
    }
}
