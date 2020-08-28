package com.company;

import java.util.Scanner;

public class RestoDivisao {

    public static void main(String[] args) {

        int x, y, i;
        Scanner input = new Scanner(System.in);

        x = input.nextInt();
        y = input.nextInt();


        if (x>y)
        {
            int[] n = new int[Math.abs(x-y)-1];

            for (i=0; y<(x-1); i++, y++)
            {
                n[i] = y+1;
            }
            for (int dividendo :
                    n) {
                if (dividendo % 5 == 2 || dividendo % 5 == 3)
                {
                    System.out.println(dividendo);
                }
            }
        } else if (x<y)
        {
            int[] n = new int[Math.abs(x-y)-1];

            for (i=0; x<(y-1); i++, x++)
            {
                n[i] = x+1;
            }
            for (int dividendo : n)
            {
                if (dividendo%5 == 2 || dividendo%5 == 3)
                {
                    System.out.println(dividendo);
                }
            }
        }
    }
}
