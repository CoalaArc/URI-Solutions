package com.company;

import java.util.Scanner;

public class Validacao_de_Nota {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        float n1, n2;

        n1 = input.nextFloat();
        while (n1<0 || n1>10)
        {
            System.out.println("nota invalida");
            n1 = input.nextFloat();
        }

        n2 = input.nextFloat();
        while (n2<0 || n2>10)
        {
            System.out.println("nota invalida");
            n2 = input.nextFloat();
        }

        System.out.printf("media = %.2f%n", (n1+n2)/2);
    }
}
