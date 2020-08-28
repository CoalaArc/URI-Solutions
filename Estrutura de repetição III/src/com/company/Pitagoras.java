package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Pitagoras {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int
                mdc=1,
                i;
        int[]
                numeros = new int[3];

        boolean
                triplaPitP = false,
                triplaPit = false;

        while (in.hasNext())
        {
            for (i=0; i<3; i++) numeros[i] = in.nextInt();
            Arrays.sort(numeros);


            if (Math.pow(numeros[2],2) == Math.pow(numeros[0],2) + Math.pow(numeros[1],2))
            {
                triplaPit = true;
                //Calculo do mdc
                i = 1;
                while (i<numeros[0])
                {
                    if (numeros[0]%i == 0 && numeros[1]%i == 0 && numeros[2]%i == 0) mdc=i;
                    i++;
                }
                if (mdc == 1) triplaPitP = true;
            }

            if (triplaPitP)
            {
                System.out.println("tripla pitagorica primitiva");
            } else if (triplaPit)
            {
                System.out.println("tripla pitagorica");
            } else {
                System.out.println("tripla");
            }

            triplaPit = false;
            triplaPitP = false;
        }
    }
}
