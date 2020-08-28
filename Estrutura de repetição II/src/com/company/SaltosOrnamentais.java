package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SaltosOrnamentais {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int
                j,
                i,
                N;
        float
                sum,
                GD;
        String
                nome;
        float[]
                notas = new float[7];

        N = input.nextInt();

        for (i=0; i<N; i++)
        {
            nome = input.next();
            GD = input.nextFloat();
            for (j=0, sum=0; j<7; j++)
            {
                notas[j] = input.nextFloat();
                sum = sum + notas[j];
            }
            Arrays.sort(notas);
            sum = sum - notas[0] - notas[6];

            System.out.printf("%s %.2f%n", nome, sum*GD);
        }
    }
}
