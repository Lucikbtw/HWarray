package com.samsung;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];


        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }


        List<Integer> negativeList = new ArrayList<>();
        List<Integer> nonNegativeList = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            if (arr[i] < 0) {
                negativeList.add(arr[i]);
            } else {
                nonNegativeList.add(arr[i]);
            }
        }


        for (int num : negativeList) {
            System.out.print(num + " ");
        }
        for (int num : nonNegativeList) {
            System.out.print(num + " ");
        }
    }
}
