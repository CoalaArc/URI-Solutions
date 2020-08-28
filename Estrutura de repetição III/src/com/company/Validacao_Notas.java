package com.company;

import java.util.Scanner;

public class Validacao_Notas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double
                n1,
                n2;

        int
                flag=1;

        while (flag == 1)
        {
            n1 = -1;
            n2 = -1;
            //entrada e validacao de notas;
            while (n1 < 0 || n1 > 10)
            {
                n1 = in.nextDouble();
                if (n1 < 0 || n1 > 10) System.out.println("nota invalida");
            }
            while (n2 < 0 || n2 > 10)
            {
                n2 = in.nextDouble();
                if (n2 < 0 || n2 > 10) System.out.println("nota invalida");
            }
            System.out.printf("media = %.2f%n", (n1+n2)/2);



            System.out.println("novo calculo (1-sim 2-nao)");
            flag = in.nextInt();
            while (flag != 1 && flag != 2)
            {
                System.out.println("novo calculo (1-sim 2-nao)");
                flag = in.nextInt();
            }
        }
    }
}
