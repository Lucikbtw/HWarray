package com.samsung;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        boolean flag = false;
        for (int j : array) {
            if (j % 2 == 0) {
                flag = true;
                sum = sum + j;
            }
        }

        if (flag) {
            System.out.println(sum);
        }
        else {
            System.out.println("NO");
        }
    }
}
