package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int
                Const = 100;
        int[]
                idade = new int[Const];

        int
                soma,
                i;
        double
                media;


        for (i = 0, soma = 0; i<Const; i++)
        {
            idade[i] = input.nextInt();

            soma = soma + idade[i];
        }
        media = (double) soma/Const;

        System.out.printf("Media: %.2f%n", media);
        System.out.println("IDADES ACIMA DA MÉDIA.");

        i=0;
        for (int output : idade) {
            if (idade[i] > media) System.out.printf("%d%n", output);
            i++;
        }
    }
}
