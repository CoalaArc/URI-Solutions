package com.company;

import java.util.Scanner;

public class ParesImparesPositivosNegativos {

    public static void main(String[] args)
    {
        int i, N, pos = 0, neg = 0, imp = 0, par = 0;

        Scanner input = new Scanner(System.in);

        for (i = 0; i < 5; i++)
        {
            N = input.nextInt();
            if (N>0)
            {
                pos++;
            } else if (N<0)
            {
                neg++;
            }
            if (N%2 == 0)
            {
                par++;
            } else imp++;
        }

        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", imp);
        System.out.printf("%d valor(es) positivo(s)\n", pos);
        System.out.printf("%d valor(es) negativo(s)\n", neg);
    }
}
