package com.company;

import java.util.Scanner;

public class VezDeQuem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int
                n1,
                n2,
                i,
                qt;
        String
                opcao1,
                opcao2,
                player1,
                player2;

        qt = input.nextInt();

        for (i=0; i<qt; i++)
        {
            player1 = input.next();
            opcao1 = input.next();

            player2 = input.next();
            opcao2 = input.next();

            n1 = input.nextInt();
            n2 = input.nextInt();

            if ((n1+n2)%2 == 0)
            {
                if (opcao1.intern() == "PAR") System.out.println(player1);
                else System.out.println(player2);
            } else
            {
                if (opcao2.intern() == "IMPAR") System.out.println(player2);
                else System.out.println(player1);
            }

        }
    }
}
