package com.company;

import java.util.Scanner;

public class ImpeachmentLider {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                N,
                voto,
                count,
                i;

        while (input.hasNext())
        {
            N = input.nextInt();

            for (i=0, count=0; i<N; i++)
            {
                voto = input.nextInt();
                if (voto == 1) count++;
            }

            if (count >= (2*(float)N/3)) System.out.println("impeachment");
            else System.out.println("acusacao arquivada");
        }
    }
}
