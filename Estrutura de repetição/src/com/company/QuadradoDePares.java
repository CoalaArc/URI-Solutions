package com.company;

import java.util.Scanner;

public class QuadradoDePares {

    public static void main(String[] args)
    {
        int N;

        Scanner input = new Scanner(System.in);
        N = input.nextInt();

        for (int i = 2; i <= N; i += 2 )
        {
            System.out.printf("%d^2 = %.0f\n", i, Math.pow(i, 2));
        }
    }
}
