package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Soma_Fatoriais {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger
                i,
                M,
                N,
                n;


        while (in.hasNext())
        {
            //reseta o "i";
            i = new BigInteger("1");
            //entrada do usuario
            M = in.nextBigInteger();
            N = in.nextBigInteger();

            //calculo primeiro fatorial
            if (M.equals(BigInteger.valueOf(0)))
            {//excessao do 0;
                M = BigInteger.ONE;

            } else
            {
                for (n=M; n.compareTo(i) == 1; i = i.add(BigInteger.valueOf(1)))
                {
                    M = M.multiply(n.subtract(i));
                }

            }

            //reseta o "i";
            i = new BigInteger("1");

            //calculo segundo fatorial
            if (N.equals(BigInteger.valueOf(0)))
            {//excessao do 0;
                N = BigInteger.ONE;

            } else
            {
                for (n=N; n.compareTo(i) == 1; i = i.add(BigInteger.valueOf(1)))
                {
                    N = N.multiply(n.subtract(i));
                }

            }

            System.out.println(M.add(N));
        }

    }
}
