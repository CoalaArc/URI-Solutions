package com.company;

import java.util.Scanner;

public class FibonacciFacil {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int N, i;

        N = input.nextInt();

        int[] fibonacci = new int[N];

        for (i=0; i<N; i++)
        {
            if (i < 2)
            {
                fibonacci[i] = i;
            } else
            {
                fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
            }
        }

        for (i=0; i<N; i++)
        {
            if (i == (N-1) || N == 1) System.out.printf("%d%n", fibonacci[i]);
            else System.out.printf("%d ", fibonacci[i]);
        }
    }
}
