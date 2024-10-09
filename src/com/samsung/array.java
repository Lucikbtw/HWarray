package com.samsung;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        double sum = 0;
        boolean flag = false;
        int r = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                flag = true;
                sum = sum + j;
                r++;
            }
        }
        sum = sum / r;
        String res = String.format("%.2f", sum);
        if (flag) {
            System.out.println(res);
        }
        else {
            System.out.println("NO");
        }
    }
}
