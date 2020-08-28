package com.company;

import java.util.Scanner;

public class Fibonacci_Facil {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n, i=1;
        int[] S;

        n = input.nextInt();
        S = new int[n];

        S[1] = 1;
        while (i < n-1)
        {
            i++;
            S[i] = (S[i-2]) + (S[i-1]);
        }

        i = 1;
        for (int output : S)
        {
            if (i == n) System.out.printf("%d%n", output);
            else System.out.printf("%d ", output);

            i++;
        }
    }
}
