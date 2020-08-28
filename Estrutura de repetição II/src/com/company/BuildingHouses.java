package com.company;

import java.util.Scanner;

public class BuildingHouses {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                a,
                b,
                c;

        double
                aresta,
                terreno;

        a = input.nextInt();
        while (a != 0)
        {
         b = input.nextInt();
         c = input.nextInt();

         terreno = (a*b)/((double)c/100);
         aresta = Math.sqrt(terreno);

            System.out.printf("%.2f%n", aresta);

         a = input.nextInt();
        }

    }
}
