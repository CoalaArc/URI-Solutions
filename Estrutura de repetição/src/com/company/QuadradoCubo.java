package com.company;

import java.util.Scanner;

public class QuadradoCubo {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int N, i;

        N = input.nextInt();

        for (i=1; i<=N; i++)
        {
            System.out.printf("%d %.0f %.0f%n", i, Math.pow(i, 2), Math.pow(i, 3));
        }
    }
}
