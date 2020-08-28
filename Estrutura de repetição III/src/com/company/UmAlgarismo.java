package com.company;

import java.util.Scanner;

public class UmAlgarismo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String
                M,
                N;
        int
                i,
                somaN,
                somaM;

        N = input.next();
        M = input.next();

        while (N.intern() != "0" || M.intern() != "0")
        {// ¬(N=0 ^ M=0) --> N!=0 v M!=0;
            while (N.length() != 1)
            {
                for (i=0, somaN=0; i<N.length(); i++)
                {
                    somaN = somaN + (N.charAt(i) - 48);
                }
                N =  String.valueOf(somaN);
            }
            while (M.length() != 1)
            {
                for (i=0, somaM=0; i<M.length(); i++)
                {
                    somaM = somaM + (M.charAt(i) - 48);
                }
                M =  String.valueOf(somaM);
            }
            somaN = Integer.parseInt(N);
            somaM = Integer.parseInt(M);

            if (somaM == somaN) System.out.println(0);
            else if (somaN > somaM) System.out.println(1);
            else System.out.println(2);

            //restart;
            N = input.next();
            M = input.next();
        }
    }
}
