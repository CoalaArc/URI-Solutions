package com.company;

import java.util.Scanner;

public class fazendo_pandorgas {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int
                i,
                x,
                y,
                N;

        N = input.nextInt();

        for (i=0; i<N; i++)
        {
            x = input.nextInt();
            y = input.nextInt();

            System.out.printf("%d cm2%n", x*y/2);
        }
    }
}
