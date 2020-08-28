package com.company;

import java.util.Scanner;

public class Intervalo2 {

    public static void main(String[] args)
    {
        int N, X, in = 0, out = 0;

        Scanner input = new Scanner(System.in);
        N = input.nextInt();

        for (int i=0; i < N; i++)
        {
            X = input.nextInt();
            if (X >= 10 && X <= 20)
            {
                in += 1; // in = in +1
            } else out += 1; // out = out + 1;
        }

        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);
    }
}
