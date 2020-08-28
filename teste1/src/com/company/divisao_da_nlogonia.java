package com.company;

import java.util.Scanner;

public class divisao_da_nlogonia {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int
                i,
                K,
                N,
                M,
                x,
                y;

        K = input.nextInt();
        while (K != 0)
        {
            {
                N = input.nextInt();
                M = input.nextInt();

                for (i=0; i<K; i++)
                {
                    x = input.nextInt();
                    y = input.nextInt();

                    if (x == N || y == M) System.out.println("divisa");
                    else if (x<N && y>M) System.out.println("NO");
                    else if (x>N && y>M) System.out.println("NE");
                    else if (x>N && y<M) System.out.println("SE");
                    else if (x<N && y<M) System.out.println("SO");
                }


            }
            K = input.nextInt();
        }

    }
}
