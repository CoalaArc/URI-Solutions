package com.company;

import java.util.Scanner;

public class PokemonsBattle {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int
                T,
                bonus,
                A1,
                A2,
                D1,
                D2,
                L1,
                L2;
        double
                Golpe1,
                Golpe2;

        T = input.nextInt();

        for (int i=0; i<T; i++)
        {
            Golpe1=0;
            Golpe2=0;
            bonus = input.nextInt();
            A1 = input.nextInt();
            D1 = input.nextInt();
            L1 = input.nextInt();
            A2 = input.nextInt();
            D2 = input.nextInt();
            L2 = input.nextInt();

            if (L1%2 == 0) Golpe1 = bonus;
            if (L2%2 == 0) Golpe2 = bonus;
            Golpe1 += (A1+D1)/2;
            Golpe2 += (A2+D2)/2;

            if (Golpe1 == Golpe2) System.out.println("Empate");
            else if (Golpe1 > Golpe2) System.out.println("Dabriel");
            else System.out.println("Guarte");
        }
    }
}
