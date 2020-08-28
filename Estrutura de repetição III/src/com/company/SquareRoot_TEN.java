package com.company;

import java.util.Scanner;

public class SquareRoot_TEN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                i,
                N;
        double
                x = 0;

        N = input.nextInt();

        for (i = 0; i<N; i++)
        {
            x = x + 6;
            x = 1/x;
        }
        x = 3 + x;
        System.out.printf("%.10f", x);
    }
}
