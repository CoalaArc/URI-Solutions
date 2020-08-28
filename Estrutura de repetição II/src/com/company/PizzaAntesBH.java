package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaAntesBH {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int
                j,
                P,
                i,
                N,
                D;
        String
                data;
        boolean
                valida;
        ArrayList<String> dataValida = new ArrayList<>();


        while (input.hasNext())
        {
            N = input.nextInt();
            D = input.nextInt();

            dataValida.removeAll(dataValida);
            for (i=0; i<D; i++)
            {
                data = input.next();
                valida = true;
                for (j=0; j<N; j++)
                {
                    P = input.nextInt();
                    if (P == 0) valida = false;
                }

                if (valida) dataValida.add(data);
            }
            if (dataValida.isEmpty()) System.out.println("Pizza antes de FdI");
            else System.out.println(dataValida.get(0));
        }
    }
}
