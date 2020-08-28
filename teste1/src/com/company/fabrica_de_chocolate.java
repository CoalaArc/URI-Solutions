package com.company;

import java.util.Scanner;

public class fabrica_de_chocolate {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int
                a,
                b,
                c;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        while (a > 0 && b > 0 && c > 0)
        {
            System.out.printf("%d%n", (int)Math.cbrt(a*b*c));

            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
        }
    }
}
