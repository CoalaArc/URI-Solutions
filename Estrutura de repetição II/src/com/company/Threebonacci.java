package com.company;

import java.util.Scanner;
import java.math.BigInteger;

public class Threebonacci {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        BigInteger
                threebonacci,
                ant,
                prox,
                atual;
        int
                n,
                i=0;

        while (input.hasNext())
        {
            n = input.nextInt();
            //reseta para um próximo teste
            i=0;
            threebonacci= new BigInteger("0");
            ant=new BigInteger("0");
            atual=new BigInteger("1");

            while (i<n)
            {
                prox = ant.add(atual);
                ant = atual;
                atual = prox;
                if (atual.remainder(new BigInteger("3")).compareTo(new BigInteger("0")) == 0 || atual.toString().indexOf("3") != -1)
                {
                    threebonacci = atual;
                    i++;
                }
            }

            System.out.printf("%d%n", threebonacci);
        }
    }
}
