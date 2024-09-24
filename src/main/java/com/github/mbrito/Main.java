package com.github.mbrito;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] weights = new int[x];

        for (int i = 0; i < x; i++)
            weights[i] = scanner.nextInt();

        System.out.println(Balancer.canBalance(weights));
    }
}