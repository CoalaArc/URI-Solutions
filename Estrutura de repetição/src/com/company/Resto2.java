package com.company;

import java.util.Scanner;

public class Resto2 {

    public static void main(String[] args)
    {
        int N;

        Scanner input = new Scanner(System.in);
        N = input.nextInt();

        for (int i=1; i < 10000; i++)
        {
            if (i%N == 2) System.out.println(i);
        }
    }
}
