package com.company;

import java.util.Scanner;

public class SequenciaLogica2 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x, y, i, br;

        x = input.nextInt();
        y = input.nextInt();

        for (i=1, br=1; i<=y; i++, br++)
        {
            if (i == y)
            {
                if (br == x)
                {
                    System.out.printf("%d%n", i);
                }else
                System.out.printf("%d%n",i);
            }else
            {
                if (br == x)
                {
                    System.out.printf("%d%n", i);
                    br=0;
                }else
                System.out.printf("%d ", i);
            }

        }
    }
}
