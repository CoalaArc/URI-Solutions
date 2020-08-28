package com.company;

import java.util.Scanner;

public class FatorialSimples {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int N, i, n;

        N = input.nextInt();

        for (i=1, n=N; i<n; i++)
        {
            N = N* (n-i);
        }
        System.out.println(N);
    }
}
