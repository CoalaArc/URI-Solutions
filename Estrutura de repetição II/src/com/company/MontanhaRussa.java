package com.company;

import java.util.Scanner;

public class MontanhaRussa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int
                i,
                N,
                Amin,
                Amax,
                A;

        while (input.hasNext())
        {
            int j = 0;
            N = input.nextInt();
            Amin = input.nextInt();
            Amax = input.nextInt();

            for (i=0; i<N; i++)
            {
                A = input.nextInt();
                if (A >= Amin && A <= Amax) j++;
            }

            System.out.printf("%d%n", j);
        }
    }
}
