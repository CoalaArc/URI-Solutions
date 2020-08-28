package com.company;

import java.util.Scanner;

public class CrescimentoPop {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int
                i,
                anos,
                T,
                PA,
                PB;

        double
                G1,
                G2;

        T = input.nextInt();

        for ( i=0; i<T; i++)
        {
            anos=0;
            PA = input.nextInt();
            PB = input.nextInt();
            G1 = input.nextDouble();
            G2 = input.nextDouble();
            while (PA <= PB && anos<=100)
            {
                PA = (int) (PA + PA*(G1/100));
                PB = (int) (PB + PB*(G2/100));
                anos++;
            }

            if (anos>100) System.out.println("Mais de 1 seculo.");
            else System.out.printf("%d anos.%n", anos);
        }
    }
}
