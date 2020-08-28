package com.company;

import java.util.Scanner;

public class Grenais {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int
                Inter,
                Gremio;

        int
                novoGrenal=1,
                Grenal=0,
                winGremio=0,
                empate=0,
                winInter=0;


        while (novoGrenal == 1)
        {
            Inter = input.nextInt();
            Gremio = input.nextInt();
            if (Inter == Gremio)empate++;
            else if (Inter > Gremio) winInter++;
            else winGremio++;
            Grenal++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            novoGrenal = input.nextInt();

            while (novoGrenal != 1 && novoGrenal !=2)
            {
                System.out.println("Novo grenal (1-sim 2-nao)");
                novoGrenal = input.nextInt();
            }
        }
        System.out.printf("%d grenais", Grenal);
        System.out.printf("Inter:%d", winInter);
        System.out.printf("Gremio:%d", winGremio);


        if (winInter == winGremio) System.out.println("Nao houve vencedor");
        else if (winInter > winGremio) System.out.println("Inter venceu mais");
        else System.out.println("Gremio venceu mais");

    }
}
