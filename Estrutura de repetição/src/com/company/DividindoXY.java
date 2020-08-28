package com.company;

import java.util.Scanner;

public class DividindoXY {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, i;

        n = input.nextInt();
        int[] x = new int[n], y = new int[n];

        for (i=0; i<n; i++)
        {
            x[i] = input.nextInt();
            y[i] = input.nextInt();

            if (i == (n-1))
            {
                for (i=0; i<n; i++)
                {
                    if (y[i] == 0)
                    {
                        System.out.println("divisao impossivel");
                    } else
                    {
                        System.out.printf("%.1f%n", (float)x[i]/y[i]);
                    }
                }
            }
        }
    }
}
