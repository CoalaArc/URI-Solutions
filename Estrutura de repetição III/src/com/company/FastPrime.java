package com.company;

import java.util.Scanner;

public class FastPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                j,
                i,
                N;
        long
                X;
        boolean
                prime = true;

        N = input.nextInt();

        for (i=0; i<N; i++)
        {
            X = input.nextLong();

            j=2;
            while (j <= Math.sqrt(X) && prime)
            {
                if (X%j == 0) prime = false;
                j++;
            }
            if (prime) System.out.println("Prime");
            else System.out.println("Not Prime");
            prime = true;
        }
    }
}
