package com.company;

import java.util.Scanner;

public class PositivosMedia {

    public static void main(String[] args)
    {
        int i, qtd;
        float pos, N;
        Scanner input = new Scanner(System.in);

        for (pos = 0, i = 0, qtd = 0; i < 6; i++)
        {
            N = input.nextFloat();
            if (N>0)
            {
                pos += N;
                qtd++;
            }
        }

        System.out.printf("%d valores positivos\n", qtd);
        System.out.printf("%.1f\n", pos/qtd );
    }
}
