package com.company;

import java.util.Scanner;

public class PulaSapo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int
                i,
                pulo,
                canos;

        int[]
                alturas;

        String
                jogo="";


        pulo = input.nextInt();
        canos = input.nextInt();

        alturas = new int[canos];

        for (i=0; i<canos; i++)
        {
            alturas[i] = input.nextInt();
        }

        i=1;
        while (jogo != "GAME OVER" && i<canos)
        {
            if (pulo < Math.abs(alturas[i]-alturas[i-1])) jogo="GAME OVER";
            else jogo="YOU WIN";
            i++;
        }

        System.out.println(jogo);
    }
}
