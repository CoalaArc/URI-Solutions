package com.company;

import java.util.Scanner;

public class EsquerdaVolver {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int
                soma,
                N,
                D,
                E,
                i;

        String
                Order;


        N = input.nextInt();

        while(N != 0)
        {
            Order = input.next();
            for (i=0, D=0, E=0; i<N; i++)
            {

                if (Order.charAt(i) == 'D')
                {
                    D++;
                    if (D == 4) D=0;
                }
                else if (Order.charAt(i) == 'E')
                {
                    E++;
                    if (E == 4) E=0;
                }
            }

            if (D>=E) soma = D - E;
            else soma = E - D;

            if (soma == 0) System.out.println("N");
            else if (soma == 1) System.out.println("L");
            else if (soma == 2) System.out.println("S");
            else if (soma == 3) System.out.println("O");

            N = input.nextInt();
        }
    }
}
