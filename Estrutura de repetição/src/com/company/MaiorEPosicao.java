package com.company;

import java.util.Scanner;

public class MaiorEPosicao {

    public static void main(String[] args)
    {
        int Major=0, Position=1;
        int[] V;

        Scanner input = new Scanner(System.in);

        V = new int[100];

        for (int i=0; i < V.length; i++)
        {
            V[i] = input.nextInt();

            if (V[i] > Major)
            {
                Major = V[i];
                Position = i+1;
            }
        }
        System.out.println(Major);
        System.out.println(Position);
    }
}
