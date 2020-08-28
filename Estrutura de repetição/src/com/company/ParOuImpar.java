package com.company;

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args)
    {
        int N, X;
        int[] V;

        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        V = new int[N];

        for (int i=0; i < N; i++)
        {
            X = input.nextInt();
            V[i] = X;
        }

        for (int valor : V)
        {
           if (valor == 0) System.out.println("NULL");
           else if (valor > 0)
           {
               if (valor%2 == 0) System.out.println("EVEN POSITIVE");
               else System.out.println("ODD POSITIVE");
           }
           else if (valor%2 == 0) System.out.println("EVEN NEGATIVE");
           else System.out.println("ODD NEGATIVE");
        }
    }
}