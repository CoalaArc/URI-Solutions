package com.company;

import java.util.Scanner;

public class Competicao {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int
                j,
                fase,
                i,
                N;

        int[]
                faseFinal,
                tempoFrase,
                reacao,
                escrita;

        String
                S;

        // coletando dados
        N = input.nextInt();
        reacao = new int[N];
        escrita = new int[N];
        tempoFrase = new int[N];
        faseFinal = new int[N];

        for (i=0; i<N; i++)
        {
            reacao[i] = input.nextInt();
            escrita[i] = input.nextInt();
        }
        S = input.next();

        for (i=0; i<N; i++)
        {
            tempoFrase[i] = reacao[i] + escrita[i]*S.length();
        }

        //duelos
       
    }
}
